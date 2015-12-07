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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PabloA
 */
@Entity
@Table(name = "DETALLE_ALIMENTACION")
@IdClass(DetallePK.class)

public class DetalleAlimentacion implements Serializable {

    @Id
    @Column(name = "COD_ALIMENTACION", nullable = false)
    private Integer idMobiliario;

    @Id
    @Column(name = "COD_PAQUETE", nullable = false)
    private String idPaquete;

    @JoinColumn(name = "COD_ALIMENTACION", referencedColumnName = "COD_ALIMENTACION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Mobiliario alimentacion;

    @JoinColumn(name = "COD_PAQUETE", referencedColumnName = "COD_PAQUETE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paquete paquete;

    @Column(name = "CANTIDAD", nullable = false)
    private Integer cantidad;

    @Column(name = "VALOR_TOTAL", nullable = false)
    private BigDecimal valorTotal;

    public Integer getIdMobiliario() {
        return idMobiliario;
    }

    public void setIdMobiliario(Integer idMobiliario) {
        this.idMobiliario = idMobiliario;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Mobiliario getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(Mobiliario alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idMobiliario);
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
        final DetalleAlimentacion other = (DetalleAlimentacion) obj;
        if (!Objects.equals(this.idMobiliario, other.idMobiliario)) {
            return false;
        }
        if (!Objects.equals(this.idPaquete, other.idPaquete)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleAlimentacion{" + "idMobiliario=" + idMobiliario + ", idPaquete=" + idPaquete + ", alimentacion=" + alimentacion + ", paquete=" + paquete + ", cantidad=" + cantidad + ", valorTotal=" + valorTotal + '}';
    }
    
    
      
}
