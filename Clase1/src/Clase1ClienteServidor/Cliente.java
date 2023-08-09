/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase1ClienteServidor;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
public class Cliente {

    //Socket mecanismo que permite establecer un enlace entre 2 programas que se ejecutan independientes uno del ootro
    //Socket implementa la conexion desde el lado del cliente 
    Socket clientecin;

    public Cliente() {
        try {
            //se establece una conexion al servidor usando un socket 
            clientecin = new Socket("localhost", 33);
            System.out.println("Conectado al server");
            //flujo de salida de datos desde el socket para enviar datos al servidor
            OutputStream salida = clientecin.getOutputStream();
            //permite mandar los datos de manera mas conveniente
            DataOutputStream sale = new DataOutputStream(salida);
            //se envia el mensaje
            sale.writeUTF("Soy el cliente");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cliente objCliente = new Cliente();
    }

}
