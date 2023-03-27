/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author CENTRA
 */
@Entity
@Table(name = "tipo_producto")
@NamedQueries({
    @NamedQuery(name = "TipoProducto.findAll", query = "SELECT t FROM TipoProducto t"),
    @NamedQuery(name = "TipoProducto.findByIdTipoProducto", query = "SELECT t FROM TipoProducto t WHERE t.idTipoProducto = :idTipoProducto"),
    @NamedQuery(name = "TipoProducto.findByNombre", query = "SELECT t FROM TipoProducto t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoProducto.findByActivo", query = "SELECT t FROM TipoProducto t WHERE t.activo = :activo"),
    @NamedQuery(name = "TipoProducto.findByComentarios", query = "SELECT t FROM TipoProducto t WHERE t.comentarios = :comentarios")})
public class TipoProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_producto")
    private Integer idTipoProducto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "comentarios")
    private String comentarios;
    @OneToMany(mappedBy = "idTipoProductoPadre")
    private Collection<TipoProducto> tipoProductoCollection;
    @JoinColumn(name = "id_tipo_producto_padre", referencedColumnName = "id_tipo_producto")
    @ManyToOne
    private TipoProducto idTipoProductoPadre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoProducto")
    private Collection<TipoProductoTipoComercio> tipoProductoTipoComercioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoProducto")
    private Collection<ProductoTipoProducto> productoTipoProductoCollection;

    public TipoProducto() {
    }

    public TipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Collection<TipoProducto> getTipoProductoCollection() {
        return tipoProductoCollection;
    }

    public void setTipoProductoCollection(Collection<TipoProducto> tipoProductoCollection) {
        this.tipoProductoCollection = tipoProductoCollection;
    }

    public TipoProducto getIdTipoProductoPadre() {
        return idTipoProductoPadre;
    }

    public void setIdTipoProductoPadre(TipoProducto idTipoProductoPadre) {
        this.idTipoProductoPadre = idTipoProductoPadre;
    }

    public Collection<TipoProductoTipoComercio> getTipoProductoTipoComercioCollection() {
        return tipoProductoTipoComercioCollection;
    }

    public void setTipoProductoTipoComercioCollection(Collection<TipoProductoTipoComercio> tipoProductoTipoComercioCollection) {
        this.tipoProductoTipoComercioCollection = tipoProductoTipoComercioCollection;
    }

    public Collection<ProductoTipoProducto> getProductoTipoProductoCollection() {
        return productoTipoProductoCollection;
    }

    public void setProductoTipoProductoCollection(Collection<ProductoTipoProducto> productoTipoProductoCollection) {
        this.productoTipoProductoCollection = productoTipoProductoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoProducto != null ? idTipoProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoProducto)) {
            return false;
        }
        TipoProducto other = (TipoProducto) object;
        if ((this.idTipoProducto == null && other.idTipoProducto != null) || (this.idTipoProducto != null && !this.idTipoProducto.equals(other.idTipoProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoProducto[ idTipoProducto=" + idTipoProducto + " ]";
    }
    
}
