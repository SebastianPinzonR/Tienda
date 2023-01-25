/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tienda.ui.UIPrincipal;
import tienda.ui.UIProductos;
import tienda.ui.UIVendedor;
import tienda.ui.UIVenta;
import tienda.ui.UIVentasRegistradas;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerPrincipal implements ActionListener{
    
    private UIPrincipal principal;
        public ControllerPrincipal(UIPrincipal principal){
            this.principal = principal;
            this.principal.Producto.addActionListener(this);
            this.principal.Vendedor.addActionListener(this);
            this.principal.VentaRegistrada.addActionListener(this);
            this.principal.Venta.addActionListener(this);
            this.principal.setVisible(true);
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(principal.Producto)){
            ControllerProductos controlProductos = new ControllerProductos(new UIProductos());
        }if(e.getSource().equals(principal.VentaRegistrada)){
            ControllerVentasRegistradas ControlVentasRegistradas = new ControllerVentasRegistradas(new UIVentasRegistradas());
        }if(e.getSource().equals(principal.Vendedor)){
            ControllerVendedor ControlVendedor = new ControllerVendedor(new UIVendedor());
        }if(e.getSource().equals(principal.Venta)){
            ControllerVenta ControlVenta = new ControllerVenta(new UIVenta());
        }
    }
    
    
}
