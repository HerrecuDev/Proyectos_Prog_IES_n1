/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_GestionTareas;

/**
 *
 * @author alumnociclo
 */
public class PilaTareas {
    
    
    //Atributos :
    private Nodo top;
    
    //Contructores :
    
    public PilaTareas(){
        
        this.top = null;
    }
    
   //Metodos : 
    
    public void insertarPila(Tarea nuevaTarea){
        
        Nodo nuevoNodo = new Nodo(nuevaTarea);
        
        if (isEmpty() == true) {
            
            top = nuevoNodo;
            
        }
        else{
            
            nuevoNodo.setAbajo(top);
            top = nuevoNodo;
            
        }
        
        
        
    }
    
    public void eliminarTarea(){
        
        if (isEmpty() == true) {
            
            System.out.println("La pila esta vacia");
            
        }
        else{
           top = top.getAbajo();
        }
        
    }
    
    public Tarea  mostrarTarea() throws PilaTareaException {
        
        if (isEmpty() == true) {
            
           throw new PilaTareaException("esta vacia");
            
        }
        else{
            return top.getDato();
           
        }
        
    }
    
    public boolean isEmpty(){
        return top == null;
        
    }

    @Override
    public String toString() {
        return "PilaTareas{" + "top=" + top + '}';
    }
    
    
    
    
  
    
}
