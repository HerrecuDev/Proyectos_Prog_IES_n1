/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_polimorfismo;

/**
 *
 * @author alumnociclo
 */
public class ActividadYoga extends Actividad {
    
    private boolean requiereEsterilla;
    
    
    public ActividadYoga(String nombre , boolean esterilla){
        
        super(nombre);
        this.requiereEsterilla = esterilla;
        
    }
    
    
    
    
     @Override
   public String toString(){
       
       StringBuilder sb = new StringBuilder();
       sb.append("YOGA : ").append(nombre).append("Es necesario la esterilla : ").append(requiereEsterilla);
       
       return sb.toString();
       
   }
    
}
