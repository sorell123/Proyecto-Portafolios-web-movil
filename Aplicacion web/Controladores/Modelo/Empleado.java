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
public class Empleado {
    private int id, rut_empleado;
    private String dv_empleado, nombre_empleado, apellido_empleado, usuario, pass;

    public Empleado() {
    }

    public Empleado( int rut_empleado, String dv_empleado, String nombre_empleado, String apellido_empleado, String usuario, String pass) {
        this.id = id;
        this.rut_empleado = rut_empleado;
        this.dv_empleado = dv_empleado;
        this.nombre_empleado = nombre_empleado;
        this.apellido_empleado = apellido_empleado;
        this.usuario = usuario;
        this.pass = pass;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut_empleado() {
        return rut_empleado;
    }

    public void setRut_empleado(int rut_empleado) {
        this.rut_empleado = rut_empleado;
    }

    public String getDv_empleado() {
        return dv_empleado;
    }

    public void setDv_empleado(String dv_empleado) {
        this.dv_empleado = dv_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
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
        return "Empleado{" +"id=" + id + ", rut_empleado=" + rut_empleado + ", dv_empleado=" + dv_empleado + ", nombre_empleado=" + nombre_empleado + ", apellido_empleado=" + apellido_empleado + ", usuario=" + usuario + ", pass=" + pass +  '}';
    }

    
    
    
    
    
}
