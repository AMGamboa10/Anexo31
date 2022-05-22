package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ValorExportacionConsultas extends Conexion{
        
    ConexionBaseAF conexionAF = new ConexionBaseAF();
    
    public double valorExportacionGlosa(ValorExportacion valExpo){
        PreparedStatement ps = null;
        ResultSet rs = null;        
        Connection conAF = conexionAF.getConexionAF();
        double valorComercial = 0;
        
        String sql = "select sum(ValorComercial) as 'ValorComercial' from glosa551 where FechaPagoReal >= ? and FechaPagoReal <= ? and ClaveDocumento = ? and TipoOperacion = '2'";
        
        try {
            ps = conAF.prepareStatement(sql);
            ps.setDate(1, valExpo.fechaInicial);
            ps.setDate(2, valExpo.fechaFinal);
            ps.setString(3, valExpo.regimen);
            rs = ps.executeQuery();
            if (rs.next()) {
                if (rs.getString("ValorComercial") == null) {
                    
                }else{
                    valorComercial = Double.parseDouble(rs.getString("ValorComercial"));
                }
            }
            
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
