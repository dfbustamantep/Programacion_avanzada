/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author DBustamanteP
 */
public class Ventana {
        JFrame ventana = null;
        public static JTextArea caja = null;
        public static JTextField nombreCliente = null;
        public static JButton boton = null;
        JPanel panel = null;
        //JLabel titulo = null;
        EventoClick objEventoClick = null;
        
        public Ventana (){
            
            //titulo = new JLabel("Chat");
            ///titulo.setBounds(10, 10,20, 20);
            ventana= new JFrame();
            ventana.setTitle("Chat");
            panel = new JPanel();
            panel.setLayout(null);
            objEventoClick = new EventoClick();
            
            
            caja = new JTextArea("Ingrese el texto a enviar",10,10);
            caja.setBounds(50, 50, 200, 20);
            
            //nombreCliente = new JTextField("Usuario",5);
            //nombreCliente.setBounds(50, 20, 80, 20);
            
            boton = new JButton("Enviar");
            //asignamos el Listener al boton
            boton.addActionListener(objEventoClick);
            boton.setBounds(80, 100, 80, 20);
            
            ventana.setSize(300,300);
            ventana.setVisible(true);
            //ventana.pack();
            ventana.setSize(300,300);
            
            //colocamos los objetos,el panel en la ventana y en el panel la caja y el boton
            ventana.add(panel);
            panel.add(caja);
            panel.add(boton);
           // panel.add(nombreCliente);
        }
        
        public static void main(String[] args) {
            Ventana  objV = new Ventana();
            
    }
}
