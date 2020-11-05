/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sjore
 */
public class Operaciones {
    
    public ResultSet mostrar() throws ClassNotFoundException, SQLException
    {
     Connection con;
                String url = "jdbc:oracle:thin:@localhost:1521:orcl";
                String Driver = "oracle.jdbc.OracleDriver";
                String user = "system";
                String clave = "Venard2112";
                Class.forName(Driver);
                con = DriverManager.getConnection(url, user, clave);
                //listar
                PreparedStatement ps;
                ResultSet rs;
                ps = con.prepareStatement("select * from habitacion");
                rs = ps.executeQuery();
        return rs;
    }
    
}
