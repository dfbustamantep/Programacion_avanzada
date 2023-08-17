/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author DBustamanteP
 */
public class AtendedordeClientes extends Thread{
    public OutputStream salida = null;
    public DataOutputStream sale = null;
    public InputStream entrada = null;
    public DataInputStream entra = null;
    public Socket reSocket = null;
    public AtendedordeClientes objSig = null;
    
    public AtendedordeClientes(Socket objRef){
        //referncia al siguiente objeto de la lista
        reSocket = objRef;
        try{
            // Configura flujos de entrada y salida para comunicarse con el cliente
            entrada = reSocket.getInputStream();//flujo entrada
            entra = new DataInputStream(entrada);//flujo entrada
            salida = reSocket.getOutputStream();//flujo salida
            sale = new DataOutputStream(salida);//flujo salida
        }
        catch(Exception e){
            System.out.println("Error atendedor "+e);
        }
    }
    
    public void imprimir(){
        try{
            System.out.println(reSocket.toString());
        }
        catch(Exception e){
            System.out.println("Error impresion");
        }
    }
    
    public void run(){
        try{
            while(true){
                //leemos y mostramos los mensajes del cliente
                String leido = entra.readUTF();
                System.out.println("Cliente dijo: "+leido);
            }
        }
        catch(Exception e){
           // System.out.println("Error run");
        }
    }
}
