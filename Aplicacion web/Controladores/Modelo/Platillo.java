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
public class Platillo {
    private String nombre;
    private Date fechaCreado, fechaActualizado;

    public Platillo(String nombre, Date fechaCreado, Date fechaActualizado) {
        this.nombre = nombre;
        this.fechaCreado = fechaCreado;
        this.fechaActualizado = fechaActualizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(Date fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public Date getFechaActualizado() {
        return fechaActualizado;
    }

    public void setFechaActualizado(Date fechaActualizado) {
        this.fechaActualizado = fechaActualizado;
    }

    public Platillo() {
    }

    @Override
    public String toString() {
        return "Platillo{" + "nombre=" + nombre + ", fechaCreado=" + fechaCreado + ", fechaActualizado=" + fechaActualizado + '}';
    }
    
    
    
}
