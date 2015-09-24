package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class mysql {
    
  static String UrlBd="jdbc:mysql://localhost:3306/autos";
    static String User="root";
    static String Password="";      
    

    

    
    public static Connection Conexion() throws SQLException, Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection Conn = DriverManager.getConnection(UrlBd, User, Password);
            return Conn;
            
        }
        catch(Exception e){            
            throw e;
        }
    }
}
