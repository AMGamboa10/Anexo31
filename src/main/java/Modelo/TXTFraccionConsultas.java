package Modelo;

import Controlador.CtrlTXT;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TXTFraccionConsultas extends Conexion  {
    
    ConexionBaseAF conexionAF = new ConexionBaseAF();
    
    
    public boolean registrar(TXTFraccion txtF){
        boolean valorCero = false;
        boolean fraccionCarrito = false;
        
        if (txtF.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "La fraccion " + txtF.getFraccion() + " tiene valor 0, favor de validar e intentar de nuevo", "Error fraccion valor 0", JOptionPane.ERROR_MESSAGE);
            valorCero = true;
            eliminarRegistro(txtF);
        }
        if (txtF.getFraccion().substring(0, 4).equals("8704") && txtF.getRegimen().equals("V1")) {
            JOptionPane.showMessageDialog(null, "La fraccion " + txtF.getFraccion() + " corresponde a carrito, favor de validar e intentar de nuevo", "Error fraccion carrito en V1", JOptionPane.ERROR_MESSAGE);
            fraccionCarrito = true;
            eliminarRegistro(txtF);
        }
        
        if (valorCero == false && fraccionCarrito == false) {
            PreparedStatement ps = null;
            Connection con = getConexion();

            String sql = "Insert into txtfraccion (Tipo, Fraccion, Valor, TipoMaterial, Regimen, Año, Bimestre, Validado, NameTXT) " +
                    "Value (?, ?, ?, ?, ?, ?, ?, ?, ?);";

            try {

                ps = con.prepareStatement(sql);
                ps.setString(1, txtF.getTipo());
                ps.setString(2, txtF.getFraccion());
                ps.setDouble(3, txtF.getValor());
                ps.setString(4, txtF.getTipoMaterial());
                ps.setString(5, txtF.getRegimen());
                ps.setInt(6, txtF.getAño());
                ps.setString(7, txtF.getBimestre());
                ps.setBoolean(8, false);
                ps.setString(9, txtF.getNombreTXT());
                ps.execute();
                return true;
                
            } catch (SQLException ex) {
                Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "Error SQL(Registrar fraccion)", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } 
        else {
            return false;
        }
    }
    
    public boolean eliminar(TXTFraccion txtF){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        
        String sql = "delete from txtfraccion where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtF.getId());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL: Eliminar registro fraccion", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean actualizar(TXTFraccion txtF){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        
        String sql = "Update txtFraccion set Fraccion = ?, Valor = ?, TipoMaterial = ?, Regimen = ?, Año = ?, Bimestre = ? where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, txtF.getFraccion());
            ps.setDouble(2, txtF.getValor());
            ps.setString(3, txtF.getTipoMaterial());
            ps.setString(4, txtF.getRegimen());
            ps.setInt(5, txtF.getAño());
            ps.setString(6, txtF.getBimestre());
            ps.setInt(7, txtF.getId());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL: Registrar TXT", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
    public boolean buscar(TXTFraccion txtF){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        
        
        String sql = "select * from txtfraccion where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtF.getId());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                txtF.setId(Integer.parseInt(rs.getString("id")));
                txtF.setTipo(rs.getString("Tipo"));
                txtF.setFraccion(rs.getString("Fraccion"));
                txtF.setValor(Double.parseDouble(rs.getString("Valor")));
                txtF.setTipoMaterial(rs.getString("TipoMaterial"));
                txtF.setRegimen(rs.getString("Regimen"));
                txtF.setAño(Integer.parseInt(rs.getString("Año")));
                txtF.setBimestre(rs.getString("Bimestre"));
                txtF.setValidado(rs.getString("Validado"));
                txtF.setNombreTXT(rs.getString("NameTXT"));
            }
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
        
    }
    
    public boolean validarExisteTXT(TXTFraccion txtF){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        
        
        String sql = "Select count(id) as 'Cantidad' from txtfraccion where año = ? and bimestre = ? and regimen = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtF.getAño());
            ps.setString(2, txtF.getBimestre());
            ps.setString(3, txtF.getRegimen());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                //Enviamos el resultado de la cantidad de la consulta al modelo
                txtF.setResultValExisteTXT(Integer.parseInt(rs.getString("Cantidad")));
            }
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL(ValidarExisteTXT)", JOptionPane.ERROR_MESSAGE);
            return false;
        }        
    }
    
    public ArrayList validarSaldos(Saldos Vsaldos){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        Connection conAF = conexionAF.getConexionAF();
        PreparedStatement psAF = null;
        ResultSet rsAF = null;
        
        String fraccion, activofijo, sobreDescargo;
        double saldo, porcentajeDescargo, abono, descargo;
        int n = 1;
        
        String sqlGlosa = "Select Fraccion, sum(ValorComercial) as 'Valor comercial fraccion'"
                + "from glosa551 where FechaPagoReal >= '2015-01-01' and TipoOperacion = '1' and ClaveDocumento != 'F5' group by Fraccion";
        String sqlTXT = "Select Fraccion, sum(valor) as 'Valor descargo', TipoMaterial from txtfraccion where Fraccion = ? group by Fraccion;";
        
        //Creamos la lista donde estaremos ingresando los datos de los saldos
        ArrayList<Saldos> lista = new ArrayList<Saldos>();
        
        try {
            psAF = conAF.prepareStatement(sqlGlosa);
            rsAF = psAF.executeQuery();
            
            while (rsAF.next()) {                
                fraccion = rsAF.getString("Fraccion");
                abono = Double.parseDouble(rsAF.getString("Valor comercial fraccion"));
                
                ps = con.prepareStatement(sqlTXT);
                ps.setString(1, fraccion);
                
                rs = ps.executeQuery();
                
                if (rs.next()) {                    
                    DecimalFormat decimalFormat = new DecimalFormat("#.000");
                    
                    descargo = Double.parseDouble(rs.getString("Valor descargo"));
                    activofijo = rs.getString("TipoMaterial");
                    saldo = abono - descargo;
                    porcentajeDescargo = (descargo / abono) * 100;
                    sobreDescargo = "NO";
                    if (porcentajeDescargo > 100) {
                        sobreDescargo = "SI";
                    }
                    
                    
                    //Mandamos traer el constructor y le pasamos todos nuestros valores
                    Saldos validarSaldos = new Saldos(fraccion, "$ " + decimalFormat.format(abono), 
                            "$ " + decimalFormat.format(descargo), "$ " + decimalFormat.format(saldo), 
                            decimalFormat.format(porcentajeDescargo) + "%", activofijo, sobreDescargo);
                    
                    lista.add(validarSaldos);
                    
                }
                
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL(Validar saldos)", JOptionPane.ERROR_MESSAGE);
            return lista;
        }
        
        
    }
    
    public ArrayList validarFraccion(TXTFraccion txtFraccion) throws ParseException{
        
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        Connection conAF = conexionAF.getConexionAF();
        PreparedStatement psGlosa = null;
        ResultSet rsGlosa = null;
        PreparedStatement psAF = null;
        ResultSet rsAF = null;
        PreparedStatement psAFV1 = null;
        ResultSet rsAFV1 = null;
        
        String fraccion, regimenExpo, tipoMaterial, valFraccion, valAF, primeraImpo;
        int n = 1;
        int mes1 = 0;
        int mes2 = 0;
        
        String sqlTXT = "Select Fraccion, Regimen, TipoMaterial, Año from txtFraccion where año = ? and bimestre = ? group by Fraccion;";
        String sqlGlosa = "Select count(Fraccion) as 'Qty fraccion', month(FechaPagoReal) as 'mes', year(FechaPagoReal) as 'año'," 
                + "FechaPagoReal from Glosa551 where fraccion = ? and TipoOperacion = 1 and FechaPagoReal <= ? " 
                + "group by Fraccion order by FechaPagoReal ASC ";
        String sqlGlosaAF = "Select Fraccion, ClaveDocumento from glosa551 where ClaveDocumento != 'A1' and ClaveDocumento != 'F5' " +
                "and TipoOperacion = '1' and fraccion = ? group by ClaveDocumento order by ClaveDocumento ASC;";
        String sqlGlosaAFV1 = "Select  Glosa551.Pedimento, Glosa551.Fraccion, glosa551.ClaveDocumento as 'Regimen pedimento', glosa507.ClaveCaso as 'Clave fraccion' " 
                + "from glosa551 Left Join glosa507 on glosa551.Pedimento = glosa507.Pedimento " 
                + "where ClaveDocumento = 'V1' and glosa507.ClaveCaso = 'AF' and TipoOperacion = '1' and Fraccion = ? group by ClaveDocumento;";
        
        //Creamos nuestro array
        ArrayList<VFraccion> lista = new ArrayList<VFraccion>();
        try {
            String bimestre = txtFraccion.getBimestre().substring(3,5);
            switch(bimestre){
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
                    System.out.println("Erro al seleccionar el bimestre. "  + TXTFraccionConsultas.class.getName());
                    JOptionPane.showMessageDialog(null, "Error al seleccionar el bimestre", "Seleccionar bimester", JOptionPane.ERROR_MESSAGE);
            }
            
            ps = con.prepareStatement(sqlTXT);
            ps.setInt(1, txtFraccion.getAño());
            ps.setString(2, bimestre);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                fraccion = rs.getString("Fraccion");
                regimenExpo = rs.getString("Regimen");
                tipoMaterial = rs.getString("TipoMaterial");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                
                Date date = formato.parse("01/" +  String.valueOf(mes2) + "/" + String.valueOf(txtFraccion.getAño()));
                long d = date.getTime();
                java.sql.Date fecha = new java.sql.Date(d);
                
                psGlosa = conAF.prepareStatement(sqlGlosa);
                psGlosa.setString(1, fraccion);
                psGlosa.setDate(2, fecha);
                rsGlosa = psGlosa.executeQuery();
                
                if (rsGlosa.next()) {
                    if (fraccion.equals("39169005")) {
                        System.err.println("Fraccion");
                    }
                    primeraImpo = rsGlosa.getString("FechaPagoReal");
                    int añoImpo = Integer.parseInt(rsGlosa.getString("año"));
                    int mesImpo = Integer.parseInt(rsGlosa.getString("mes"));
                    
                    if (Integer.parseInt(rsGlosa.getString("Qty Fraccion")) >= 1) {
                        if (txtFraccion.getAño() == añoImpo &&  (mes1 == mesImpo || mes2 == mesImpo)) {
                            valFraccion = "Fraccion nueva";
                            valAF = "No es fraccion AF";
                        }else{
                            valFraccion = "Fraccion antigua";
                            valAF = "No es fraccion AF";
                        }
                    } else {
                        valFraccion  = "No encontrada";
                        valAF = "No encontrada";
                    }
                    
                                        
                    
                    psAFV1 = conAF.prepareStatement(sqlGlosaAFV1);
                    psAFV1.setString(1, fraccion);
                    rsAFV1 = psAFV1.executeQuery();
                    
                    //Recorremos query para sacar fracciones AF de V1
                    if (valAF.equals("No es fraccion AF")) {
                        
                        if (rsAFV1.next()) {
                            if (rsAFV1.getString("Clave fraccion").equals("AF")) {
                                valAF = "Es fraccion AF";
                            }
                        }
                        psAF = conAF.prepareStatement(sqlGlosaAF);
                        psAF.setString(1, fraccion);
                        rsAF = psAF.executeQuery();

                        while (rsAF.next()) {
                            if (rsAF.getString("ClaveDocumento").equals("AF")) {
                                valAF = "Es fraccion AF";
                            }
                            if (rsAF.getString("ClaveDocumento").equals("IN") && valAF.equals("Es fraccion AF")) {
                                valAF = "Fraccion AF e IN";
                            }
                            if (rsAF.getString("ClaveDocumento").equals("V1") && valAF.equals("Fraccion AF e IN")) {
                                valAF = "Fraccion AF, IN y V1";
                            }
                        }
                    }

                    VFraccion vFraccion = new VFraccion(fraccion, regimenExpo, tipoMaterial, valFraccion, valAF, primeraImpo);
                    lista.add(vFraccion);
                }
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL(Validar fraccion)", JOptionPane.ERROR_MESSAGE);
            return lista;
        }
        
    }
    
    public boolean eliminarRegistro(TXTFraccion txtF){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "delete from txtfraccion where año = ? and bimestre = ? and regimen =?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtF.getAño());
            ps.setString(2, txtF.getBimestre());
            ps.setString(3, txtF.getRegimen());
            ps.execute();
            System.out.println("Se elimino el registro");
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error SQL(Eliminar registro fraccion)", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
    }
    
    public boolean crearTXT(TXTFraccion txtF){
        
        PreparedStatement ps = null;
        ResultSet rs = null;      
        Connection con = getConexion();
        String nombreArchivo = "";
        String sql = "Select * from txtfraccion where año = ? and regimen = ? and bimestre = ? union " +
                "Select * from txtpedimento where año = ? and regimen = ? and bimestre = ?;";
        String sqlNombreArchvio = "Select NameTXT from txtfraccion where año = ? and regimen = ? and bimestre = ? ";
        
        try {
            
            ps = con.prepareStatement(sqlNombreArchvio);
            ps.setInt(1, txtF.getAño());
            ps.setString(2, txtF.getRegimen());
            ps.setString(3, txtF.getBimestre());
            rs = ps.executeQuery();
            if (rs.next()) {
                nombreArchivo = rs.getString("NameTXT");
            }
            
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtF.getAño());
            ps.setString(2, txtF.getRegimen());
            ps.setString(3, txtF.getBimestre());
            ps.setInt(4, txtF.getAño());
            ps.setString(5, txtF.getRegimen());
            ps.setString(6, txtF.getBimestre());
            rs = ps.executeQuery();
            
            
            String destino = "O:\\Mexico\\Trade Compliance\\NPS_ CUMPLIMIENTO LEGAL E IMMEX\\ANEXO 31\\Informes de Descargo\\TXTs Automatizacion\\" + txtF.getAño() + "\\" + txtF.getBimestre() + "\\";
            
            File folder = new File(destino);
            
            if (!folder.exists()) {
                folder.mkdirs();
            }
            
            FileWriter fw = new FileWriter(destino + nombreArchivo);
            fw.flush();
            
            if (rs.next()) {
                
                fw.write("02|" + txtF.getRegimen() + "|" + txtF.getAño() + "|" + txtF.getBimestre() + "|" + "\r\n");
                fw.write(
                        rs.getString("Tipo") + "|" + rs.getString("Fraccion") + "|" + rs.getString("Valor") + "|" + rs.getString("TipoMaterial") + "\r\n"
                    );
                
                while (rs.next()) {
                    fw.write(
                        rs.getString("Tipo") + "|" + rs.getString("Fraccion") + "|" + rs.getString("Valor") + "|" + rs.getString("TipoMaterial") + "\r\n"
                    );
                }
                fw.close();
                abrirArchivo(destino);
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro TXT en la base de datos");
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "SQL Error(Fraccion Consultas)", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean validacionCandado(TXTFraccion txtF){
        
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        boolean validado = true;
        
        String sql = "Select validado from txtfraccion where año = ? and regimen = ? and bimestre = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtF.getAño());
            ps.setString(2, txtF.getRegimen());
            ps.setString(3, txtF.getBimestre());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (rs.getString("Validado").equals("1")) {
                    validado = true;
                }else{
                    validado = false;
                }
            }
            return validado;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error consulta validacion", JOptionPane.ERROR_MESSAGE);
            return true;
        }
       
    }
    
    public ArrayList buscarTXT(TXTFraccion txtF){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection con = getConexion();
        
        String tipo, fraccion, tipoMaterial, regimen, bimestre;
        Double valor;
        int año, id;
        String validado;
        ArrayList<TXTFraccion> lista = new ArrayList<TXTFraccion>();
        
        String sql = "Select * from txtfraccion where año = ? and regimen = ? and bimestre = ? union " +
                "Select * from txtpedimento where año = ? and regimen = ? and bimestre = ?;";
        
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, txtF.getAño());
            ps.setString(2, txtF.getRegimen());
            ps.setString(3, txtF.getBimestre());
            ps.setInt(4, txtF.getAño());
            ps.setString(5, txtF.getRegimen());
            ps.setString(6, txtF.getBimestre());
            rs = ps.executeQuery();
            
            DecimalFormat decimalFormat = new DecimalFormat("#.000");
            int n = 1;
            while (rs.next()) {
                
                id = Integer.parseInt(rs.getString("id"));
                tipo = rs.getString("Tipo");
                fraccion = rs.getString("Fraccion");
                tipoMaterial = rs.getString("TipoMaterial");
                regimen = rs.getString("Regimen");
                bimestre = rs.getString("Bimestre");
                valor = Double.parseDouble(rs.getString("Valor"));
                año = Integer.parseInt(rs.getString("Año"));
                
                //Mandamos el nombre del TXT modelo de Fraccion para tenero y poder eliminarlo
                txtF.setNombreTXT(rs.getString("NameTXT"));
                
                if (rs.getString("Validado").equals("1")) {
                    validado = "Candadeado";
                }else{
                    validado = "Sin candado";
                }
                
                
                TXTFraccion txtFraccion = new TXTFraccion(id, tipo, fraccion, valor, tipoMaterial, regimen, año, bimestre, validado);
                lista.add(txtFraccion);
            }
            
            if (lista.size() == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro informacion con los parametros seleccionados");
            }
            
            
            
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            return lista;
        }
        
    }
    
    public void abrirArchivo(String url){
        
        try {
            File objetofile = new File (url);
            if(objetofile.exists()){
                Desktop.getDesktop().open(objetofile);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro archivo");
            }
            
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
    //Actualizar si esta candadeado o no
    public boolean actualizarCandado(TXTFraccion txtF){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        boolean validado;
        
        String sqlFraccion = "Update txtFraccion set validado = ? where año = ? and bimestre = ? and regimen = ?";
        
        try {
            ps = con.prepareStatement(sqlFraccion);
            if (txtF.getValidado().equals("Candadear")) {
                validado = true;
            }else{
                validado = false;
            }
            ps.setBoolean(1, validado);
            ps.setInt(2, txtF.getAño());
            ps.setString(3, txtF.getBimestre());
            ps.setString(4, txtF.getRegimen());
            ps.execute();
            
            System.out.println("TXT candadeado con exito fraccion");
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL: Consulta candadeo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
        
    }
    
    public ArrayList listarAño(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "Select año from txtfraccion group by año";
        
        //Creamos nuestro array
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Seleccionar");
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                lista.add(rs.getString("año"));
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
        
        return lista;
    }
    
    public ArrayList listarBimestre(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "Select bimestre from txtfraccion group by bimestre order by bimestre ASC";
        
        //Creamos nuestro array
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Seleccionar");
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            
            while(rs.next()){
                String bimestre = rs.getString("bimestre");
                switch(bimestre){
                    case "37":
                        lista.add("B1(" + bimestre + ")");
                        break;
                        
                    case "38":
                        lista.add("B2(" + bimestre + ")");
                        break;
                        
                    case "39":
                        lista.add("B3(" + bimestre + ")");
                        break;
                        
                    case "40":
                        lista.add("B4(" + bimestre + ")");
                        break;
                        
                    case "41":
                        lista.add("B5(" + bimestre + ")");
                        break;
                        
                    case "42":
                        lista.add("B6(" + bimestre + ")");
                        break;
                    
                    default:
                        System.err.println("Error al traer el bimestre - " + TXTFraccionConsultas.class.getName());
                        break;
                }
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL(Listar bimestre)", JOptionPane.ERROR_MESSAGE);
        }
        
        return lista;
    }
    
    public ArrayList listarRegimen(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "Select regimen from txtfraccion group by regimen";
        
        //Creamos nuestro array
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Seleccionar");
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                lista.add(rs.getString("regimen"));
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTPedimentoConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
        
        return lista;
    }
    
    
    
    
    
}
