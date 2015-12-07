/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author PabloA
 */

@Entity
@Table(name = "PAQUETE")
public class Paquete implements Serializable{
     @Id
    @Column(name = "COD_PAQUETE", nullable = false)
    private Integer idPaquete;
    
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;   
    
    @Column(name = "ACTIVO", nullable = false)
    private Boolean activo;   
    
    @Column(name = "PRECIO_FINAL", nullable = false)
    private BigDecimal precioFinal;   
    
    @Column(name = "ITEMS", nullable = false)
    private Integer items;   

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
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

    public BigDecimal getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(BigDecimal precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.idPaquete);
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
        final Paquete other = (Paquete) obj;
        if (!Objects.equals(this.idPaquete, other.idPaquete)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", nombre=" + nombre + ", activo=" + activo + ", precioFinal=" + precioFinal + ", items=" + items + '}';
    }

    
  
}
