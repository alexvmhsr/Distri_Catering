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
@Table(name="DETALLE_FACTURA")
@IdClass(DetalleFacturaPK.class)

public class DetalleFactura implements Serializable{
    @Id
    @Column(name="COD_FACTURA", nullable= false)
    Integer codigoFactura;
    
    @Id
    @Column(name="COD_PAQUETE", nullable= false)
    Integer codigoPaquete;
    
    @JoinColumn(name = "COD_FACTURA", referencedColumnName = "COD_FACTURA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Factura factura;
    
    @JoinColumn(name = "COD_PAQUETE", referencedColumnName = "COD_PAQUETE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paquete paquete;
    
    @Column(name="PRECIO", nullable= false)
    private BigDecimal precio;
    
    @Column(name="TOTAL", nullable= false)
    private BigDecimal total;
    

    public DetalleFactura() {
    }

    public Integer getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Integer codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Integer getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(Integer codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.codigoFactura);
        hash = 41 * hash + Objects.hashCode(this.codigoPaquete);
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
        final DetalleFactura other = (DetalleFactura) obj;
        if (!Objects.equals(this.codigoFactura, other.codigoFactura)) {
            return false;
        }
        if (!Objects.equals(this.codigoPaquete, other.codigoPaquete)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "codigoFactura=" + codigoFactura + ", codigoPaquete=" + codigoPaquete + ", precio=" + precio + ", total=" + total + '}';
    }
    
    
    
    
    
    
    
    
}

