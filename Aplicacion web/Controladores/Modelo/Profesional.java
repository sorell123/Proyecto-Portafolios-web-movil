/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author sjore
 */
public class Profesional {
    private int rut;
    private String dv, nombre, apellido, usuario, pass;

    public Profesional() {
    }

    public Profesional( int rut_empleado, String dv, String nombre, String apellido, String usuario, String pass) {

        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.pass = pass;

    }

    public Profesional( String dv, String nombre, String apellido, String usuario, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public int getRut() {
        return rut;
    }

    public void setRut(int rut_empleado) {
        this.rut = rut_empleado;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }



    @Override
    public String toString() {
        return "Empleado{" + ", rut_empleado=" + rut + ", dv_empleado=" + dv + ", nombre_empleado=" + nombre + ", apellido_empleado=" + apellido + ", usuario=" + usuario + ", pass=" + pass + '}';
    }

    
    
    
    
    
}
