/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Conexion.*;
import Modelo.*;
/*import Sql.Consultas;*/
import Sql.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author sjore
 */
public class AgregarChekList extends HttpServlet {

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
        
        int rut = Integer.parseInt(request.getParameter("txtRut"));
        String dv = request.getParameter("txtDv");
        String nombreEm = request.getParameter("txtNombre");
        String correo = request.getParameter("txtCorreo");
        String usuario = request.getParameter("txtUsuario");
        String pass = request.getParameter("txtContrasena");
        int id = 0;
        
        try{
            Class.forName("oracle.jdbc.OracleDriver");  
            Conexion conecta = new Conexion();
            Consultas agrega = new Consultas();
            Cliente cli = new Cliente(rut,dv,nombreEm,correo,usuario,pass);
            conecta.getConnection();  
            agrega.agregaChekList(cli);
            String mensaje = "usuario agregado sin problema";
            RequestDispatcher despacha = request.getRequestDispatcher("ValidarChekList.jsp");
            
            despacha.forward(request, response);
        } catch (IOException | ClassNotFoundException | SQLException | ServletException e)
        {
            String mensaje="Excepcion de Sql: " + e;
           // request.setAttribute("mensaje", mensaje);
            RequestDispatcher despacha = request.getRequestDispatcher("ValidarChekList.jsp");
            despacha.forward(request, response);
        }
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
