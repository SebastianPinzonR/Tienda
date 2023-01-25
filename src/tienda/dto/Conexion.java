/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SEBASTIAN
 */
public class Conexion {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String bbdd = "jdbc:mysql://localhost:3306/Tienda";
    private static final String usuario = "root";
    private static final String clave = "23Basesdedatos45?";
    private static Connection conexion;
    
    
    
    
    
    
    
    
    
    
    public static Connection Conectar(){
        conexion = null;
        try{
            Class.forName(driver);
            
            conexion = DriverManager.getConnection(bbdd, usuario, clave);
        } catch (Exception e){
            System.out.println("Error al conectar con la base de datos.\n"+ e.getMessage());
        }
        return conexion;
    }
    
    public static void Desconectar() throws SQLException{
        conexion.close();
    }
}
