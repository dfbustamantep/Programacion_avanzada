/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4.servidor;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */

//primero debemos ejecutar el chat y despues si el cliente
public class Chat {
    public static Lista objLista = null;
    public ServerSocket objServer = null;
    
    public Chat(){
        try{
            //creamos una instancia de la lista 
            objLista = new Lista();
            //creamos un ServerSocekte en el puerto 33 para aceptar las conexiones de clientes
            objServer = new ServerSocket(33);
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
        }
        catch(Exception e){
            
        }
    }
    
    public static void main(String[] args) {
        Chat objChat = new Chat();
    }
}
