/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_GestionTareas;

/**
 *
 * @author alumnociclo
 */
public class Nodo {
    
    //Atributos :
    private Tarea dato;
    private Nodo abajo;
    
    //Contructores :
    
    public Nodo(Tarea dato){
        
        this.dato = dato;
        this.abajo = null;
        
    }
    
    //MEtodos :

    public Tarea getDato() {
        return dato;
    }

    public void setDato(Tarea dato) {
        this.dato = dato;
    }

    

    public Nodo getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }
    
    
    
    //ToSTring :

    @Override
    public String toString() {
        return "Nodo{" + "dato = " + dato + " , abajo = " + abajo + '}';
    }
    
    
 
    
    
    
}
