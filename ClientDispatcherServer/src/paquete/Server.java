/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
public class Server {
    //socket del servidor
    ServerSocket miserver;

    public Server() {
        try {
            miserver = new ServerSocket(33);//creamos el serversocket para que esuche por el puerto 33
            System.out.println("Voy a aceptar el primer cliente");

            while (true) {
                Socket cliente1 = miserver.accept();//se espera a que un cliente se conecte y se acpet ala conexion
                System.out.println("Me llego el cliente");
                InputStream entrada1 = cliente1.getInputStream();//obtenemos el flujo de entrada del socket del cliente para recibir datos desde el cliente
                DataInputStream entra1 = new DataInputStream(entrada1);//Creamos un datainputstream para poder leer los datos del flujo de entrada

                while (true) {
                    String leido1 = entra1.readUTF();//leemos una caddena dew texto del cliente
                    System.out.println("El cliente dijo " + leido1);//imprimimos la cadena de texto del cliente
                }

            }
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Server objServer = new Server();
    }
}
