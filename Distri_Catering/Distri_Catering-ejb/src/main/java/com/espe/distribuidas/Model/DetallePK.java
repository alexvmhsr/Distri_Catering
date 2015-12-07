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
 * @author PabloA
 */
public class DetallePK implements Serializable{
    
    protected Integer idPaquete;
    protected Integer idAlimentacion;
    protected Integer idMobiliario;
    protected Integer idServicio;
    protected Integer idFactura;

    public DetallePK() {
    }

    public DetallePK(Integer idPaquete, Integer idAlimentacion, Integer idMobiliario, Integer idServicio, Integer idFactura) {
        this.idPaquete = idPaquete;
        this.idAlimentacion = idAlimentacion;
        this.idMobiliario = idMobiliario;
        this.idServicio = idServicio;
        this.idFactura = idFactura;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Integer getIdAlimentacion() {
        return idAlimentacion;
    }

    public void setIdAlimentacion(Integer idAlimentacion) {
        this.idAlimentacion = idAlimentacion;
    }

    public Integer getIdMobiliario() {
        return idMobiliario;
    }

    public void setIdMobiliario(Integer idMobiliario) {
        this.idMobiliario = idMobiliario;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idPaquete);
        hash = 23 * hash + Objects.hashCode(this.idAlimentacion);
        hash = 23 * hash + Objects.hashCode(this.idMobiliario);
        hash = 23 * hash + Objects.hashCode(this.idServicio);
        hash = 23 * hash + Objects.hashCode(this.idFactura);
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
        final DetallePK other = (DetallePK) obj;
        if (!Objects.equals(this.idPaquete, other.idPaquete)) {
            return false;
        }
        if (!Objects.equals(this.idAlimentacion, other.idAlimentacion)) {
            return false;
        }
        if (!Objects.equals(this.idMobiliario, other.idMobiliario)) {
            return false;
        }
        if (!Objects.equals(this.idServicio, other.idServicio)) {
            return false;
        }
        if (!Objects.equals(this.idFactura, other.idFactura)) {
            return false;
        }
        return true;
    }
  
}
