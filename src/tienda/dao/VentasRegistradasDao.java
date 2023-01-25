/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.dao;

import tienda.dto.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tienda.dto.VentasRegistradas;
/**
 *
 * @author SEBASTIAN
 */
public class VentasRegistradasDao {
    private Connection conectar;
    
    public boolean create(VentasRegistradas ventasregistradas)throws SQLException{
        boolean rowCreate =false;
        try{
            String sql = "INSERT INTO VentasRegistradas (idVentas, fecha, CodigoDelVendedor, metodopago) VALUES(?,?,?,?)";
            conectar = Conexion.Conectar();
            PreparedStatement statement = (PreparedStatement) conectar.prepareStatement(sql);
            statement.setInt(1, ventasregistradas.getIdVentas());
            statement.setDate(2, (Date) ventasregistradas.getFecha());
            statement.setInt(3, ventasregistradas.getCodigoDelVendedor());
            statement.setString(4, ventasregistradas.getMetodopago());
            rowCreate = statement.executeUpdate() > 0;
            statement.close();
            Conexion.Desconectar();
            return rowCreate;
        }   catch (Exception e){
            System.out.println("error");
        }
            return rowCreate;
    }
}
