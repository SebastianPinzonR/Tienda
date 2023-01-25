/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tienda.dao.VentasRegistradasDao;
import tienda.ui.UIProductos;
import tienda.ui.UIRegistroVentas;
import tienda.ui.UIVentasRegistradas;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerVentasRegistradas implements ActionListener{
    
    private UIVentasRegistradas vistaVentasRegistradas;
    private VentasRegistradasDao ventasRegistradasDao;
    
    public ControllerVentasRegistradas(UIVentasRegistradas vistaVentasRegistradas) {
        this.vistaVentasRegistradas = vistaVentasRegistradas;
        this.vistaVentasRegistradas.RegistroVentas.addActionListener(this);
        this.ventasRegistradasDao = new VentasRegistradasDao();
        this.vistaVentasRegistradas.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(vistaVentasRegistradas.RegistroVentas)){
            ControllerRegistroVentas controlregistroventas = new ControllerRegistroVentas(new UIRegistroVentas());
        }
    }
    
}
