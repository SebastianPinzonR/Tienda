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
public class Productos implements Serializable{

    public static boolean create(Productos productox) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int idDatos_productos;
    private String DescripcionProducto;
    private String Nombre;
    private int PrecioProducto;
    private int Cantidad;

public Productos ( int idDatos, String Descripcion, String Nombre, int PrecioProducto, int Cantidad){
    this.idDatos_productos = idDatos_productos;
    this.DescripcionProducto = Descripcion;
    this.Nombre = Nombre;
    this.PrecioProducto = PrecioProducto;
    this.Cantidad = Cantidad;
}

    public int getIdDatos_productos() {
        return idDatos_productos;
    }

    public void setIdDatos_productos(int idDatos_productos) {
        this.idDatos_productos = idDatos_productos;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcion(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    
}
