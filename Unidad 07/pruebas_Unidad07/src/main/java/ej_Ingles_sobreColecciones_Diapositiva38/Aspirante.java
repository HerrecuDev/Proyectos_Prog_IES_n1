/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_Ingles_sobreColecciones_Diapositiva38;

/**
 *
 * @author alumnociclo
 */
public class Aspirante {
    
    //ATributos : 
    private String nombre;
    private int notaReading;
    private int notaListening;
    
    //Contructores : 
    
    public Aspirante(String nombre ,int notaReading , int notaListening){
        
        this.nombre = nombre;
        this.notaReading = notaReading;
        this.notaListening = notaListening;
    }
    
    
    
    //Metodos :

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNotaReading() {
        return notaReading;
    }

    public void setNotaReading(int notaReading) {
        this.notaReading = notaReading;
    }

    public int getNotaListening() {
        return notaListening;
    }

    public void setNotaListening(int notaListening) {
        this.notaListening = notaListening;
    }
    
    
    
    //ToSTring :

    @Override
    public String toString() {
        return "Aspirante{" + nombre + " Suma de notas = " + (notaListening + notaReading) + '}';
    }
   
    
    
    
    
}
