/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.rol_DTO;
import DTO.usuario_DTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Flaca
 */
public class rol {
    static String query;
    static Connection conexion = null;
    static Statement stm = null;
    static ResultSet rst = null;
    static PreparedStatement pstm = null;
    static CallableStatement cllstmt;

    //Consulta un Usuario
    public static rol_DTO ConsultarUnRol(String cedula) throws SQLException, Exception {
        rol_DTO rol = null;
         try {
            query = "SELECT * FROM ";
            conexion = Conexion.mysql.Conexion();
            stm = conexion.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                rol = new rol_DTO();                
                rol.setRolId(rst.getInt("rolId"));
                rol.setRolTipo(rst.getString("rolTipo"));                
                
            }
            conexion.close();
            return rol;
        } catch (SQLException ex) {                     
            throw ex;
        }
    }
        
    
    //insertar rol
    public static void InsertarRol(rol_DTO rol) throws SQLException, Exception {        
        try {
            query = "CALL pa_Asesor_insertar(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            conexion = Conexion.mysql.Conexion();            
            cllstmt = conexion.prepareCall(query);                                    
            cllstmt.setInt(1,(rol.getRolId()));//equals("0")?null:asesor.getUsuario().getPerCedula()+"");                        
            cllstmt.setString(2, rol.getRolTipo());//.trim().isEmpty()?null:asesor.getUsuario().getPerNombre());            
            
            cllstmt.execute();
            conexion.close();            
        } catch (SQLException ex) {                         
            throw ex;
        }        
    }
}


