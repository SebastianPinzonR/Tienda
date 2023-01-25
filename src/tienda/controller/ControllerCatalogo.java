/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tienda.ui.UICatalogo;

/**
 *
 * @author SEBASTIAN
 */
public class ControllerCatalogo implements ActionListener{
 
    private UICatalogo vistaCatalogo;
    
public ControllerCatalogo(UICatalogo vistaCatalogo){
    this.vistaCatalogo = vistaCatalogo;
    
    this.vistaCatalogo.setVisible(true);
}    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
