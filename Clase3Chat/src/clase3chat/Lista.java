/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3chat;

/**
 *
 * @author DBustamanteP
 */

//lista enlazada de objetos AtendedordeClientes
public class Lista {
    //puntero
    public AtendedordeClientes raiz = null;
    public AtendedordeClientes ultimo=null;
    
    //metodo que agrega un nuevo objeto a la lista
    public void add (AtendedordeClientes objNodo){
        if(raiz==null){
            raiz=objNodo;
            ultimo=raiz;
        }
        else{
            ultimo.objSig=objNodo;
            ultimo =objNodo;
        }
    }
    
    //recorremos la lista y usamos el metodo imprimir
    public void imprimir(){
        AtendedordeClientes correr = raiz;
        
        while(correr!=null){
            correr.imprimir();
            
            correr=correr.objSig;
        }
    }
}
