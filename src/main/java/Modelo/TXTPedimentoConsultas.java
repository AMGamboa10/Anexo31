package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TXTPedimentoConsultas extends Conexion{
    
    ConexionBaseAF conexionAF = new ConexionBaseAF();
    
    
    public boolean registrar(TXTPedimento txtP){
        ResultSet rsRec = null;
        ResultSet rsRec2 = null;
        ResultSet rsRec3 = null;
        ResultSet rsRecTiene = null;
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Insert into txtpedimento (Tipo, Patente, Pedimento, Seccion, Regimen, Año, Bimestre, Validado, NameTXT)" 
                        + "Value (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try {
            
            String pedimento = String.valueOf(Integer.parseInt(txtP.getPedimento()));
            rsRecTiene = tieneRectificacion(txtP.getPatente(), pedimento, txtP.getSeccion(), txtP.getAño());
            rsRec = rectificacion(txtP.getPatente(), pedimento, txtP.getAño(), txtP.getSeccion());
            if (rsRec.next()) {
                
                String bimestrePedRec = sacarBimestre(rsRec.getString("MesRec"));
                //Sacamos el bimestre del pedimento anterior.
                String bimestrePedOrig = sacarBimestre(rsRec.getString("MesAnterior"));
                
                JOptionPane.showMessageDialog(null, "Se detecto que el pedimento " + pedimento + " es una rectificacion \n" +
                        "Se agregara el pedimento original " + rsRec.getString("PedimentoOriginal") + " al bimestre "+ bimestrePedOrig + "\n" +
                        "Se agregara el pedimento rectificado " + pedimento + " al bimestre " + bimestrePedRec ,
                        "Pedimento rectificado", JOptionPane.INFORMATION_MESSAGE);
                //Aqui agregamos la rectificacion
                ps = null;
                ps = con.prepareStatement(sql);
                ps.setString(1, txtP.getTipo());
                ps.setString(2, txtP.getPatente());
                ps.setString(3, txtP.getPedimento());
                ps.setString(4, txtP.getSeccion());
                ps.setString(5, txtP.getRegimen());
                ps.setInt(6, txtP.getAño());
                ps.setString(7, bimestrePedRec);
                ps.setBoolean(8, false);
                if (bimestrePedOrig.equals(bimestrePedRec)) {
                    ps.setString(9, txtP.getNombreTXT());
                }else{
                    ps.setString(9, "");
                }
                ps.execute();
                
                
                //Si se encontro que tenia rectificacion, se agrega el ped anterior
                //Aqui se agrega el pedimento anterior
                ps = null;
                ps = con.prepareStatement(sql);
                ps.setString(1, txtP.getTipo());
                ps.setString(2, rsRec.getString("PatenteAnterior"));
                ps.setString(3, rsRec.getString("Pedimentoanterior"));
                ps.setString(4, rsRec.getString("SeccionAduaneraAnterior"));
                ps.setString(5, rsRec.getString("DocumentoAnterior"));
                ps.setInt(6, Integer.parseInt(rsRec.getString("Añoanterior")));
                ps.setString(7, bimestrePedOrig);
                ps.setBoolean(8, false);
                ps.setString(9, txtP.getNombreTXT());
                ps.execute();
                
                rsRec2 = rectificacion(rsRec.getString("PatenteAnterior"), rsRec.getString("PedimentoAnterior"),
                        Integer.parseInt(rsRec.getString("Añoanterior")), rsRec.getString("SeccionAduaneraAnterior"));
                
                if (rsRec2.next()) {
                    bimestrePedOrig = sacarBimestre(rsRec2.getString("MesAnterior"));
                    
                    JOptionPane.showMessageDialog(null, "Se agrego pedimento original " + rsRec2.getString("PedimentoAnterior") + " al bimestre" + bimestrePedOrig +  " \n"
                            + " y el rectificado " + rsRec.getString("PedimentoAnterior") + " al bimestre" + bimestrePedRec );
                    
                    ps = null;
                    ps = con.prepareStatement(sql);
                    ps.setString(1, txtP.getTipo());
                    ps.setString(2, rsRec2.getString("PatenteAnterior"));
                    ps.setString(3, rsRec2.getString("Pedimentoanterior"));
                    ps.setString(4, rsRec2.getString("SeccionAduaneraAnterior"));
                    ps.setString(5, rsRec2.getString("DocumentoAnterior"));
                    ps.setInt(6, Integer.parseInt(rsRec2.getString("Añoanterior")));
                    ps.setString(7, bimestrePedOrig);
                    ps.setBoolean(8, false);
                    ps.setString(9, txtP.getNombreTXT());
                    ps.execute();
                    
                    rsRec3 = rectificacion(rsRec2.getString("PatenteAnterior"), rsRec2.getString("PedimentoAnterior"), 
                            Integer.parseInt(rsRec2.getString("Añoanterior")), rsRec2.getString("SeccionAduaneraAnterior"));
                    if (rsRec3.next()) {
                        
                        bimestrePedOrig = sacarBimestre(rsRec3.getString("MesAnterior"));
                        JOptionPane.showMessageDialog(null, "El pedimento " + rsRec2.getString("PedimentoAnterior") +  " es una rectificacion. \n"
                                + "Se agrego pedimento original " + rsRec3.getString("PedimentoAnterior") + " al bimestre" + bimestrePedOrig +  " y el rectificado al " + bimestrePedRec );
                        

                        ps = null;
                        ps = con.prepareStatement(sql);
                        ps.setString(1, txtP.getTipo());
                        ps.setString(2, rsRec3.getString("PatenteAnterior"));
                        ps.setString(3, rsRec3.getString("Pedimentoanterior"));
                        ps.setString(4, rsRec3.getString("SeccionAduaneraAnterior"));
                        ps.setString(5, rsRec3.getString("DocumentoAnterior"));
                        ps.setInt(6, Integer.parseInt(rsRec3.getString("Añoanterior")));
                        ps.setString(7, bimestrePedOrig);
                        ps.setBoolean(8, false);
                        ps.setString(9, txtP.getNombreTXT());
                        ps.execute();
                    }
                }
                
                return true;
                    
            }else if(rsRecTiene.next()){
                String bimestrePedRec = sacarBimestre(rsRecTiene.getString("MesActual"));
                String bimestrePedOrig = sacarBimestre(rsRecTiene.getString("MesAnterior"));
                
                JOptionPane.showMessageDialog(null, "El pedimento " + txtP.getPedimento() + " tiene una rectificacion. \n"
                            + "Se agrego pedimento rectificado " + rsRecTiene.getString("Pedimento") + " al bimestre " + bimestrePedRec,
                        "Pedimento rectificado", JOptionPane.INFORMATION_MESSAGE);
                
                ps = null;
                ps = con.prepareStatement(sql);
                ps.setString(1, txtP.getTipo());
                ps.setString(2, txtP.getPatente());
                ps.setString(3, txtP.getPedimento());
                ps.setString(4, txtP.getSeccion());
                ps.setString(5, txtP.getRegimen());
                ps.setInt(6, txtP.getAño());
                ps.setString(7, bimestrePedOrig);
                ps.setBoolean(8, false);
                ps.setString(9, txtP.getNombreTXT());
                
                ps.execute();
                
                
                //Si se encontro que tenia rectificacion, se agrega el ped anterior
                //Aqui se agrega el pedimento anterior
                ps = null;
                ps = con.prepareStatement(sql);
                ps.setString(1, txtP.getTipo());
                ps.setString(2, rsRecTiene.getString("Patente"));
                ps.setString(3, rsRecTiene.getString("Pedimento"));
                ps.setString(4, rsRecTiene.getString("SeccionAduanera"));
                ps.setString(5, rsRecTiene.getString("ClaveDocumento"));
                ps.setInt(6, Integer.parseInt(rsRecTiene.getString("AñoActual")));
                ps.setString(7, bimestrePedRec);
                ps.setBoolean(8, false);
                if (bimestrePedOrig.equals(bimestrePedRec)) {
                    ps.setString(9, txtP.getNombreTXT());
                }else{
                    ps.setString(9, "");
                }
                ps.execute();
                
                return true;
            }
            else {
                
                ps = null;
                ps = con.prepareStatement(sql);
                ps.setString(1, txtP.getTipo());
                ps.setString(2, txtP.getPatente());
                ps.setString(3, txtP.getPedimento());
                ps.setString(4, txtP.getSeccion());
                ps.setString(5, txtP.getRegimen());
                ps.setInt(6, txtP.getAño());
                ps.setString(7, txtP.getBimestre());
                ps.setBoolean(8, false);
                ps.setString(9, txtP.getNombreTXT());
                ps.execute();
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
    }
    
    public boolean actualizar(TXTPedimento txtP){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        
        String sql = "Update txtPedimento set Patente = ?, Pedimento = ?, Seccion = ?, Regimen = ?, Año = ?, Bimestre = ? where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, txtP.getPatente());
            ps.setString(2, txtP.getPedimento());
            ps.setString(3, txtP.getSeccion());
            ps.setString(4, txtP.getRegimen());
            ps.setInt(5, txtP.getAño());
            ps.setString(6, txtP.getBimestre());
            ps.setInt(7, txtP.getId());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL: Error actualizacion registro pedimento", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
    public boolean eliminar(TXTPedimento txtP){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        
        String sql = "delete from txtpedimento where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtP.getId());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL: Eliminar registro pedimento", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean buscar(TXTPedimento txtP){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        
        String sql = "select * from txtpedimento where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtP.getId());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                txtP.setId(Integer.parseInt(rs.getString("id")));
                txtP.setTipo(rs.getString("Tipo"));
                txtP.setPatente(rs.getString("Patente"));
                txtP.setPedimento(rs.getString("Pedimento"));
                txtP.setSeccion(rs.getString("Seccion"));
                txtP.setRegimen(rs.getString("Regimen"));
                txtP.setAño(Integer.parseInt(rs.getString("Año")));
                txtP.setBimestre(rs.getString("Bimestre"));
                txtP.setValidado(rs.getString("Validado"));
                txtP.setNombreTXT(rs.getString("NameTXT"));
            }
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public ResultSet rectificacion(String patente, String pedimento, int año, String seccionAduanera){
        PreparedStatement psRec = null;
        ResultSet rsRec = null;
        Connection conAF = conexionAF.getConexionAF();
        
        String sqlRectificacion = "Select year(FechaOperacionAnterior) as 'Añoanterior', SeccionAduaneraAnterior, PatenteAnterior, PedimentoAnterior, " +
        "month(FechaOperacionAnterior) as 'MesAnterior', month(FechaPagoReal) as 'MesRec',  DocumentoAnterior from glosa701 "
                + "where Patente = ? and Pedimento = ? and year(fechapago) = ? and SeccionAduanera = ?;";
        
        try {
            psRec = conAF.prepareStatement(sqlRectificacion);
            psRec.setString(1, patente);
            psRec.setString(2, pedimento);
            psRec.setInt(3, año);
            psRec.setString(4, seccionAduanera);
            rsRec = psRec.executeQuery();
            return rsRec;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ResultSet tieneRectificacion(String patente, String pedimento, String seccionAduanera, int año){
        PreparedStatement psRec = null;
        ResultSet rsRecTiene = null;
        Connection conAF = conexionAF.getConexionAF();
        
        String sqlRectificacion = "Select year(FechaPagoReal) as 'AñoActual', SeccionAduanera, Patente, Pedimento, " +
                "month(FechaOperacionAnterior) as 'MesAnterior', month(FechaPagoReal) as 'MesActual',  ClaveDocumento from glosa701 " +
                "where PatenteAnterior = ? and PedimentoAnterior = ? and SeccionAduaneraAnterior = ? and year(FechaOperacionAnterior) = ?;";
        
        try {
            psRec = conAF.prepareStatement(sqlRectificacion);
            psRec.setString(1, patente);
            psRec.setString(2, pedimento);
            psRec.setString(3, seccionAduanera);
            psRec.setInt(4, año);
            rsRecTiene = psRec.executeQuery();
            return rsRecTiene;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String sacarBimestre(String mes){
        
        String bimestre = "";
        
        switch(Integer.parseInt(mes)){
                    case 1:
                        bimestre = "37";
                        break;
                    case 2:
                        bimestre = "37";
                        break;
                    case 3:
                        bimestre = "38";
                        break;
                    case 4:
                        bimestre = "38";
                        break;
                    case 5:
                        bimestre = "39";
                        break;
                    case 6:
                        bimestre = "39";
                        break;
                    case 7:
                        bimestre = "40";
                        break;
                    case 8:
                        bimestre = "40";
                        break;
                    case 9:
                        bimestre = "41";
                        break;
                    case 10:
                        bimestre = "41";
                        break;
                    case 11:
                        bimestre = "42";
                        break;
                    case 12:
                        bimestre = "42";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error al sacar el bimestre, notificar al administrador");
                        System.out.println("Error al sacar el bimestre");
                }
        return bimestre;
    }
    
    //Hacemos consutla de los años y lo agregamos a una lista
    
    public ArrayList validarPedimentoTXTvsGlosa(TXTPedimento txtPedimento){
    
        
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        Connection conAF = conexionAF.getConexionAF();
        PreparedStatement psAF = null;
        ResultSet rsAF = null;
        
        String tipo, patente, pedimento, aduana, regimen, validacionvsGlosa;
        int n = 1;
        int año;
        
        String sqlTXT = "Select * from txtpedimento where año = ? and bimestre = ?";
        String sqlGlosa = "Select pedimento from glosa501 where pedimento = ? and patente = ? and SeccionAduanera = ? and year(FechaPagoReal) = ?";
        
        
        //Creamos nuestro array
        ArrayList<VPedimentoTXT> lista = new ArrayList<VPedimentoTXT>();
        try {
            ps = con.prepareStatement(sqlTXT);
            ps.setInt(1, txtPedimento.getAño());
            ps.setString(2, txtPedimento.getBimestre().substring(3, 5));
            rs = ps.executeQuery();
            
            while (rs.next()) {             
                
                tipo = rs.getString("Tipo");
                patente = rs.getString("Patente");
                pedimento = rs.getString("Pedimento");
                aduana = rs.getString("Seccion");
                regimen = rs.getString("Regimen");
                año = Integer.parseInt(rs.getString("Año"));
                
                psAF = conAF.prepareStatement(sqlGlosa);
                psAF.setString(1, pedimento);
                psAF.setString(2, patente);
                psAF.setString(3, aduana);
                psAF.setInt(4, año);
                rsAF = psAF.executeQuery();
                
                if (rsAF.next()) {    
                    validacionvsGlosa = "Encontrado";
                }else{
                    validacionvsGlosa  = "No encontrado";
                }
                
                VPedimentoTXT pedimentoTXT = new VPedimentoTXT(tipo, patente, pedimento, aduana, regimen, validacionvsGlosa);
                lista.add(pedimentoTXT);
                
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL(ValidarPedimentoTXTvsGlosa)", JOptionPane.ERROR_MESSAGE);
            return lista;
        }
        
        
        
    }
    
    public ArrayList validarPedimentoGlosavsTXT(TXTPedimento txtPedimento){
        
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        Connection conAF = conexionAF.getConexionAF();
        PreparedStatement psAF = null;
        ResultSet rsAF = null;
        
        String patente, pedimento, aduana, regimen, fechaPago, validacionvsTXT;
        int año;
        int n = 1;
        int mes1 = 0;
        int mes2 = 0;
        
        String sqlGlosa = "Select Patente, Pedimento, SeccionAduanera, ClaveDocumento, year(FechaPagoReal) as year, FechaPagoReal from glosa551 " 
                + "where year(FechaPagoReal) = ? and month(FechaPagoReal) >= ? and month(FechaPagoReal) <= ? " 
                + "and(ClaveDocumento = 'RT' or ClaveDocumento = 'F5' or(ClaveDocumento = 'V1' and TipoOperacion = 2) "
                + "or ClaveDocumento = 'V5' or ClaveDocumento = 'F4' or ClaveDocumento = 'A3') " 
                + "group by pedimento order by Pedimento desc;";
        String sqlTXT = "Select Pedimento from txtpedimento where Pedimento = ? and Patente = ? and Seccion = ? and año = ?;";
        
        
        //Creamos nuestro array
        ArrayList<VPedimentoGlosa> lista = new ArrayList<VPedimentoGlosa>();
        try {
            
            switch(txtPedimento.getBimestre().substring(3, 5)){
                case "37":
                    mes1 = 1;
                    mes2 = 2;
                    break;
                case "38":
                    mes1 = 3;
                    mes2 = 4;
                    break;
                case "39":
                    mes1 = 5;
                    mes2 = 6;
                    break;
                case "40":
                    mes1 = 7;
                    mes2 = 8;
                    break;
                case "41":
                    mes1 = 9;
                    mes2 = 10;
                    break;
                case "42":
                    mes1 = 11;
                    mes2 = 12;
                    break;
                default:
                    System.out.println("Erro al seleccionar el bimestre");
                    JOptionPane.showMessageDialog(null,"Error al seleccionar el bimestre");
            }
            
            psAF = conAF.prepareStatement(sqlGlosa);
            psAF.setInt(1, txtPedimento.getAño());
            psAF.setInt(2, mes1);
            psAF.setInt(3, mes2);
            rsAF = psAF.executeQuery();
            
            while (rsAF.next()) {             
                
                patente = rsAF.getString("Patente");
                pedimento = rsAF.getString("Pedimento");
                aduana = rsAF.getString("SeccionAduanera");
                regimen = rsAF.getString("ClaveDocumento");
                fechaPago = rsAF.getString("FechaPagoReal");
                año = Integer.parseInt(rsAF.getString("year"));
                
                ps = con.prepareStatement(sqlTXT);
                ps.setString(1, pedimento);
                ps.setString(2, patente);
                ps.setString(3, aduana);
                ps.setInt(4, año);
                rs = ps.executeQuery();
                
                if (rs.next()) {
                    validacionvsTXT = "Encontrado";
                    VPedimentoGlosa pedimentoGlosa = new VPedimentoGlosa(patente, pedimento, aduana, regimen, fechaPago, validacionvsTXT);
                    lista.add(pedimentoGlosa);
                    
                }else{
                    validacionvsTXT  = "No encontrado";
                    VPedimentoGlosa pedimentoGlosa = new VPedimentoGlosa(patente, pedimento, aduana, regimen, fechaPago, validacionvsTXT);
                    lista.add(pedimentoGlosa);
                }
                
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL(ValidarPedimentoGlosaVsTXT)", JOptionPane.ERROR_MESSAGE);
            return lista;
        }
    }
    
    public boolean eliminarRegistro(TXTPedimento txtPedimento){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "delete from txtPedimento where año = ? and bimestre = ? and regimen =?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtPedimento.getAño());
            ps.setString(2, txtPedimento.getBimestre());
            ps.setString(3, txtPedimento.getRegimen());
            ps.execute();
            System.out.println("Se elimino el TXT");
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error SQL(Eliminar registro pedimento)", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
    }
    
    public boolean actualizarCandado(TXTPedimento txtPedimento){
        
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        boolean validado;
        
        String sqlPedimento = "Update txtPedimento set validado = ? where año = ? and bimestre = ? and regimen = ?";
        
        try {
            ps = con.prepareStatement(sqlPedimento);
            if (txtPedimento.getValidado().equals("Candadear")) {
                validado = true;
            }else{
                validado = false;
            }
            ps.setBoolean(1, validado);
            ps.setInt(2, txtPedimento.getAño());
            ps.setString(3, txtPedimento.getBimestre());
            ps.setString(4, txtPedimento.getRegimen());
            ps.execute();
            
            System.out.println("TXT candadeado con exito Pedimento");
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL: Consulta candadeo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
