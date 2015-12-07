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
@Table(name = "MOBILIARIO")
public class Mobiliario implements Serializable{
    @Id
    @Column(name = "COD_MOBILIARIO", nullable = false)
    private Integer idMobiliario;
    
    @Column(name = "COD_TIPO_MOBILIARIO", nullable = false)
    private Integer idTipoMobiliario;
    
    @JoinColumn(name = "COD_TIPO_MOBILIARIO", referencedColumnName = "COD_TIPO_MOBILIARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoMobiliario tipoMobiliario;   
    
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;  
    
    @Column(name = "EXISTENCIA", nullable = false)
    private Integer existencia;  
    
    @Column(name = "VALOR", nullable = false)
    private BigDecimal valor; 

    public Integer getIdMobiliario() {
        return idMobiliario;
    }

    public void setIdMobiliario(Integer idMobiliario) {
        this.idMobiliario = idMobiliario;
    }

    public Integer getIdTipoMobiliario() {
        return idTipoMobiliario;
    }

    public void setIdTipoMobiliario(Integer idTipoMobiliario) {
        this.idTipoMobiliario = idTipoMobiliario;
    }

    public TipoMobiliario getTipoMobiliario() {
        return tipoMobiliario;
    }

    public void setTipoMobiliario(TipoMobiliario tipoMobiliario) {
        this.tipoMobiliario = tipoMobiliario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idMobiliario);
        hash = 67 * hash + Objects.hashCode(this.idTipoMobiliario);
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
        final Mobiliario other = (Mobiliario) obj;
        if (!Objects.equals(this.idMobiliario, other.idMobiliario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mobiliario{" + "idMobiliario=" + idMobiliario + ", idTipoMobiliario=" + idTipoMobiliario + ", tipoMobiliario=" + tipoMobiliario + ", nombre=" + nombre + ", existencia=" + existencia + ", valor=" + valor + '}';
    }
    
}
