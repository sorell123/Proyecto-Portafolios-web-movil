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
public class Proveedor {
    
    private int id, rut_proveedor, telefono;
    private String dv_proveedor, nombre_proveedor, correo, usuario, pass;
    private Date created_at, updated_at;

    public Proveedor() {
    }

    public Proveedor(int id, int rut_proveedor, int telefono, String dv_proveedor, String nombre_proveedor, String correo, String usuario, String pass, Date created_at, Date updated_at) {
        this.id = id;
        this.rut_proveedor = rut_proveedor;
        this.telefono = telefono;
        this.dv_proveedor = dv_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.correo = correo;
        this.usuario = usuario;
        this.pass = pass;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut_proveedor() {
        return rut_proveedor;
    }

    public void setRut_proveedor(int rut_proveedor) {
        this.rut_proveedor = rut_proveedor;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDv_proveedor() {
        return dv_proveedor;
    }

    public void setDv_proveedor(String dv_proveedor) {
        this.dv_proveedor = dv_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", rut_proveedor=" + rut_proveedor + ", telefono=" + telefono + ", dv_proveedor=" + dv_proveedor + ", nombre_proveedor=" + nombre_proveedor + ", correo=" + correo + ", usuario=" + usuario + ", pass=" + pass + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }
    
    
}
