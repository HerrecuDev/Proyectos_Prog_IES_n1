/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_GestionTareas;

/**
 *
 * @author alumnociclo
 */
public class TareaPruebas extends Tarea {
    
    //Atributos : 
    
    private String tipoPrueba;
    
    
    //Contructor : 
    public TareaPruebas(String nombre , String descripcion , int prioridad , String tipoPrueba){
        
        super(nombre, descripcion, prioridad);
        
        this.tipoPrueba = tipoPrueba;
        
    }
    
    //Metodos : 

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }
    
    
}
