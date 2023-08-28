/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
public class EscucharServer extends Thread{
    //flujo de entrada para recibir datos del servidor
    InputStream entrada = null;
    //permite leer tipos de datos primitivos en la entrada
    DataInputStream entra = null;
    Socket refSS = null;
    
    //recibimos un socket que le representa la conexion con el servidor
    public EscucharServer(Socket refS){
        try{
            //inicializamos con la referencia del servidor
            refSS = refS;
            //permite leer datos entrantes del servidor
            entrada = refSS.getInputStream();
            //lo inicalizamos co entrada para leer datos primitivos
            entra = new DataInputStream (entrada);
        }
        catch(Exception e1){
            System.out.println("Error EscucharServer"+e1);
        }
    }
    
    public void run(){
        try{
            //bucle infinito
            while(true){
                //leer un mensaje en formato UTF-8 del servidor
                String leido = entra.readUTF();
                System.out.println("El server dijo "+leido);
            }
        }
        catch(Exception e){
            System.out.println("Error run");
        }
    }
}
