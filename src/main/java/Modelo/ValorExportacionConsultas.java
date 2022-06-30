package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ValorExportacionConsultas extends Conexion{
    int cantidadAF = 0;
        
    ConexionBaseAF conexionAF = new ConexionBaseAF();
    
    public double valorExportacionGlosa(ValorExportacion valExpo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSet rsAF = null;
        ResultSet rsRec = null;
        Connection conAF = conexionAF.getConexionAF();
        double valorComercial = 0;
        int añoPedimento, añoPedimentoAnterior;

        String sql = "select Pedimento, Patente, SeccionAduanera, ValorComercial, year(FechaPagoReal) as 'AñoPagoPedimento', DescripcionMercancia from glosa551 "
                + "where glosa551.FechaPagoReal >= ? and glosa551.FechaPagoReal <= ? and glosa551.ClaveDocumento = ? "
                + "and glosa551.TipoOperacion = '2';";

        try {
            ps = conAF.prepareStatement(sql);
            ps.setDate(1, valExpo.fechaInicial);
            ps.setDate(2, valExpo.fechaFinal);
            ps.setString(3, valExpo.regimen);
            rs = ps.executeQuery();
            while (rs.next()) {
                añoPedimento = Integer.parseInt(rs.getString("AñoPagoPedimento"));
                String sqlAF = "Select ClaveCaso from glosa507 where pedimento = ? and patente = ? and SeccionAduanera = ? and year(FechaValidacionPagoR) = ? and ClaveCaso = 'AF'";
                ps = conAF.prepareStatement(sqlAF);
                ps.setString(1, rs.getString("Pedimento"));
                ps.setString(2, rs.getString("Patente"));
                ps.setString(3, rs.getString("SeccionAduanera"));
                ps.setInt(4, Integer.parseInt(rs.getString("AñoPagoPedimento")));
                rsAF = ps.executeQuery();

                if (!rsAF.next()) {

                    String sqlRec = "select Pedimento, year(FechaOperacionAnterior) as 'AñoOperacionAnterior' from glosa701 where Pedimento = ? and Patente = ? and SeccionAduanera = ?";
                    ps = conAF.prepareStatement(sqlRec);
                    ps.setString(1, rs.getString("Pedimento"));
                    ps.setString(2, rs.getString("Patente"));
                    ps.setString(3, rs.getString("SeccionAduanera"));

                    rsRec = ps.executeQuery();
                    if (rsRec.next()) {
                        
                        añoPedimentoAnterior = Integer.parseInt(rsRec.getString("AñoOperacionAnterior"));
                        if (añoPedimento == añoPedimentoAnterior) {
                            valorComercial = valorComercial + Double.parseDouble(rs.getString("ValorComercial"));
                        }else{
                            //System.out.println("ES R1 + 1y: " + rsRec.getString("Pedimento"));
                        }
                        
                    }else{
                        valorComercial = valorComercial + Double.parseDouble(rs.getString("ValorComercial"));
                    }
                }else{
                    //System.out.println("Es un activo fijo, no se toma en cuenta para valor comercial: " + rs.getString("Pedimento"));
                    cantidadAF = cantidadAF + 1;
                    //System.out.println(rs.getString("DescripcionMercancia"));
                }
                
            }
            
            //System.out.println(cantidadAF);

        } catch (SQLException ex) {
            Logger.getLogger(TXTFraccionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL - Consulta Valor Exportacion", JOptionPane.ERROR_MESSAGE);
            return 0;
        }

        return valorComercial;

    }
    
    public double valorExportacionTXT(ValorExportacion valExpo){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        double valorComercialTXT = 0;
        
        String sql = "select sum(Valor) as Valor from txtfraccion where regimen = ? and año = ? and bimestre = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, valExpo.getRegimen());
            ps.setInt(2, valExpo.getAño());
            ps.setString(3, valExpo.getBimestre());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (rs.getString("Valor") != null) {
                    valorComercialTXT = Double.parseDouble(rs.getString("Valor"));
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ValorExportacionConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error SQL - Valor Exportacion TXT", JOptionPane.ERROR_MESSAGE);
        }
        
        return valorComercialTXT;
    }
}
