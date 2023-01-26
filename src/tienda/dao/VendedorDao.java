
package tienda.dao;

import tienda.dto.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tienda.dto.Vendedor;

public class VendedorDao {
    private Connection conectar;
    private Object resultSet;
    
    public boolean create(Vendedor vendedor)throws SQLException {
        boolean rowCreate =false;
        try{
            String sql = "INSERT INTO Productos (idVendedor, Nombre) VALUES(?,?)";
            conectar = Conexion.Conectar();
            PreparedStatement statement = (PreparedStatement) conectar.prepareStatement(sql);
            statement.setInt(1, vendedor.getIdVendedor());
            statement.setString(2, vendedor.getNombreVendedor());
            rowCreate = statement.executeUpdate() > 0;
            statement.close();
            Conexion.Desconectar();
            return rowCreate;
        }   catch (Exception e){
            System.out.println("error"+e.getMessage());
        }
        return rowCreate;
    }
}
