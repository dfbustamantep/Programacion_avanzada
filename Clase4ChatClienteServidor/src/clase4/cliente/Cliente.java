/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4.cliente;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
public class Cliente {
    //instancia de un Socket el cual es el punto final de una conexion cliente servidor
    public Socket objSocket = null;
    //salida de datos hacia el servidor
    public static OutputStream salida = null;
    //nos permite escribir datos primitivos en la salida de datos
    public static DataOutputStream sale= null;
    
    public Cliente(){
        try{
            //conexion con el servidor en localhost(nuestra maquina) en el puerto 33
             //socket que representa la conexion con el servidor
            objSocket = new Socket("localhost",33);
            //escribir datos hacia el servidor
            salida = objSocket.getOutputStream();
            //
            sale = new DataOutputStream(salida);
            
            //creacion e inicio de un hilo para esuchar los mensajes del servidor
            EscucharServer objEscucharServer = new EscucharServer(objSocket);
            objEscucharServer.start();
                    
        }
        catch(Exception e){
            System.out.println("Error cliente "+e);
        }
    }
    
    public static void main(String[] args) {
        Cliente objCliente = new Cliente();
        Ventana objVentana = new Ventana();
    }
}
