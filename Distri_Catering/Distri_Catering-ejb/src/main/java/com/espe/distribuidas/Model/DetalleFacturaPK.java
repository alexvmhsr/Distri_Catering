/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Vane
 */
public class DetalleFacturaPK implements Serializable {
    protected Integer idFactura;
    protected Integer idPaquete;

    public DetalleFacturaPK() {
    }

    public DetalleFacturaPK(Integer idFactura, Integer idPaquete) {
        this.idFactura = idFactura;
        this.idPaquete = idPaquete;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.idFactura);
        hash = 29 * hash + Objects.hashCode(this.idPaquete);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleFacturaPK other = (DetalleFacturaPK) obj;
        if (!Objects.equals(this.idFactura, other.idFactura)) {
            return false;
        }
        if (!Objects.equals(this.idPaquete, other.idPaquete)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
