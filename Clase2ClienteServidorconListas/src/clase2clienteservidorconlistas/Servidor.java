/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2clienteservidorconlistas;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */

//punto de entrada para iniciar el servidor y manejar la conexion con los clientes
public class Servidor {
    //instancia de un objeto de la clase lista
    Lista objLista = new Lista();
    
    public Servidor(){
        try{
            System.out.println("Voy a subir al server");
            //el serversocket escuchara las conexiones entrantes de los clientes
            ServerSocket ss = new ServerSocket(33);
            System.out.println("Ya subi al server");
            System.out.println("Esperando el cliente");
            
            ///bucle infinito
            while(true){
                //aceptamos las conexiones 
                Socket c=ss.accept();
                //creamos un hilo para manejar la comunicacion con ese cliente
                ProcAtiendeClientes objAC = new ProcAtiendeClientes(c);
                //agregamos el hilo a la lista
                objLista.add(objAC);
                //imprimimos la lista
                objLista.imprimir();
                //damos inicio a nuestro hilo
                objAC.start();
            }
        }
        catch(Exception e){
            System.out.println("Error servidor");
        }
    }
    
    public static void main(String[] args) {
        Servidor objServer = new Servidor();
    }
}
