/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DBustamanteP
 */
public class EventoClick implements ActionListener/*implementamos la clase ActionListener que se utiliza para manejar eventos de accion*/{

    @Override//el metodo se ejecuta cunado opcurre una accion
    public void actionPerformed(ActionEvent e) {
        try{
            //enviamos ele conetenido de la caja de texto a traves de cliente sale
            Cliente.sale.writeUTF(Ventana.caja.getText());//obtenemos el contenido del campo de texto
            //con writeUTF se envia el conetnido del campo de texto al servidor
        }
        catch(Exception e1){
            System.out.println(".");
        }
    }
    
}
