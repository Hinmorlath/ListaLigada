/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;

/**
 *
 * @author Estudiante
 */
public class Nodo {
    private int dato; //dato almacenado en el nodo
    private Nodo siguiente; //apuntador al siguiente nodo
    
    public Nodo(int d){
        //construye un nuevo nodo
         this.dato = d;
         this.siguiente = null; 
    }

    public int getDato() {
        // regresa el dato almacenado en el nodo
        return dato;
    }

    public void setDato(int dato) {
        // cambia el valor del dato almacenado en el nodo
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        //obtienen el nodo soguiente apunto 
        return siguiente;
    }

    public void setSiguiente(Nodo otroNodo) {
        //permitwe apuntar al nodo indicado por el parametro 
        this.siguiente = otroNodo;
    }
    
    
}
