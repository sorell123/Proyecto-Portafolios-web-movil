/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author sjore
 */
public class Habitacion {
    private String situacion, tipoCama, accesorio;
    private int precio;

    public Habitacion(String situacion, String tipoCama, String accesorio, int precio) {
        this.situacion = situacion;
        this.tipoCama = tipoCama;
        this.accesorio = accesorio;
        this.precio = precio;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public String getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(String accesorio) {
        this.accesorio = accesorio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "situacion=" + situacion + ", tipoCama=" + tipoCama + ", accesorio=" + accesorio + ", precio=" + precio + '}';
    }
 
    
    
    
    
}
