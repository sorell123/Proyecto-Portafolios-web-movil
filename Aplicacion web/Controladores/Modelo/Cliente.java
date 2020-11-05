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
public class Cliente {
    private int id, rut_empresa;
    private String dv_empresa,nombre_empresa, correo, usuario, pass;

    public Cliente() {
    }

    public Cliente( int rut_empresa, String dv_empresa, String nombre_empresa, String correo, String usuario, String pass) {
        this.id = id;
        this.rut_empresa = rut_empresa;
        this.dv_empresa = dv_empresa;
        this.nombre_empresa = nombre_empresa;
        this.correo = correo;
        this.usuario = usuario;
        this.pass = pass;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    public int getRut_empresa() {
        return rut_empresa;
    }

    public void setRut_empresa(int rut_empresa) {
        this.rut_empresa = rut_empresa;
    }

    public String getDv_empresa() {
        return dv_empresa;
    }

    public void setDv_empresa(String dv_empresa) {
        this.dv_empresa = dv_empresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        return "Cliente{" +"id=" + id + ", rut_empresa=" + rut_empresa + ", dv_empresa=" + dv_empresa + ", nombre_empresa=" + nombre_empresa + ", correo=" + correo + ", usuario=" + usuario + ", pass=" + pass +  '}';
    }

    
    
    
    
}
