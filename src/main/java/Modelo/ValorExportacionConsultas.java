package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ValorExportacionConsultas extends Conexion{
    
    ConexionBaseAF conexionAF = new ConexionBaseAF();
    
    public boolean valorExportacion60(ValorExportacion valorExpo){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "Insert into txtfraccion (Tipo, Fraccion, Valor, TipoMaterial, Regimen, Año, Bimestre) " 
                + "Value (?, ?, ?, ?, ?, ?, ?)";
        return true;
    }
}
