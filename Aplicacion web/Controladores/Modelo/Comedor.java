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
public class Comedor {

    private String tipo_servicio;
    private int precio, id_admin;
    private Date updated_at, created_at;

    public Comedor(String tipo_servicio, int precio, Date updated_at, Date created_at, int id_admin) {
        this.tipo_servicio = tipo_servicio;
        this.precio = precio;
        this.updated_at = updated_at;
        this.created_at = created_at;
        this.id_admin = id_admin;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
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
        return "Comedor{" + "tipo servicio=" + tipo_servicio + ", preico=" + precio + ", updated_at=" + updated_at + ", created_at=" + created_at + '}';
    }
}
