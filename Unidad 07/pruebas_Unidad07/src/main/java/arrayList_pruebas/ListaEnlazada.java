/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList_pruebas;

/**
 *
 * @author alumnociclo
 */
public class ListaEnlazada {
    
    private Nodo cabeza;
    
    
    
    public ListaEnlazada(){
        
        cabeza = null;
    }
    
    public boolean estaVacia(){
        return cabeza == null;
        
    }
    
    public void añadirNodo(Nodo n){
        
        if (estaVacia()) {
            cabeza = n;
            
        }
        else{
            Nodo aux = cabeza;
            
            while (aux.getSiguiente() != null) {                
                aux = aux.getSiguiente();
            }
            
            aux.establecerSiguiente(n);
        }
    }
    
    public void recorrerLista(){
        
        Nodo aux = cabeza;
        
        while (aux != null) {    
            
            System.out.print(aux.getDato() + " -->");
            
            aux = aux.getSiguiente();
        }
        
        System.out.println("null");
        
        
        
        
    }
    
    public int lenght(){
        
        int contador = 0;
        Nodo aux = cabeza;
        
        while (aux != null) {  
            contador++;
            aux = aux.getSiguiente();
            
        }
        
        return contador;
        
    }
    
}
