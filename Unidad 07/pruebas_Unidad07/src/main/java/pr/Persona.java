/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr;

/**
 *
 * @author alumnociclo
 */
public class Persona {
    
    
    String nombre;
    
    public Persona(String n){
        
        nombre = n;
        
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
