/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tienda.dao.VentaDao;
import tienda.ui.UIRecibo;
import tienda.ui.UIVenta;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerVenta implements ActionListener{

    private UIVenta vistaVenta;
    private VentaDao ventaDao;
    
public ControllerVenta (UIVenta vistaVenta){
    this.vistaVenta = vistaVenta;
    this.ventaDao = new VentaDao();
    this.vistaVenta.RealizarCompra.addActionListener(this);
    this.vistaVenta.setVisible(true);
}    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vistaVenta.RealizarCompra)){
            ControllerRecibo controlRecibo = new ControllerRecibo(new UIRecibo());
        }
    }
    
}
