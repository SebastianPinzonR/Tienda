/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.dao;


import tienda.dto.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tienda.dto.Productos;

/**
 *
 * @author SEBASTIAN
 */
public class ProductosDao {
    private Connection conectar;
    
    public boolean create(Productos productos)throws SQLException {
        boolean rowCreate =false;
        try{
            String sql = "INSERT INTO Productos (idDatos_productos, Descripcion, Nombre, PrecioProducto, Cantidad) VALUES(?,?,?,?,?)";
            conectar = Conexion.Conectar();
            PreparedStatement statement = (PreparedStatement) conectar.prepareStatement(sql);
            statement.setInt(1, productos.getIdDatos_productos());
            statement.setString(2, productos.getDescripcionProducto());
            statement.setString(3, productos.getNombre());
            statement.setInt(4, productos.getPrecioProducto());
            statement.setInt(5, productos.getCantidad());
            rowCreate = statement.executeUpdate() >0;
            statement.close();
            Conexion.Desconectar();
            return rowCreate;
        }   catch (Exception e){
            System.out.println("error");
        }
        return rowCreate;
    }
}
