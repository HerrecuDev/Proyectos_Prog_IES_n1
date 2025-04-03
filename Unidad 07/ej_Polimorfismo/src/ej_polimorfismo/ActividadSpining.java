/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_polimorfismo;

/**
 *
 * @author alumnociclo
 */
public class ActividadSpining extends Actividad{
    
   private int intensidad;
   
   public ActividadSpining(String nombre , int inten){
       
       super(nombre);
       this.intensidad = inten;
               
       
   }
   
   @Override
   public String toString(){
       
       StringBuilder sb = new StringBuilder();
       sb.append("Spinning : ").append(nombre).append(" intensidad : ").append(intensidad);
       
       return sb.toString();
       
   }
    
}
