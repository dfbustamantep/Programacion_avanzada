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
public class Servidor {
    ServerSocket miServer;

    public Servidor() {
        try{
            miServer = new ServerSocket(33);
            System.out.println("Voy ha aceptar el primer cliente");
            
            while(true){
               Socket cliente1=miServer.accept();
                System.out.println("Me llego el cliente X baje la bandera");
                InputStream entrada1 = cliente1.getInputStream();
                DataInputStream entra = new DataInputStream(entrada1);
                
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
