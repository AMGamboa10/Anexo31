package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TXTNombreConsultas extends Conexion{
    
    public boolean registrar(TXTNombre txtNombre){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Insert into txtname(NombreTXT) Value(?);";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, txtNombre.getNombreTXT());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTNombreConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error SQL: " + ex,"Error SQL: NombreConsultas", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
    public boolean eliminar(TXTNombre txtNombre){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "Delete from txtname where NombreTXT = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, txtNombre.getNombreTXT());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(TXTNombreConsultas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error SQL: " + ex,"Error SQL: NombreConsultas Eliminar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
}
