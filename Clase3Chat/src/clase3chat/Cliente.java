/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3chat;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */

//cliente que se conecta al servidor
public class Cliente {
    
    public Cliente(){
        try{
            //socket para conectarse al servidor en la misma maquina "localhost"
            Socket c= new Socket ("localhost",33);
            
            //flujo de salida para enviar datos al servidor a traves del socket
            OutputStream salida = c.getOutputStream();
            DataOutputStream sale = new DataOutputStream (salida);
            
            //envio de un mensaje a traves del flujo de salida
            //sale.writeUTF("yo me llamo Duncan Dhu");
            sale.writeUTF("yo me llamo Zoe");
        }
        catch(Exception e){
            System.out.println("Error clente"+e);
        }
    }
    
    public static void main(String[] args) {
        Cliente c= new Cliente();
    }
}
