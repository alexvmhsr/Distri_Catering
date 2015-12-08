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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author PabloA
 */
@Entity
@Table(name="DETALLE_SERVICIO")
public class DetalleServicio implements Serializable{
    
    @Id
    @Column(name="COD_SERVICIO",nullable= false)
    private Integer codservicio;
    
    @Id
    @Column(name="COD_PAQUETE",nullable= false)
    private Integer codPaquete;
    
    @Column(name="CANTIDAD",nullable= false)
    private Integer cantidad;
    
    @Column(name="VALOR_TOTAL",nullable= false)
    private BigDecimal valor;
    
     @JoinColumn(name = "COD_SERVICIO", referencedColumnName = "COD_SERVICIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Servicio servicio;

    @JoinColumn(name = "COD_PAQUETE", referencedColumnName = "COD_PAQUETE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paquete paquete;

    public DetalleServicio() {
    }
    
    

    public Integer getCodservicio() {
        return codservicio;
    }

    public void setCodservicio(Integer codservicio) {
        this.codservicio = codservicio;
    }

    public Integer getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(Integer codPaquete) {
        this.codPaquete = codPaquete;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.codservicio);
        hash = 89 * hash + Objects.hashCode(this.codPaquete);
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
        final DetalleServicio other = (DetalleServicio) obj;
        if (!Objects.equals(this.codservicio, other.codservicio)) {
            return false;
        }
        if (!Objects.equals(this.codPaquete, other.codPaquete)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleServicio{" + "codservicio=" + codservicio + ", codPaquete=" + codPaquete + ", cantidad=" + cantidad + ", valor=" + valor + ", servicio=" + servicio + ", paquete=" + paquete + '}';
    }
    
}

