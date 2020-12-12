<%-- 
    Document   : Editar
    Created on : 14-nov-2018, 19:01:33
    Author     : sjore
--%>
<%@page import="java.sql.Statement"%>
<%@page session="true"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%-- 
    Document   : MostrarVuelo
    Created on : 23-oct-2018, 12:58:10
    Author     : sjore
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Conexion.Conexion"%>
<%@page import="Sql.Consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
	<!DOCTYPE html>
	<html lang="zxx" class="no-js">
	<head>
		</head>
		<body>	
                <% 
                String id=request.getParameter("id");
                Connection con=null;
                Statement sta=null;
                ResultSet rs=null;
                
                  String url="jdbc:oracle:thin:@localhost:1521:orcl";
                  String Driver= "oracle.jdbc.OracleDriver";
                  String user="system";
                  String clave="Venard2112";
           
                  try{
                      Class.forName(Driver);
                  con=DriverManager.getConnection(url,user,clave);
                  //listar
                  sta=con.createStatement();
                  sta.executeUpdate("delete from habitacion where id=" + id +"");
                  request.getRequestDispatcher("MostrarHabitacion.jsp").forward(request, response);
                  }catch(Exception e ){
                      out.print(e+"Esta seguro que desea eliminar");
                  }
                  //tabla
                  %>
                  
		</body>
	</html>
