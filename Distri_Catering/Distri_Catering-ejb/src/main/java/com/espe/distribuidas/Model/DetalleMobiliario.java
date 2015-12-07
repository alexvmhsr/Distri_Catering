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
@Table(name = "DETALLE_MOBILIARIO")
@IdClass(DetallePK.class)
public class DetalleMobiliario implements Serializable {

    @Id
    @Column(name = "COD_MOBILIARIO", nullable = false)
    private Integer codMobiliario;

    @Id
    @Column(name = "COD_PAQUETE", nullable = false)
    private String codPaquete;

    @JoinColumn(name = "COD_MOBILIARIO", referencedColumnName = "COD_MOBILIARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Mobiliario mobiliario;

    @JoinColumn(name = "COD_PAQUETE", referencedColumnName = "COD_PAQUETE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paquete paquete;

    @Column(name = "CANTIDAD", nullable = false)
    private Integer cantidad;
    
    @Column(name = "VALOR_TOTAL", nullable = false)
    private BigDecimal valorTotal;

    public Integer getCodMobiliario() {
        return codMobiliario;
    }

    public void setCodMobiliario(Integer codMobiliario) {
        this.codMobiliario = codMobiliario;
    }

    public String getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(String codPaquete) {
        this.codPaquete = codPaquete;
    }

    public Mobiliario getMobiliario() {
        return mobiliario;
    }

    public void setMobiliario(Mobiliario mobiliario) {
        this.mobiliario = mobiliario;
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
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.codMobiliario);
        hash = 97 * hash + Objects.hashCode(this.codPaquete);
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
        final DetalleMobiliario other = (DetalleMobiliario) obj;
        if (!Objects.equals(this.codMobiliario, other.codMobiliario)) {
            return false;
        }
        if (!Objects.equals(this.codPaquete, other.codPaquete)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleMobiliario{" + "codMobiliario=" + codMobiliario + ", codPaquete=" + codPaquete + ", mobiliario=" + mobiliario + ", paquete=" + paquete + ", cantidad=" + cantidad + ", valorTotal=" + valorTotal + '}';
    }
    
    
}
