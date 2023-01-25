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
public class VentasRegistradas implements Serializable{
    private int idVentas;
    private Date fecha;
    private int CodigoDelVendedor;
    private String metodopago;
    
public VentasRegistradas (int idVentas, Date fecha, int CodigoDelVendedor, String metodopago){
    this.idVentas = idVentas;
    this.fecha = fecha;
    this.CodigoDelVendedor = CodigoDelVendedor;
    this.metodopago = metodopago;
}

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigoDelVendedor() {
        return CodigoDelVendedor;
    }

    public void setCodigoDelVendedor(int CodigoDelVendedor) {
        this.CodigoDelVendedor = CodigoDelVendedor;
    }
    
}
