/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import Servidor.Atendedor;
import static Servidor.Chat.objLista;
import Servidor.Lista;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            //System.out.println("Error cliente "+e);
            System.out.println("El cliente es el servidor");
            CLienteEsServidor();
        }
    }
    
    private void CLienteEsServidor(){
      
        try {
            //creamos una instancia de la lista
            Lista objLista = new Lista();
            //creamos un ServerSocekte en el puerto 33 para aceptar las conexiones de clientes
            ServerSocket objServer = new ServerSocket(33);
            while(true){
                //espero que llegue una conexion de un cliente 
                Socket clientecin = objServer.accept();
                
                //cuando ya llego el cliente creo un atendedor(hilo) que atienda(comunica) a ese cliente
                Atendedor objA = new Atendedor(clientecin);
                
                //añado ese proceso a la lista de procesos del servidor
                objLista.add(objA);
                
                //arranco el proceso de atender a ese cliente
                objA.start();
                
                //imprimimos la lista de procesos que estan atendiendo a los clientes
                objLista.imprimir();
                
            }
            
        } catch (IOException ex) {
            System.out.println("Excepcion "+ex);
        }
    }
        
public static void main(String[] args) {
        Cliente objCliente = new Cliente();
        Ventana objVentana = new Ventana();
    }
}
