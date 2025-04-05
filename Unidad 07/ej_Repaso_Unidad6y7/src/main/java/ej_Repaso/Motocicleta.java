/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_Repaso;

/**
 *
 * @author alumnociclo
 */
public class Motocicleta extends Vehiculo {
    
    //Atributos :
    private boolean tieneSidecar;
    
    
    public Motocicleta(String marca , String modelo ,boolean tieneSidecar){
        
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }
    
    //Metodos : 

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
    
    
    @Override
    public String toString(){
        
        return super.toString() + "tiene sidecar = " + isTieneSidecar();
    }
    
}
