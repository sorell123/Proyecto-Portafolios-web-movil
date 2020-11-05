/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Informatica
 */
public class Conexion {

    public Conexion() {
    }

    public Connection getConnection() {
        Connection con;
        String Driver = "oracle.jdbc.OracleDriver";
        String dburl = "jdbc:oracle:thin:@localhost:1521:XE";
        String dbUser = "system";
        String dbPass = "Venard2112";
        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(dburl, dbUser, dbPass); 
        } catch (Exception ex) {
            con =null;
        }
        return con;

    }

}
