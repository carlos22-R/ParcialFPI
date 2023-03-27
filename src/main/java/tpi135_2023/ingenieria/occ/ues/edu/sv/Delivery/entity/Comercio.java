/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author CENTRA
 */
@Entity
@Table(name = "comercio")
@NamedQueries({
    @NamedQuery(name = "Comercio.findAll", query = "SELECT c FROM Comercio c"),
    @NamedQuery(name = "Comercio.findByIdComercio", query = "SELECT c FROM Comercio c WHERE c.idComercio = :idComercio"),
    @NamedQuery(name = "Comercio.findByNombre", query = "SELECT c FROM Comercio c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Comercio.findByActivo", query = "SELECT c FROM Comercio c WHERE c.activo = :activo"),
    @NamedQuery(name = "Comercio.findByDescripcion", query = "SELECT c FROM Comercio c WHERE c.descripcion = :descripcion")})
public class Comercio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_comercio")
    private Long idComercio;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comercio")
    private Collection<ComercioTipoComercio> comercioTipoComercioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comercio")
    private Collection<ProductoComercio> productoComercioCollection;
    @OneToMany(mappedBy = "idComercio")
    private Collection<Sucursal> sucursalCollection;

    public Comercio() {
    }

    public Comercio(Long idComercio) {
        this.idComercio = idComercio;
    }

    public Long getIdComercio() {
        return idComercio;
    }

    public void setIdComercio(Long idComercio) {
        this.idComercio = idComercio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<ComercioTipoComercio> getComercioTipoComercioCollection() {
        return comercioTipoComercioCollection;
    }

    public void setComercioTipoComercioCollection(Collection<ComercioTipoComercio> comercioTipoComercioCollection) {
        this.comercioTipoComercioCollection = comercioTipoComercioCollection;
    }

    public Collection<ProductoComercio> getProductoComercioCollection() {
        return productoComercioCollection;
    }

    public void setProductoComercioCollection(Collection<ProductoComercio> productoComercioCollection) {
        this.productoComercioCollection = productoComercioCollection;
    }

    public Collection<Sucursal> getSucursalCollection() {
        return sucursalCollection;
    }

    public void setSucursalCollection(Collection<Sucursal> sucursalCollection) {
        this.sucursalCollection = sucursalCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComercio != null ? idComercio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comercio)) {
            return false;
        }
        Comercio other = (Comercio) object;
        if ((this.idComercio == null && other.idComercio != null) || (this.idComercio != null && !this.idComercio.equals(other.idComercio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Comercio[ idComercio=" + idComercio + " ]";
    }
    
}
