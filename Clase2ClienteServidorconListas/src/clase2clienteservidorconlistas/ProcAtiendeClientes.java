/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2clienteservidorconlistas;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
//la clase ProcAtiendeClientes hereda de la clase Thread la cual usamos para los hilos
public class ProcAtiendeClientes extends Thread {
    
    //el scoket permite la conexion entre el cliente y el servidor a traves del cual podemos intercambiar datos
    Socket c1 = null;
    //lo usamos para recibir datos del cliente a traves de un socket
    InputStream entrada = null;
    //DataInputStream permite leer tipos de datos primitivos  y cadenas UTF-8
    DataInputStream entra = null;
    
    ProcAtiendeClientes sig = null;
    
    //recibimos un socket que hace referencia a un cliente 
    public ProcAtiendeClientes(Socket refS){
        try{
            c1=refS;
            System.out.println("Ya me llego el cliente");
            System.out.println("Estoy esperando el siguiente cliente");
            entrada = c1.getInputStream();
            entra = new DataInputStream(entrada);
                                
        }
        catch(Exception e){
            System.out.print("Error constructor "+e.toString());
        }
    }
    
    public void imprimir(){
        try{
            System.out.println(c1.toString());
        }
        catch(Exception e){
            System.out.println("Error impresion ProcAtiendeClientes "+e);
        }
    }
    
    public void run() {
        try{
            //bucle infinito while
            while(true){
                //en la variable leido almacenamos una cadena UTF-8 enviada por el cliente
                String leido = entra.readUTF();
                System.out.println("El cliente dijo: "+leido);
            }
        
        }
        catch(Exception e){
            System.out.println("Error metodo run "+e);
        }
    }
}
