/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.usuarioRol_DTO;
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
public class usuarioRol_DAO {
    
    
    static String query;
    static Connection conexion = null;
    static Statement stm = null;
    static ResultSet rst = null;
    static PreparedStatement pstm = null;
    static CallableStatement cllstmt;

    //Consulta un UsuarioRol
    public static usuarioRol_DTO ConsultarUnUsuarioRol(String cedula) throws SQLException, Exception {
        usuarioRol_DTO usuarioRol = null;
         try {
            query = "SELECT * FROM ";
            conexion = Conexion.mysql.Conexion();
            stm = conexion.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                usuarioRol = new usuarioRol_DTO();                
                usuarioRol.setRolId(rst.getInt("rolId"));
                usuarioRol.setUsuId(rst.getInt("usuId"));                
                
            }
            conexion.close();
            return usuarioRol;
        } catch (SQLException ex) {                     
            throw ex;
        }
    }
        
    public static usuarioRol_DTO ConsultarUnaCedula(String percedula) throws SQLException, Exception {
        usuarioRol_DTO usuarioRol = null;
        try {
            query = "SELECT * FROM personas WHERE perCedula ='" + percedula + "'";
            conexion = Conexion.mysql.Conexion();
            stm = conexion.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                usuarioRol = new usuarioRol_DTO();                
                usuarioRol.setRolId(rst.getInt("rolId"));
                usuarioRol.setUsuId(rst.getInt("usuId"));                
                
            }
            conexion.close();
            return usuarioRol;
        } catch (SQLException ex) {                       
            throw ex;
        }
    }   
    
    //insertar usuario
    public static void InsertarUsuariorol(usuarioRol_DTO usuarioRol) throws SQLException, Exception {        
        try {
            query = "CALL pa_Asesor_insertar(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            conexion = Conexion.mysql.Conexion();            
            cllstmt = conexion.prepareCall(query);                                    
            cllstmt.setInt(1,(usuarioRol.getRolId()));//equals("0")?null:asesor.getUsuario().getPerCedula()+"");                        
            cllstmt.setInt(2, usuarioRol.getUsuId());//.trim().isEmpty()?null:asesor.getUsuario().getPerNombre());
         
            
            cllstmt.execute();
            conexion.close();            
        } catch (SQLException ex) {                         
            throw ex;
        }        
    }
}

