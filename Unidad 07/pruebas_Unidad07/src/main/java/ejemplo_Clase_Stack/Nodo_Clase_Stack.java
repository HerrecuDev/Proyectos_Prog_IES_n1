/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_Clase_Stack;



/**
 *
 * @author alumnociclo
 */
public class Nodo_Clase_Stack<T> {
    
    //Atributos : 
    private T dato;
    private Nodo_Clase_Stack siguienteNodo;
    
    public Nodo_Clase_Stack(T dato){
        
        this.dato = dato;
        siguienteNodo = null;
        
    }
    
    //Metodos :

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo_Clase_Stack getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(Nodo_Clase_Stack siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
   
    
    
    //Establecemos un nodo abajo : 
    public void establecerElementoAbajo(Nodo_Clase_Stack n){
        
        this.siguienteNodo = n;
        
    }
    
   
    
    @Override
    public String toString(){
        return "dato = " + dato + " ";
        
    }
    
    
    
    
  
}