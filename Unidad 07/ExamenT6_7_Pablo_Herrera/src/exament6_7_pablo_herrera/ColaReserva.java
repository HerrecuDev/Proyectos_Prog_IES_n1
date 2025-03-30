/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament6_7_pablo_herrera;

/**
 *
 * @author alumnociclo
 */
public class ColaReserva {
    
    //Atributos : 
    private NodoReserva nodoPrincipal;
    private NodoReserva ultimoNodo;
    
    
    //CONTRUCTOR NO ES NECESARIO HACERLO :
    public ColaReserva(){
        
        this.nodoPrincipal = null;
        this.ultimoNodo = null;
    }
    
    
    //Metodos :
    
    public void insertarReserva(Reserva r){
        
       NodoReserva nodo = new NodoReserva(r);
        
        if (estaVacia()) {
            nodoPrincipal = nodo;
            ultimoNodo = nodo;
            System.out.println("La cola esta vacia");
            
        }
        else{
            ultimoNodo.setSiguiente(nodo);
            ultimoNodo = nodo;
        }
        
        
    }
    
    public void eliminarReserva(){
        
        if (nodoPrincipal == null) {
            
            nodoPrincipal = nodoPrincipal.getSiguiente();
            ultimoNodo = nodoPrincipal;
            
        }
        
        
    }
    public void mostrarReserva(){ //Muestra la reserva al frente de la cola sin eliminarla PEEK
        
        System.out.println(nodoPrincipal.getDato());
        
    }
    
    public boolean estaVacia(){
        
       return nodoPrincipal == null;
        
    }
    
    
    public void recorrerCola(){
        
        NodoReserva aux = nodoPrincipal;
        
        while (aux !=null) {       
            
            System.out.println(aux);
            
            aux = aux.getSiguiente();
            
        }
        
        
    }
    
    
}
