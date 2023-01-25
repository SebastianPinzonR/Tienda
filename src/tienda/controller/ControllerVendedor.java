/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tienda.ui.UIRegistroVendedores;
import tienda.ui.UIVendedor;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerVendedor implements ActionListener{
    
    private UIVendedor vistaVendedor;
    
    
    public ControllerVendedor(UIVendedor vistaVendedor) {
        this.vistaVendedor = vistaVendedor;
        this.vistaVendedor.Buscar.addActionListener(this);
        this.vistaVendedor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vistaVendedor.Buscar)){
            ControllerRegistroVendedores controlRegistroVendedores = new ControllerRegistroVendedores(new UIRegistroVendedores());
        }
    }
    
}
