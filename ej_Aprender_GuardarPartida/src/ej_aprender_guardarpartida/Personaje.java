/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_aprender_guardarpartida;

/**
 *
 * @author alumnociclo
 */
public class Personaje {
    
    
    private int nivel;
    private String nombre;
    
    public Personaje(int nivel , String nombre){
        this.nivel = nivel;
        this.nombre = nombre;
    }
    
    //Getter and Setters :

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    //Genero el metodo toString :

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
