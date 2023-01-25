/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tienda.dao.RegistroVendedoresDao;
import tienda.ui.UIRegistroVendedores;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerRegistroVendedores implements ActionListener{

    private UIRegistroVendedores vistaRegistroVendedores;
    private RegistroVendedoresDao registroVendedoresDao;
    
public ControllerRegistroVendedores (UIRegistroVendedores vistaRegistroVendedores){
    this.vistaRegistroVendedores = vistaRegistroVendedores;
    this.registroVendedoresDao = new RegistroVendedoresDao();
    this.vistaRegistroVendedores.setVisible(true);
}    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
