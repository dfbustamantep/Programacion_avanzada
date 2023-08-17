/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4.servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
public class Atendedor extends Thread {
    Socket refSS = null;//Socket que representa la conexion al cliente
    InputStream entrada = null;//flujo de entrada poara recibir los datos del cliente
    DataInputStream entra = null;//permite leer datos de tipos primitivos de la entrada
    OutputStream salida = null;//flujo de salida para enviar datos al cliente
    DataOutputStream sale = null;//permite escribir tipos de datos primitivos en la salida
    Atendedor sig = null;//una referencia al sigueitne atendedor en la lista d eatendedores
    
    //impeimimos en conmsola la representacion de la conexion del cliente (direccion y puerto)
    public void imprimir(){
        try{
            System.out.println(refSS.toString());
        }   
        catch(Exception e){
        }
    }
    
    //recibimos una instnaca de un Socket para inicializar nuestra variable refSS que representa la conexion con el cliente
    public Atendedor(Socket refS){
        try{
            refSS=refS;
            //inicializacion de flujos de entrada y salida
            entrada= refSS.getInputStream();
            entra = new DataInputStream(entrada);
            salida = refSS.getOutputStream();
            sale = new DataOutputStream(salida);
        }
        catch(Exception e){
            System.out.println("Error atendedor "+e);
        }
    }
    
    //enviamos un mesnaje al cliente
    public void enviar(String mensaje){
        try{
            sale.writeUTF(mensaje);
        }
        catch(Exception e){
        
        }
    }
    
            //se ejecuta cuando se incia el hilo
    public void run(){
        try{
            //lee un mensaje enviado por el cliente
            String leido = entra.readUTF();
            System.out.println("El cliente dijo "+leido );
            Chat.objLista.enviar(leido);
        }
        catch(Exception e){
    
        }
    }
}
