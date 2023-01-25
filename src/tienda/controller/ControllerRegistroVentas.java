/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tienda.ui.UIRegistroVentas;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerRegistroVentas implements ActionListener{

    private UIRegistroVentas vistaRegistroVentas;
    
    public ControllerRegistroVentas (UIRegistroVentas vistaRegistroVentas){
        this.vistaRegistroVentas = vistaRegistroVentas;
        this.vistaRegistroVentas.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
