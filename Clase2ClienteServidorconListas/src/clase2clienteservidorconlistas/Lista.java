/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2clienteservidorconlistas;

/**
 *
 * @author DBustamanteP
 */
//lista enlazada de hilos ProcAtiendeClientes
public class Lista {
    
    //variables que hacen referencia al primer y ultimo nodo de la lista
    ProcAtiendeClientes raiz = null;
    ProcAtiendeClientes ultimo = null;
    
    public Lista(){
    
    }
    
    //metodo que agrega un nodo a la lista
    public void add(ProcAtiendeClientes nodo){
        //si la raiz es null la lista esta vacia
        if(raiz==null){
            nodo=raiz;
            ultimo=raiz;
        }
        //si no esta vacia quiere decir que ya hay nodos en la lista
        else{
            ultimo.sig=nodo;
            ultimo=nodo;
            
        }
    }
    
    //recorre la lista enlazada desde la raiz hasta el ultimo nodo
    public void imprimir(){
        ProcAtiendeClientes correr = raiz;
        
        while(correr != null){
            correr.imprimir();
            correr=correr.sig;
        }
    }
}
