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
@Table(name = "ASESORIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asesoria.findAll", query = "SELECT a FROM Asesoria a")
    , @NamedQuery(name = "Asesoria.findById", query = "SELECT a FROM Asesoria a WHERE a.id = :id")
    , @NamedQuery(name = "Asesoria.findByDescripcion", query = "SELECT a FROM Asesoria a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Asesoria.findByTipoAsesoria", query = "SELECT a FROM Asesoria a WHERE a.tipoAsesoria = :tipoAsesoria")
    , @NamedQuery(name = "Asesoria.findByDescripcion2", query = "SELECT a FROM Asesoria a WHERE a.descripcion2 = :descripcion2")
    , @NamedQuery(name = "Asesoria.findByFecha", query = "SELECT a FROM Asesoria a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Asesoria.findByEmpleado", query = "SELECT a FROM Asesoria a WHERE a.empleado = :empleado")})
public class Asesoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TIPO_ASESORIA")
    private String tipoAsesoria;
    @Size(max = 200)
    @Column(name = "DESCRIPCION2")
    private String descripcion2;
    @Size(max = 35)
    @Column(name = "FECHA")
    private String fecha;
    @Size(max = 35)
    @Column(name = "EMPLEADO")
    private String empleado;

    public Asesoria() {
    }

    public Asesoria(Integer id) {
        this.id = id;
    }

    public Asesoria(Integer id, String descripcion, String tipoAsesoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipoAsesoria = tipoAsesoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoAsesoria() {
        return tipoAsesoria;
    }

    public void setTipoAsesoria(String tipoAsesoria) {
        this.tipoAsesoria = tipoAsesoria;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
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
        if (!(object instanceof Asesoria)) {
            return false;
        }
        Asesoria other = (Asesoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Asesoria[ id=" + id + " ]";
    }
    
}
