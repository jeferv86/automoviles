/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.vehiculo_DAO;
import DAO.vendedor_DAO;
import DTO.datosPersonales_DTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Flaca
 */
public class vendedor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            int datId =0;
            int datUsuId =0;
            String datNombre ="";
            String datApellido ="";
            String daTipoId ="";
            String datNumeroId ="";
            String daTelefono ="";
            String datCorreo ="";
            
            datId = Integer.parseInt(request.getParameter("datID"));
            datUsuId = Integer.parseInt(request.getParameter("datUsuId"));
            datNombre = request.getParameter("datNombre");
            datApellido = request.getParameter("datApellido");
            daTipoId = request.getParameter("daTipoId");
            datNumeroId = request.getParameter("datNumeroId");
            daTelefono = request.getParameter("datTelefono");
            datCorreo = request.getParameter("datCorreo");
            
        }  
    }   
     public datosPersonales_DTO MostrarVendedor(int cedula) throws SQLException, Exception {
        return vendedor_DAO.ConsultarUnaCedula(cedula);
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
