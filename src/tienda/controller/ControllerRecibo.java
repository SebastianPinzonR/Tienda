/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tienda.dao.ReciboDao;
import tienda.ui.UIRecibo;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerRecibo  implements ActionListener{
    
    private UIRecibo vistaRecibo;
    private ReciboDao reciboDao;
    
    public ControllerRecibo(UIRecibo vistaRecibo){
        this.vistaRecibo = vistaRecibo;
        this.reciboDao = new ReciboDao();
        this.vistaRecibo.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
