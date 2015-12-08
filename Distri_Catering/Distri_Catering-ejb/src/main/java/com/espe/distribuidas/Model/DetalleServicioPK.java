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

public class DetalleServicioPK implements Serializable {
    
    protected Integer idServicio;
    protected Integer idPaquete;

    public DetalleServicioPK() {
    }

    public DetalleServicioPK(Integer idServicio, Integer idPaquete) {
        this.idServicio = idServicio;
        this.idPaquete = idPaquete;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idServicio);
        hash = 67 * hash + Objects.hashCode(this.idPaquete);
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
        final DetalleServicioPK other = (DetalleServicioPK) obj;
        if (!Objects.equals(this.idServicio, other.idServicio)) {
            return false;
        }
        if (!Objects.equals(this.idPaquete, other.idPaquete)) {
            return false;
        }
        return true;
    }
    
    
    
}
