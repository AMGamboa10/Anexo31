package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBaseAF {   
    private final String base = "activofijo";
    private final String user = "amgambo";
    private final String password = "12345";
    private final String url = "jdbc:mysql://MX1STNJY4F7G3:3306/" + base + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private Connection con = null;
    //Comentarios
    public Connection getConexionAF(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBaseAF.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    
}