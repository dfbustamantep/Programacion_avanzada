/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

/**
 *
 * @author DBustamanteP
 */
public class Lista {
    public Atendedor primero= null;//primer atendedor de la lista
    public Atendedor ultimo=null;//ultimo atendedor de la lista
    
    //agregamos un nuevo atendedor(nodo) a la lista
    public void add(Atendedor nodo){
        
        //si la lista esta vacia (primero==null) el nuevo atendedor se convierte en el primero y el ultimo
        if(primero==null){
            primero = nodo;
            ultimo = primero;
        }
        //si la lista no esta vacia agregamos el nuevo atendedor al final de la lista
        else{
            //me voy a hacer detras del ultimo
            ultimo.sig=nodo;
            
            //añadir el nuevo atendedor al final de la lista
            //ahora soy el ultimo
            ultimo= nodo;
        }
    }
    
    //recorremos la lista por meddio de un while e impimimos la incofrmacion en consola
    public void imprimir(){
        Atendedor correr = primero;
        while(correr!=null){
            correr.imprimir();//llamamos al metodo imprimir de cada atendedor
            correr = correr.sig;
        }
    }
    
    //rrecorremos la lista por medio del bucle while y envaimso un mensaje a cada uno de ellos
    public void enviar(String mensaje){
        Atendedor correr = primero;
        while(correr!=null){
            correr.enviar(mensaje);//llamamos al metodo enviar de cada atendedor
            correr= correr.sig;
        }
        
    }
}
