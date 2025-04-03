/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_GestionTareas;

/**
 *
 * @author alumnociclo
 */
public class PilaTareaException extends Exception {
    
    //Creo un Contructor :
    public PilaTareaException(String msg){
        
        super(msg);
        
        //DEspues si queremos usarla simplemente ponemos : 
        //throws new PilaTareaException(msg)
        
    }
    
}
