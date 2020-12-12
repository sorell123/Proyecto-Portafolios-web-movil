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
@Table(name = "REPORTEASESORIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reporteasesoria.findAll", query = "SELECT r FROM Reporteasesoria r")
    , @NamedQuery(name = "Reporteasesoria.findByIdReporte", query = "SELECT r FROM Reporteasesoria r WHERE r.idReporte = :idReporte")
    , @NamedQuery(name = "Reporteasesoria.findByEmpresa", query = "SELECT r FROM Reporteasesoria r WHERE r.empresa = :empresa")
    , @NamedQuery(name = "Reporteasesoria.findByCliente", query = "SELECT r FROM Reporteasesoria r WHERE r.cliente = :cliente")
    , @NamedQuery(name = "Reporteasesoria.findByFecha", query = "SELECT r FROM Reporteasesoria r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Reporteasesoria.findByDescripcion", query = "SELECT r FROM Reporteasesoria r WHERE r.descripcion = :descripcion")})
public class Reporteasesoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_REPORTE")
    private Integer idReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EMPRESA")
    private String empresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CLIENTE")
    private String cliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "FECHA")
    private String fecha;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Reporteasesoria() {
    }

    public Reporteasesoria(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public Reporteasesoria(Integer idReporte, String empresa, String cliente, String fecha) {
        this.idReporte = idReporte;
        this.empresa = empresa;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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
        hash += (idReporte != null ? idReporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reporteasesoria)) {
            return false;
        }
        Reporteasesoria other = (Reporteasesoria) object;
        if ((this.idReporte == null && other.idReporte != null) || (this.idReporte != null && !this.idReporte.equals(other.idReporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Reporteasesoria[ idReporte=" + idReporte + " ]";
    }
    
}
