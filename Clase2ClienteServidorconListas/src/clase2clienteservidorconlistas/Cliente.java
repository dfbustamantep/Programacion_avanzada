/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2clienteservidorconlistas;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
public class Cliente {
    public Cliente(){
        try{
            System.out.println("Voy a conectarme con el servidor");
            //creacion de un nuevo socekt que se conecta al servidor en localhost en el puerto 33
            Socket s = new Socket("localhost",33);
            System.out.println("Ya me conecte con el server");
            //flujo de salida desde el socket,lo que permite enviar datos al servidor
            OutputStream salida = s.getOutputStream();
            //datps en flujo de salida
            DataOutputStream sale = new DataOutputStream(salida);
            sale.writeUTF("En el muro quedaron los tatuajes del juego");
            sale.writeUTF("el tiempo me conmina pero no me doblego");
            sale.writeUTF("siento a pesar de todo frutal desasosiego");
            sale.writeUTF("y el código de agobios lo dejo para luego.");
            sale.writeUTF("-Mario Benedetti");
        }
        catch(Exception e){
            System.out.println("Error cliente "+e);
        }
    }
    public static void main(String[] args){
        Cliente objCliente = new Cliente();
    }
}
