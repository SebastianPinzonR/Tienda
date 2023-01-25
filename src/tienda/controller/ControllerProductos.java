/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tienda.dao.ProductosDao;
import tienda.dto.Productos;
import tienda.ui.UICatalogo;
import tienda.ui.UIProductos;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerProductos implements ActionListener{
    
    private UIProductos vistaProductos;
    private ProductosDao productosDao;
    
public ControllerProductos(UIProductos vistaProductos){
    this.vistaProductos = vistaProductos;
    this.productosDao = new ProductosDao();
    this.vistaProductos.Catalogo.addActionListener(this);
    this.vistaProductos.Crear.addActionListener(this);
    
    this.vistaProductos.setVisible(true);
    
}    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vistaProductos.Catalogo)){
            ControllerCatalogo controlCatalogo = new ControllerCatalogo(new UICatalogo());
        }
        if(e.getSource().equals(vistaProductos.Crear)){
            int id = Integer.valueOf(vistaProductos.idDatos_productos.getText());
            String descripcion = vistaProductos.DescripcionProducto.getText();
            String nombre = vistaProductos.Nombre.getText();
            int precioProducto = Integer.valueOf(vistaProductos.PrecioProducto.getText());
            int cantidad = Integer.valueOf(vistaProductos.Cantidad.getText());
            Productos productox = new Productos(id, descripcion, nombre, precioProducto, cantidad);
            try{
                if(modeloProductos.create(productox))
                JOptionPane.showMessageDialog(null,"un nuevo producto ha sido creado");
                else
                    JOptionPane.showMessageDialog(null, "Error al crear el producto");
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al crear el producto");
            }
        }
    }
    
}
