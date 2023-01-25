/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author SEBASTIAN
 */
public class Venta implements Serializable{
    private Date fechita;
    private int idproducto;
    private int vendedor;
    private int cantidad;
    private String FormadePago;

    public Venta(Date fechita, int idproducto, int vendedor, int cantidad, String FormadePago) {
        this.fechita = fechita;
        this.idproducto = idproducto;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
        this.FormadePago = FormadePago;
        
        
    }

    public String getFormadePago() {
        return FormadePago;
    }

    public void setFormadePago(String FormadePago) {
        this.FormadePago = FormadePago;
    }
    

    public Date getFechita() {
        return fechita;
    }

    public void setFechita(Date fechita) {
        this.fechita = fechita;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
