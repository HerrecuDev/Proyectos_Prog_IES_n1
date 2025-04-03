/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_GestionTareas;

/**
 *
 * @author alumnociclo
 */
public abstract class Tarea {
    
    //Atributos : 
    
    private String nombre;
    private String descipcion;
    private int prioridad;
    
    //Contructor : 
    public Tarea(String nombre , String descripcion ,int prioridad ){
        
        this.nombre = nombre;
        this.descipcion = descripcion;
        this.prioridad = prioridad;
        
    }
    
    
    //Metodos :

    public String getNombre() {
        return nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    
    
    //Metodo TooString :

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarea{");
        sb.append("nombre=").append(nombre);
        sb.append(", descipcion=").append(descipcion);
        sb.append(", prioridad=").append(prioridad);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}


