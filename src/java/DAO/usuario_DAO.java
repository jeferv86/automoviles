
package DAO;

import DTO.usuarioRol_DTO;
import DTO.usuario_DTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class usuario_DAO {
    
    
    static String query;
    static Connection conexion = null;
    static Statement stm = null;
    static ResultSet rst = null;
    static PreparedStatement pstm = null;
    static CallableStatement cllstmt;

    
//Consultar 1 usuario login
    public static usuario_DTO ConsultarUnUsuarioLogin(String Us, String Pass) throws SQLException, Exception {
        usuario_DTO Usuario = null;
        try {
            query = "SELECT usu.usuLogin,\n"
                    + "       usu.usuPassword,\n"
                    + "       dat.usuId,\n"
                    + "       dat.datNombre,\n"
                    + "       urol.rolId\n"
                    + "FROM datospersonales AS dat\n"
                    + "INNER JOIN usuario AS usu ON dat.usuId = usu.usuId\n"
                    + "INNER JOIN usuario_rol AS urol ON usu.usuId = urol.rolId\n"
                    + "WHERE urol.rolId IN (2,3,4)\n"
                    + "and usuLogin='" + Us + "' and usuPassword ='" + Pass + "'";
        
                    
            conexion = Conexion.mysql.Conexion();
            stm = conexion.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {                
                usuario_DTO usuario = new usuario_DTO();               
                usuarioRol_DTO persona = new usuarioRol_DTO();                
                usuario.setUsuId(rst.getInt("usuId"));
                usuario.setUsuLogin(rst.getString("usuLogin"));
                usuario.setUsuPassword(rst.getString("usuPassword"));
                persona.setRolId(rst.getInt("rolId"));
                
            }
            conexion.close();
            return Usuario;
        } catch (SQLException ex) {
            
            throw ex;
        }
    }    
    
    //Consultar 1 usuario login
    public static usuario_DTO ConsultarUnUsuario(String perId) throws SQLException, Exception {
        usuario_DTO Usuario = null;
        try {
            query = "Select * " 
                    + "from usuarios as usu "                                        
                    + "where perId='" + perId + "'";
            conexion = Conexion.mysql.Conexion();
            stm = conexion.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {                
               // usuario = new usuario_DTO();               
                //usuario.setPerId(rst.getInt("perId"));
                //usuario.setUsuNick(rst.getString("usuNick"));
                //usuario.setUsuClave(rst.getString("usuClave"));
            }
            conexion.close();
            return Usuario;
        } catch (SQLException ex) {
            
            throw ex;
        }
    }}    
    
    //Consultar 1 usuario login
//    public static Usuario_DTO ConsultarUnNick(String nick) throws SQLException, Exception {
//        Usuario_DTO Usuario = null;
//        try {
//            query = "Select * " 
//                    + "from usuarios as usu "                                        
//                    + "where usuNick='" + nick + "'";
//            conexion = Conexion.mysql.Conexion();
//            stm = conexion.createStatement();
//            rst = stm.executeQuery(query);
//            while (rst.next()) {                
//                Usuario = new Usuario_DTO();               
//                Usuario.setPerId(rst.getInt("perId"));
//                Usuario.setUsuNick(rst.getString("usuNick"));
//                Usuario.setUsuClave(rst.getString("usuClave"));
//            }
//            conexion.close();
//            return Usuario;
//        } catch (SQLException ex) {
//            new Logs_DAO().InsertarLog(new Log_DTO(0,"consultar usuario login " +ex.getMessage()));
//            throw ex;
//        }
//    }    
//
//    //insertar una persona
//    public static void InsertarUsuario(Usuario_DTO usuario) throws Exception {
//        try {
//            query = "INSERT INTO usuarios(usuNick, usuClave, perId) VALUES (?,?,?)";
//            conexion = Conexion.mysql.Conexion();
//            pstm = conexion.prepareStatement(query);                
//            pstm.setString(1, usuario.getUsuNick().trim().isEmpty()?null:usuario.getUsuNick());
//            pstm.setString(2, usuario.getUsuClave().trim().isEmpty()?null:usuario.getUsuClave());
//            pstm.setInt(3, usuario.getPerId());
//            pstm.executeUpdate();
//            conexion.close();
//        } catch (Exception ex) {
//            new Logs_DAO().InsertarLog(new Log_DTO(0,"insertando una persona " +ex.getMessage()));
//            throw ex;
//        }
//    }
//
//
//
////Consulta un Usuario
//    public static usuario_DTO ConsultarUnUsuario(String cedula) throws SQLException, Exception {
//        usuario_DTO usuario = null;
//         try {
//            query = "SELECT * FROM ";
//            conexion = Conexion.mysql.Conexion();
//            stm = conexion.createStatement();
//            rst = stm.executeQuery(query);
//            while (rst.next()) {
//                usuario = new usuario_DTO();                
//                usuario.setUsuId(rst.getInt("usuId"));
//                usuario.setUsuLogin(rst.getString("usuLogin"));
//                usuario.setUsuPassword(rst.getString("usuPassword"));                
//                
//            }
//            conexion.close();
//            return usuario;
//        } catch (SQLException ex) {                     
//            throw ex;
//        }
//    }
//        
//    public static usuario_DTO ConsultarUnaCedula(String percedula) throws SQLException, Exception {
//        usuario_DTO usuario = null;
//        try {
//            query = "SELECT * FROM personas WHERE perCedula ='" + percedula + "'";
//            conexion = Conexion.mysql.Conexion();
//            stm = conexion.createStatement();
//            rst = stm.executeQuery(query);
//            while (rst.next()) {
//                usuario = new usuario_DTO();                
//                usuario.setUsuId(rst.getInt("usuId"));
//                usuario.setUsuLogin(rst.getString("usuLogin"));
//                usuario.setUsuLogin(rst.getString("usuPassword"));
//                
//            }
//            conexion.close();
//            return usuario;
//        } catch (SQLException ex) {                       
//            throw ex;
//        }
//    }   
//    
//    //insertar usuario
//    public static void InsertarUsuario(usuario_DTO usuario) throws SQLException, Exception {        
//        try {
//            query = "CALL pa_Asesor_insertar(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
//            conexion = Conexion.mysql.Conexion();            
//            cllstmt = conexion.prepareCall(query);                                    
//            cllstmt.setInt(1,(usuario.getUsuId()));//equals("0")?null:asesor.getUsuario().getPerCedula()+"");                        
//            cllstmt.setString(2, usuario.getUsuLogin());//.trim().isEmpty()?null:asesor.getUsuario().getPerNombre());
//            cllstmt.setString(3, usuario.getUsuPassword());//.trim().isEmpty()?null:asesor.getUsuario().getPerApellido());
//            
//            cllstmt.execute();
//            conexion.close();            
//        } catch (SQLException ex) {                         
//            throw ex;
//        }        
//    }
//}
//
