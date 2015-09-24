/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.datosPersonales_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Flaca
 */
public class vendedor_DAO {

    
    static String query;
    static Connection conexion = null;
    static Statement stm = null;
    static ResultSet rst = null;
    static PreparedStatement pstm = null;
    
    //Consulta una Vendedor
    public static datosPersonales_DTO ConsultarUnaCedula(int cedula) throws SQLException, Exception {
        datosPersonales_DTO vendedor = null;
        try {
            query = "SELECT * FROM datospersonales WHERE datUsuId ='" + cedula + "'";
            conexion = Conexion.mysql.Conexion();
            stm = conexion.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                vendedor = new datosPersonales_DTO();
                vendedor.setDatUsuId(rst.getInt("datUsuId"));
                vendedor.setDaTid(rst.getInt("daTid"));
                vendedor.setDatNombre(rst.getString("datNombre"));
                vendedor.setDatApellido(rst.getString("datApellido"));
                vendedor.setDaTipoId(rst.getString("daTipoId"));
                vendedor.setDatNumeroId(rst.getString("datNumeroId"));
                vendedor.setDaTelefono(rst.getString("daTelefono"));
                vendedor.setDatCorreo(rst.getString("datCorreo"));
            }
            conexion.close();
            return vendedor;
        } catch (SQLException ex) {            
            
            throw ex;
        }
    }
    
}
