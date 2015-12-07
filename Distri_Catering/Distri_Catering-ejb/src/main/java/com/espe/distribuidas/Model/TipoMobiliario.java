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
@Table(name = "TIPO_MOBILIARIO")
public class TipoMobiliario implements Serializable {

    @Id
    @Column(name = "COD_TIPO_MOBILIARIO", nullable = false)
    private String idTipoMobiliario;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;

    public String getIdTipoMobiliario() {
        return idTipoMobiliario;
    }

    public void setIdTipoMobiliario(String idTipoMobiliario) {
        this.idTipoMobiliario = idTipoMobiliario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.idTipoMobiliario);
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
        final TipoMobiliario other = (TipoMobiliario) obj;
        if (!Objects.equals(this.idTipoMobiliario, other.idTipoMobiliario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoMobiliario{" + "idTipoMobiliario=" + idTipoMobiliario + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
}
