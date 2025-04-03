/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_Clase_Stack;

/**
 *
 * @author alumnociclo
 */
public class Stack_Enlazado<T> {
    
    //Atributo : 
    private Nodo_Clase_Stack top;
    
    //Contructores : 
    
    public Stack_Enlazado(){
        
        this.top = null;
    }
    
    
    //Metodos :
    
    public void Push(T dato){
        
        Nodo_Clase_Stack nuevoNodo = new Nodo_Clase_Stack(dato);
        
        if (isEmpty()) {
            
            top = nuevoNodo;
            
        }
        else{
            
            nuevoNodo.establecerElementoAbajo(top);
            top = nuevoNodo;
            
        }
        
    }
    
    
    public void pop(){
        
        if (isEmpty()) {
            System.out.println("Esta vacio");
        }
        else{
            top = top.getSiguienteNodo();
        }
       
    }
    
    public T Peek() throws IllegalStateException{
        
        if (isEmpty()) {
            
            throw new IllegalStateException("Esta vacio");
        }
        else{
            return (T) top.getDato();
        }
        
       
        
        
       
    }
    
    public boolean isEmpty(){
        
         return top == null;
    }
    
    
    @Override
    public String toString(){
        
       StringBuilder sb = new StringBuilder();
       
       Nodo_Clase_Stack auxiter = top;
        while (auxiter != null) {      
            
             sb.append(" | ").append(auxiter.getDato()).append("   |");
             sb.append("|-----|");
             
            auxiter = auxiter.getSiguienteNodo();
        }
        return sb.toString();
      
    }
}
