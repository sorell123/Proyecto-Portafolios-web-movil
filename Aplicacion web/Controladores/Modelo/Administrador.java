/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Richenz
 */
public class Administrador {
    private int id;
    private String nombre_Admin, apellido_admin, correo, usuario, pass;
    private Date updated_at, created_at;

    public Administrador() {
    }

    public Administrador(int id, String nombre_Admin, String apellido_admin, String correo, String usuario, String pass, Date updated_at, Date created_at) {
        this.id = id;
        this.nombre_Admin = nombre_Admin;
        this.apellido_admin = apellido_admin;
        this.correo = correo;
        this.usuario = usuario;
        this.pass = pass;
        this.updated_at = updated_at;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Admin() {
        return nombre_Admin;
    }

    public void setNombre_Admin(String nombre_Admin) {
        this.nombre_Admin = nombre_Admin;
    }

    public String getApellido_admin() {
        return apellido_admin;
    }

    public void setApellido_admin(String apellido_admin) {
        this.apellido_admin = apellido_admin;
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

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Administrador{" + "id=" + id + ", nombre_Admin=" + nombre_Admin + ", apellido_admin=" + apellido_admin + ", correo=" + correo + ", usuario=" + usuario + ", pass=" + pass + ", updated_at=" + updated_at + ", created_at=" + created_at + '}';
    }

    
    
}
