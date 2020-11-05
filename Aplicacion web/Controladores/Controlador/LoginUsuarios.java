    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Administrador;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Proveedor;
import Sql.Operaciones;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Richenz
 */
public class LoginUsuarios extends HttpServlet {

    Operaciones op = new Operaciones();
    Administrador admin = new Administrador();
    Empleado emp = new Empleado();
    Cliente cli = new Cliente();
    Proveedor prov = new Proveedor();
    int r ;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String usu = request.getParameter("txtUsuario");
        String pass = request.getParameter("txtContrasena");
        admin.setUsuario(usu);
        admin.setPass(pass);
        emp.setUsuario(usu);
        emp.setPass(pass);
        cli.setUsuario(usu);
        cli.setPass(pass);
        prov.setUsuario(usu);
        prov.setPass(pass);

        r = op.validarAdmin(admin); //Verifica si existe en la BD

        if (r == 1) {
            request.getSession().setAttribute("id", admin.getId()); //Variable de Sesion ID para crear otras tablas q la pidan
            request.getSession().setAttribute("usuario", usu); //Variable de Sesion para demostrar que funciona
            request.getRequestDispatcher("loginAdmin.jsp").forward(request, response);
        } else {
            r = op.validarEmp(emp); //Verifica si existe en la BD
            if (r == 1) {
                request.getSession().setAttribute("id", emp.getId()); //Variable de Sesion ID para crear otras tablas q la pidan
                request.getSession().setAttribute("usuario", usu); //Variable de Sesion para demostrar que funciona
                request.getRequestDispatcher("loginEmpleado.jsp").forward(request, response);
            } else {
                r = op.validarCliente(cli); //Verifica si existe en la BD
                if (r == 1) {
                    request.getSession().setAttribute("id", cli.getId()); //Variable de Sesion ID para crear otras tablas q la pidan
                    request.getSession().setAttribute("usuario", usu); //Variable de Sesion para demostrar que funciona
                    request.getRequestDispatcher("loginCliente.jsp").forward(request, response);
                } else {
                    r = op.validarProv(prov); //Verifica si existe en la BD
                    if (r == 1) {
                        request.getSession().setAttribute("id", prov.getId()); //Variable de Sesion ID para crear otras tablas q la pidan
                        request.getSession().setAttribute("usuario", usu); //Variable de Sesion para demostrar que funciona
                        request.getRequestDispatcher("loginProveedor.jsp").forward(request, response);
                    } else {
                        request.getRequestDispatcher("Ingresar.jsp").forward(request, response);
                    }

                }

            }
        }

    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
