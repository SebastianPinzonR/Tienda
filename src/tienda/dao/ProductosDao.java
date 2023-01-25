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
    private Object resultSet;
    
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
            rowCreate = statement.executeUpdate() > 0;
            statement.close();
            Conexion.Desconectar();
            return rowCreate;
        }   catch (Exception e){
            System.out.println("error"+e.getMessage());
        }
        return rowCreate;
    }
    /*public Productos read(int idDatos_productos) throws SQLException{
        Productos pasajero = null;
      /*  try{
            String sql ="SELECT * FROM productos WHERE id =?";
            conectar = Conexion.Conectar();
            PreparedStatement statement = (PreparedStatement) conectar.prepareStatement(sql);
            statement.setInt(1, idDatos_productos);
            ResultSet resultset = statement.executeQuery();
            if(resultSet.next()){
                Productos productos = new Productos(resultSet.getInt("idDatos_productos"),resultSet.getString("DescripcionProducto"),
                        resultSet.getString("Nombre"),resultSet.getInt("PrecioProducto"),resultSet.getInt("Cantidad"));
            }
        }   resultSet.close();
            Conexion.Desconectar();
    }       catch(Exception e){
            System.out.println("error");
}   return productos;*/
}
