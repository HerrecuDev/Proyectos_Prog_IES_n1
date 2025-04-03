/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList_pruebas;

/**
 *
 * @author alumnociclo
 */
public class Nodo<T> {
    
    
    private String dato;
    
    private Nodo siguiente;
    
    //COntructores : 
    
    public Nodo(String d){
        
        dato = d;
        siguiente = null;
        
    }
    
    public void establecerSiguiente(Nodo sig){
        
        
        siguiente = sig;
    }
    
    public String getDato(){
        
        return dato;
    }
    
    public Nodo getSiguiente(){
        
        return siguiente;
    }
    
    
}
