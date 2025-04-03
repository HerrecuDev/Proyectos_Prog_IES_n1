/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_ClaseInterna;

/**
 *
 * @author alumnociclo
 */
public class Submarino {
    
    private String nombre;
    
    
   class Misil {
       
       int potencia;
       public Misil(int potencia){
           
           this.potencia = potencia;
       }
       
       
       public int getPotencia(){
           
           return potencia;
       }
   }
    
    
    public Submarino(String nombre){
        
        
        this.nombre = nombre;
        
    }
    
    
    public String getNombre(){
        
        return nombre;
    }
    
}
