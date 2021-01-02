/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.examen.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author fredyarev25
 */

@Entity
@Table(name="facturadetalle")
public class FacturaDetalleEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfacturadetalle;
    private int cantidad;
    private String producto;
    private double precio;
    private String parcial;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idfactura", nullable=false)
    private FacturaEntity factura;

    public int getIdfacturadetalle() {
        return idfacturadetalle;
    }

    public void setIdfacturadetalle(int idfacturadetalle) {
        this.idfacturadetalle = idfacturadetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getParcial() {
        return parcial;
    }

    public void setParcial(String parcial) {
        this.parcial = parcial;
    }

    public FacturaEntity getFactura() {
        return factura;
    }

    public void setFactura(FacturaEntity factura) {
        this.factura = factura;
    }
    
}
