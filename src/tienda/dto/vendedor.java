/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.dto;

import java.io.Serializable;

/**
 *
 * @author SEBASTIAN
 */
public class vendedor implements Serializable{
    private int idVendedor;
    private String nombreVendedor;
    
public vendedor (int idVendedor, String nombreVendedor){
    this.idVendedor = idVendedor;
    this.nombreVendedor = nombreVendedor;
    
}

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

public int getidVendedor(){
    return idVendedor;
}

public void setidVendedor(int idVendedor){
    this.idVendedor = idVendedor;
}
}


