/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author figueroa
 */
@Embeddable
public class ComercioTipoComercioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_comercio")
    private int idComercio;
    @Basic(optional = false)
    @Column(name = "id_tipo_comercio")
    private int idTipoComercio;

    public ComercioTipoComercioPK() {
    }

    public ComercioTipoComercioPK(int idComercio, int idTipoComercio) {
        this.idComercio = idComercio;
        this.idTipoComercio = idTipoComercio;
    }

    public int getIdComercio() {
        return idComercio;
    }

    public void setIdComercio(int idComercio) {
        this.idComercio = idComercio;
    }

    public int getIdTipoComercio() {
        return idTipoComercio;
    }

    public void setIdTipoComercio(int idTipoComercio) {
        this.idTipoComercio = idTipoComercio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idComercio;
        hash += (int) idTipoComercio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComercioTipoComercioPK)) {
            return false;
        }
        ComercioTipoComercioPK other = (ComercioTipoComercioPK) object;
        if (this.idComercio != other.idComercio) {
            return false;
        }
        if (this.idTipoComercio != other.idTipoComercio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ComercioTipoComercioPK[ idComercio=" + idComercio + ", idTipoComercio=" + idTipoComercio + " ]";
    }
    
}
