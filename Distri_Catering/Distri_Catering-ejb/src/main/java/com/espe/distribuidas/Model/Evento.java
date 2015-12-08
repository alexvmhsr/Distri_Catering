/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author PabloA
 */
@Entity
@Table(name="EVENTO")
public class Evento implements Serializable{
    
    @Id
    @Column(name="COD_EVENTO", nullable=false)
    private Integer codigo;
    
    @Column(name="COD_TIPO_EVENTO", nullable=false)
    private Integer codigoTipoEvento;
    
    @Column(name="COD_PAQUETE", nullable=false)
    private Integer codigoPaquete;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_EVENTO", nullable= false)
    private Date fechaEvento;
    
    @Column(name="ASISTENTES", nullable= false)
    private Integer asistentes;
    
    @Column(name="DIRECCION", nullable= false)
    private String direccion;
    
    @Column(name="TELEFONO", nullable= false)
    private String telefono;
    
    @JoinColumn(name = "COD_TIPO_EVENTO", referencedColumnName = "COD_TIPO_EVENTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoEvento tipoEvento;

    @JoinColumn(name = "COD_PAQUETE", referencedColumnName = "COD_PAQUETE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paquete paquete;
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoTipoEvento() {
        return codigoTipoEvento;
    }

    public void setCodigoTipoEvento(Integer codigoTipoEvento) {
        this.codigoTipoEvento = codigoTipoEvento;
    }

    public Integer getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(Integer codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public Integer getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Integer asistentes) {
        this.asistentes = asistentes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.codigo);
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", codigoTipoEvento=" + codigoTipoEvento + ", codigoPaquete=" + codigoPaquete + ", fechaEvento=" + fechaEvento + ", asistentes=" + asistentes + ", direccion=" + direccion + ", telefono=" + telefono + ", tipoEvento=" + tipoEvento + ", paquete=" + paquete + '}';
    }
      
    
}

