/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
public class Cliente {

    Socket clientecin;

    public Cliente() {
        try {
            //se crea un nuevo socket y se conecta al servidor en localhost en el puerto 33
            clientecin = new Socket("localhost", 33);
            System.out.println("Me conecte al server");
            //se obtiene el flujo de salida del socket para enviar datos al servidor.
            OutputStream salida = clientecin.getOutputStream();
            //se crea un DataOutputStream para escribir datos en el flujo de salida
            DataOutputStream sale = new DataOutputStream(salida);
            //se escribe una cadena de texto en el flujo de salida y la envía al servidor.
            sale.writeUTF("Soy el cliente Maria");
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Cliente objCliente = new Cliente();
    }
}
