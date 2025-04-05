/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_Repaso;

/**
 *
 * @author alumnociclo
 */
public class Coche extends Vehiculo {
    
    //Atributos : 
    private int numPuertas;
    
    
    
    
    public Coche(String marca , String modelo , int numPuertas){
        
        super(marca, modelo);
        
        this.numPuertas = numPuertas;
        
    }
    
    
    
    //Metodos : 

    public int getNumPuertas() {
        return numPuertas;
    }
    
    @Override
    public String toString(){
        return super.toString() + "con " + getNumPuertas() + "puertas";
        
    }
    
}
