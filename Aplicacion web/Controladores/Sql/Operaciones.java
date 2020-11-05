/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sql;

import Conexion.Conexion;
import Modelo.Administrador;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sjore
 */
public class Operaciones{

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
   int r;
    
    //Valida usuario correspondiente
    public int validarAdmin(Administrador admin) {
        r = 0;
        String sql = "select * from administrador where usuario=? and pass=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, admin.getUsuario());
            ps.setString(2, admin.getPass());
            rs = ps.executeQuery();
            //Bucle buscando usuario, si existe deja r como 1 y la retorna
            while (rs.next()) {
                r = r + 1;
                admin.setId(rs.getInt("id"));
                admin.setUsuario(rs.getString("usuario"));
                admin.setPass(rs.getString("pass"));
            }
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    //Valida usuario correspondiente
    public int validarEmp(Empleado emp) {
        r = 0;
        String sql = "select * from empleado where usuario=? and pass=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, emp.getUsuario());
            ps.setString(2, emp.getPass());
            rs = ps.executeQuery();
            //Bucle buscando usuario, si existe deja r como 1 y la retorna
            while (rs.next()) {
                r = r + 1;
                emp.setId(rs.getInt("id"));
                emp.setUsuario(rs.getString("usuario"));
                emp.setPass(rs.getString("pass"));
            }
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    //Valida usuario correspondiente
    public int validarCliente(Cliente cli) {
       r = 0;
        String sql = "select * from cliente where usuario=? and pass=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getUsuario());
            ps.setString(2, cli.getPass());
            rs = ps.executeQuery();
            //Bucle buscando usuario, si existe deja r como 1 y la retorna
            while (rs.next()) {
                r = r + 1;
                cli.setId(rs.getInt("id"));
                cli.setUsuario(rs.getString("usuario"));
                cli.setPass(rs.getString("pass"));
            }
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
    
    //Valida usuario correspondiente
    public int validarProv(Proveedor prov) {
        r = 0;
        String sql = "select * from proveedor where usuario=? and pass=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getUsuario());
            ps.setString(2, prov.getPass());
            rs = ps.executeQuery();
            //Bucle buscando usuario, si existe deja r como 1 y la retorna
            while (rs.next()) {
                r = r + 1;
                prov.setId(rs.getInt("id"));
                prov.setUsuario(rs.getString("usuario"));
                prov.setPass(rs.getString("pass"));
            }
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }

}
