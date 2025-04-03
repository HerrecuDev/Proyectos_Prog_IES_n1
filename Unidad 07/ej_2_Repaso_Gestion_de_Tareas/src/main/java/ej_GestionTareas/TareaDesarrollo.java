/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_GestionTareas;

/**
 *
 * @author alumnociclo
 */
public class TareaDesarrollo extends Tarea{
    
    //ATributos :
    private String modulo;
    
    //Contructores :
    public TareaDesarrollo(String nombre , String descripcion, int prioridad , String modulo){
        
        super(nombre, descripcion, prioridad);
        this.modulo = modulo;
        
        
    }
    
    
    //Metodos :

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    
    
    
    
}
