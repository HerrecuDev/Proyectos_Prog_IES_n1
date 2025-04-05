/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_Repaso;

/**
 *
 * @author alumnociclo
 */
public class Vehiculo {
    
    //Atributos : 
    
    private String marca;
    private String modelo;
    
    //Contructores : 
    
    public Vehiculo(String marca , String modelo){
        
        
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
    //Metodos : 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    @Override
    public String toString(){
        
        return "El vehiculo de la marca : " + marca + " y modelo : " + modelo;
        
    }
    
}
