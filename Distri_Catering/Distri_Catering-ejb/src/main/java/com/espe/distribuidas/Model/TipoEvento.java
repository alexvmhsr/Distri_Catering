/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.Model;

import java.io.Serializable;
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
@Table(name="TIPO_EVENTO")
public class TipoEvento implements Serializable{
    @Id
    
    @Column(name="COD_TIPO_EVENTO", nullable= false)
    private Integer codigo;
    
    @Column(name="NOMBRE", nullable= false)
    private String nombre;
    
    @Column(name="DETALLE", nullable=false)
    private String detalle;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash = 41 * hash + Objects.hashCode(this.codigo);
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
        final TipoEvento other = (TipoEvento) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoEvento{" + "codigo=" + codigo + ", nombre=" + nombre + ", detalle=" + detalle + '}';
    }
     

    
}
