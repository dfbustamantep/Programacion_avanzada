/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3chat;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */

//clase 3 que actua como servidor

public class Clase3Chat {
    Lista objLista = null;
    ServerSocket server = null;
    
    public Clase3Chat(){
        try{
            //creacion de un serversocket para escuahr las comexiones entrantes
            server = new ServerSocket(33);
            //instanciamos un objeto lista           
            objLista = new Lista();
            //bucle infinito
            while(true){
                //espera y acepta una conexion entrnate
                Socket c1 =server.accept();
                //instancia atendedordeclientes para manejar la comunicacion con el cliente
                AtendedordeClientes obj = new AtendedordeClientes(c1);
                
                //agregamos el objeto Atendedordeclientes y lo imprimimos
                objLista.add(obj);
                objLista.imprimir();
                
                try{
                    // Inicia el hilo del objeto AtendedordeClientes para manejar la comunicación con el cliente
                    obj.start();
                }
                catch(Exception e){
                    System.out.println("Error while "+e);
                }
            }
        }
        catch(Exception e){
            System.out.println("Error clase3 "+e);
        }
    }
    public static void main(String[] args) {
        Clase3Chat ch = new Clase3Chat();
    }
    
}
