/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Empleado;
import Modelo.Habitacion;
import Sql.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sjore
 */
public class AgregarEmpleado extends HttpServlet {

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
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");
        String usuario = request.getParameter("txtUsuario");
        String password = request.getParameter("txtPassword");
        int id = 0;
        try{
            
            Class.forName("oracle.jdbc.OracleDriver");  
            Conexion conecta = new Conexion();
            Consultas agrega = new Consultas();
            Empleado emp = new Empleado(rut,dv,nombre,apellido,usuario,password);
            conecta.getConnection(); 
            agrega.agregaEmpleado(emp);
            String mensaje = "usuario agregado sin problema";
            RequestDispatcher despacha = request.getRequestDispatcher("ValidarEmpleado.jsp");
           
            despacha.forward(request, response);
        } catch (IOException | ClassNotFoundException | SQLException | ServletException e)
        {
            String mensaje="Excepcion de Sql: " + e;
           // request.setAttribute("mensaje", mensaje);
            RequestDispatcher despacha = request.getRequestDispatcher("loginAdmin.jsp");
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
