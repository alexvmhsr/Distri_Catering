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
@Table(name="FACTURA")
public class Factura implements Serializable{
    
    @Id 
    @Column(name="COD_FACTURA", nullable= false)
    private Integer codigo;
    
    @Column(name="COD_CLIENTE", nullable= false)
    private String codigoCliente;
    
    @Column(name="FECHA", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @JoinColumn(name = "COD_CLIENTE", referencedColumnName = "COD_CLIENTE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.codigo);
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
        final Factura other = (Factura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", codigoCliente=" + codigoCliente + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }
    
    
       
    
    
}

