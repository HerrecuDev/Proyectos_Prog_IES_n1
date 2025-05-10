
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumnociclo
 */
public class Personaje implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int nivel;
    private String nombre;
    
    public Personaje(String nombre){
        
        this.nivel = 1;
        this.nombre = nombre;
        
        
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }
    public void subirNivel(){
    
        this.nivel++;
        
    }

   
   
    //Generamos el toString : 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personaje{");
        sb.append("nivel=").append(nivel);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
