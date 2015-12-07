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
@Table(name = "ALIMENTACION")
public class Alimentacion implements Serializable {

    @Id
    @Column(name = "COD_ALIMENTACION", nullable = false)
    private Integer codAlimentacion;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    
    @Column(name = "CATEGORIA", nullable = false)
    private String categoria;
    
    @Column(name = "VALOR", nullable = false)
    private BigDecimal valor;
    
    @Column(name = "DETALLE", nullable = false)
    private String detalle;

    public Integer getCodAlimentacion() {
        return codAlimentacion;
    }

    public void setCodAlimentacion(Integer codAlimentacion) {
        this.codAlimentacion = codAlimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.codAlimentacion);
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
        final Alimentacion other = (Alimentacion) obj;
        if (!Objects.equals(this.codAlimentacion, other.codAlimentacion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alimentacion{" + "codAlimentacion=" + codAlimentacion + ", nombre=" + nombre + ", categoria=" + categoria + ", valor=" + valor + ", detalle=" + detalle + '}';
    }

    
}
