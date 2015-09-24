/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.categoria_DAO.conexion;
import static DAO.categoria_DAO.query;
import static DAO.categoria_DAO.rst;
import static DAO.categoria_DAO.stm;
import DTO.datosPersonales_DTO;
import DTO.vehiculo_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flaca
 */
public class vehiculo_DAO {
    

        
    //Consultar vehiculos por precio
    public static List<vehiculo_DTO> ConsultarVehiculoPorPrecio() throws SQLException, Exception {
        List<vehiculo_DTO> listaVehiculo = new ArrayList<>();         
        try {
            query = "SELECT vehModelo, vehMarca, vehColor, vehEstado, vehPrecio, datNombre, datApellido, datUsuId\n"
                    + "FROM vehiculo\n"
                    + "INNER JOIN datospersonales ON\n"
                    + "vehiculo.datId = datospersonales.datUsuId\n"
                    + "INNER JOIN usuario ON\n"
                    + "datospersonales.datUsuId = usuario.usuId\n"
                    + "INNER JOIN usuario_rol ON\n"
                    + "usuario.usuId = usuario_rol.usuId\n"
                    + "where usuario_rol.rolId = 1\n"
                    + "ORDER by vehPrecio ASC";
            conexion = Conexion.mysql.Conexion();
            stm = conexion.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {
                vehiculo_DTO vehiculo = new vehiculo_DTO();
                vehiculo.setVehModelo(rst.getInt("vehModelo"));
                vehiculo.setVehMarca(rst.getString("vehMarca"));
                vehiculo.setVehColor(rst.getString("vehColor"));
                vehiculo.setVehEstado(rst.getString("vehEstado"));
                vehiculo.setVehPrecio(rst.getInt("vehPrecio"));
                vehiculo.setDatNombre(rst.getString("datNombre"));
                vehiculo.setDatApellido(rst.getString("datApellido"));
                vehiculo.setDatUsuId(rst.getInt("datUsuId"));
                
                listaVehiculo.add(vehiculo);
            }
           
            conexion.close();
            return listaVehiculo;
        } catch (SQLException ex) {            
            
            throw ex;
        }
    }
    
    
    
    
    
    
}
