/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Modelo.*;
import Conexion.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
        
/**
 *
 * @author sjore
 */
public class Consultas {
    
     Conexion conecta;  

    public Consultas() {
        conecta = new Conexion();
    }
    
    public Habitacion agregaHabitacion(Habitacion h) throws SQLException
    {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
        Statement st = conecta.getConnection().createStatement();
        String sql = "insert into habitacion (situacion,tipo_cama,accesorios,precio) values ('"+h.getSituacion()+"','"+h.getTipoCama()+"','"+h.getAccesorio()+"',"+h.getPrecio()+")";
        st.execute(sql);
        conecta.getConnection().close();
        return h; 
    }
    
    public Empleado agregaEmpleado(Empleado e) throws SQLException
    {
        
        Statement st = conecta.getConnection().createStatement();
        String sql = "INSERT INTO EMPLEADO (rut_empleado, dv_empleado, nombre_empleado, apellido_empleado, usuario, pass) VALUES ("+e.getRut_empleado()+",'"+e.getDv_empleado()+"','"+e.getNombre_empleado()+"','"+e.getApellido_empleado()+"','"+e.getUsuario()+"','"+e.getPass()+"')";
        st.execute(sql);
        conecta.getConnection().close();
        return e; 
    }
    
    public Profesional agregaProfesional(Profesional p) throws SQLException
    {
        
        Statement st = conecta.getConnection().createStatement();
        String sql = "insert into profesional (rut, dv, nombre, apellido, usuario, pass) values ("+p.getRut()+",'"+p.getDv()+"','"+p.getNombre()+"','"+p.getApellido()+"','"+p.getUsuario()+"','"+p.getPass()+"')";
        st.execute(sql);
        conecta.getConnection().close();
        return p; 
    }
   
    public Cliente agregaCliente(Cliente c) throws SQLException
    {
        
        Statement st = conecta.getConnection().createStatement();
        String sql = "INSERT INTO CLIENTE (RUT_EMPRESA, DV_EMPRESA, NOMBRE_EMPRESA, CORREO, USUARIO, PASS) VALUES ("+c.getRut_empresa()+",'"+c.getDv_empresa()+"','"+c.getNombre_empresa()+"','"+c.getCorreo()+"','"+c.getUsuario()+"','"+c.getPass()+"')";
        st.execute(sql);
        conecta.getConnection().close();
        return c; 
    }
    
 
   
    
   



    
}
    
    
    
