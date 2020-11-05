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
public class Usuario {
    private String nivelP, usuario, pass;

    public Usuario(String nivelP, String usuario, String pass) {
        this.nivelP = nivelP;
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getNivelP() {
        return nivelP;
    }

    public void setNivelP(String nivelP) {
        this.nivelP = nivelP;
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
        return "Usuario{" + "nivelP=" + nivelP + ", usuario=" + usuario + ", pass=" + pass + '}';
    }
    
    
}
