/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tienda.dao.VendedorDao;
import tienda.dto.Vendedor;
import tienda.ui.UIRegistroVendedores;
import tienda.ui.UIVendedor;
import java.sql.SQLException;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerVendedor implements ActionListener{
    
    private UIVendedor vistaVendedor;
    private VendedorDao vendedorDao;
    
    
    public ControllerVendedor(UIVendedor vistaVendedor) {
        this.vistaVendedor = vistaVendedor;
        this.vistaVendedor.Buscar.addActionListener(this);
        this.vistaVendedor.Crear.addActionListener(this);
        this.vistaVendedor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vistaVendedor.Buscar)){
            ControllerRegistroVendedores controlRegistroVendedores = new ControllerRegistroVendedores(new UIRegistroVendedores());
        }if (e.getSource().equals(vistaVendedor.Crear)){
            int id = Integer.valueOf(vistaVendedor.idVendedor.getText());
            String nombre = vistaVendedor.nombreVendedor.getText();
            
            Vendedor vendedorx = new Vendedor(id, nombre);
            try{
                if(vendedorDao.create(vendedorx))
                    JOptionPane.showMessageDialog(null, "un nuevo Vendedor ha sido creado");
                else
                    JOptionPane.showMessageDialog(null, "Error al crear el vendedor");
            } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al crear un vendedor");
        }
        }
    }
    
}
