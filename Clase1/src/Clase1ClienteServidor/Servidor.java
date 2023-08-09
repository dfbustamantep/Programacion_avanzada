/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase1ClienteServidor;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */

//Los sockets permiten que dos progrmas se comuniquen a traves de una red ,puede ser en la misma maquina o en diferentes maquinas

//El cliente manda un mensaje al servidor y el servidor recibe y muestra el mensaje

public class Servidor {
    //ServerSocket nos permite manipular la conexion desde el lado del servidor
    ServerSocket miServer;

    public Servidor() {
        try{
            //creamos un serversocket 
            miServer = new ServerSocket(33);
            System.out.println("Voy ha aceptar el primer cliente");
            //bucle infinito donde aceptamos las conexiones que entran 
            while(true){
                //conexion al cliente
                Socket cliente1=miServer.accept();
                System.out.println("Me llego el cliente X baje la bandera");
                //flujo de entrada desde el cliente para recibir los datos del cliente
                InputStream entrada1 = cliente1.getInputStream();
                //facilita la lectura de datos
                DataInputStream entra = new DataInputStream(entrada1);
                
                //bucle infinito para leer los mensajes enviados por el cliente
                while(true){
                    String leido1 = entra.readUTF();
                    System.out.println("El cliente dijo "+leido1);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Servidor objServer = new Servidor();
    }
    
}
