/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Franko
 */
@Entity
@Table(name = "MEJORA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mejora.findAll", query = "SELECT m FROM Mejora m")
    , @NamedQuery(name = "Mejora.findById", query = "SELECT m FROM Mejora m WHERE m.id = :id")
    , @NamedQuery(name = "Mejora.findByFecha", query = "SELECT m FROM Mejora m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "Mejora.findByDescripcion", query = "SELECT m FROM Mejora m WHERE m.descripcion = :descripcion")})
public class Mejora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "FECHA")
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Mejora() {
    }

    public Mejora(Integer id) {
        this.id = id;
    }

    public Mejora(Integer id, String fecha, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mejora)) {
            return false;
        }
        Mejora other = (Mejora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Mejora[ id=" + id + " ]";
    }
    
}
