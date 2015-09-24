/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.categoria_DTO;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Flaca
 */
public class categoria_DAO {

    static String query;
    static Connection conexion = null;
    static Statement stm = null;
    static ResultSet rst = null;
    static PreparedStatement pstm = null;

    //Lista Caegorias
    public static List<categoria_DTO> ConsultarCategorias() throws SQLException, Exception {
        List<categoria_DTO> listaCategorias = new ArrayList<>();

        query = "SELECT * FROM categoria";
        conexion = Conexion.mysql.Conexion();
        stm = conexion.createStatement();
        rst = stm.executeQuery(query);
        while (rst.next()) {
            categoria_DTO cat = new categoria_DTO(
                    rst.getInt("catId"), rst.getString("caTipo")
            );
            listaCategorias.add(cat);
        }
        conexion.close();
        return listaCategorias;

    }

    public static List<categoria_DTO> ConsultarCamperos() throws SQLException, Exception {
        List<categoria_DTO> listaCategorias = new ArrayList<>();

        query = "SELECT \n"
                + "vehiculo.vehPlaca,\n"
                + "vehiculo.vehModelo,\n"
                + "vehiculo.vehMarca,\n"
                + "vehiculo.vehColor,\n"
                + "vehiculo.vehEstado,\n"
                + "vehiculo.vehPrecio\n"
                + "FROM\n"
                + "vehiculo\n"
                + "INNER JOIN categoria ON categoria.catId = vehiculo.catId\n"
                + "WHERE\n"
                + "categoria.catId = 1;";
        conexion = Conexion.mysql.Conexion();
        stm = conexion.createStatement();
        rst = stm.executeQuery(query);
        while (rst.next()) {
//            categoria_DTO cat = new categoria_DTO(int placa, int modelo, string marca, string color, string estado, string precio)
//                    rst.getInt("catId"), rst.getString("caTipo")
//            );
//            listaCategorias.add(cat);
        }
        conexion.close();
        return listaCategorias;

    }

}
