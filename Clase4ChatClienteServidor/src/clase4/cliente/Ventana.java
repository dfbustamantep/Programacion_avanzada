/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4.cliente;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DBustamanteP
 */
public class Ventana {
        JFrame ventana = null;
        public static JTextField caja = null;
        public static JButton boton = null;
        JPanel panel = null;
        EventoClick objEventoClick = null;
        
        public Ventana (){
            ventana= new JFrame();
            panel = new JPanel();
            objEventoClick = new EventoClick();
            caja = new JTextField(10);
            boton = new JButton("Enviar");
            //asignamos el Listener al boton
            boton.addActionListener(objEventoClick);
            ventana.setSize(300,300);
            ventana.setVisible(true);
            ventana.pack();
            ventana.setSize(300,300);
            
            //colocamos los objetos,el panel en la ventana y en el panel la caja y el boton
            ventana.add(panel);
            panel.add(caja);
            panel.add(boton);
        }
        
        public static void main(String[] args) {
            Ventana  objV = new Ventana();
    }
}
