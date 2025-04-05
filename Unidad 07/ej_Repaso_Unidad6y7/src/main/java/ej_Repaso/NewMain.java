/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_Repaso;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author pablo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo el listado de vehiculos :
        
        List<Vehiculo> concesionario = new ArrayList<>();
        
        //Creo los difeentes VEHICULOS :
        
        Coche cochen1 = new Coche("Honda", "Ch", 5);
        Coche coche2 = new Coche("--", "--", 1);
        
        Motocicleta moto1 = new Motocicleta("mm", "hh", true);
        Motocicleta moto = new Motocicleta("Honda", "Pasion", true);
        
        
        concesionario.add(moto);
        concesionario.add(moto1);
        concesionario.add(coche2);
        concesionario.add(cochen1);
        
        
        //Genero un mapa para introducir todos los vehiculos :
        
        LinkedHashMap<String , List <Vehiculo>> mapa = new LinkedHashMap<>();
        
        //Y dos listado diferentes :
        
        List<Vehiculo> listaCoches = new ArrayList<>();
        
        List<Vehiculo> listaMotos = new ArrayList<>();
        
        
        mapa.put("CAR", listaCoches);
        
        mapa.put("MOTO", listaMotos);
        
        
        
        
        for (int i = 0; i < concesionario.size(); i++) {
            
            Vehiculo actual = concesionario.get(i);
            
            String tipo = actual.getClass().getSimpleName();
            
            if(tipo.equals("Coche")){
                
                mapa.get("CAR").add(actual);
            }
            else if(tipo.equals("Motocicleta")){
                
                mapa.get("MOTO").add(actual);
            }
    
            
        }
        
        
        
        //rECORREMOS EL MAPA IMPRIMIENDO LOS DETALLES DE CADA LISTA :
        System.out.println("IMPRIMO EL MAPA");
        for (String llaves : mapa.keySet()) {
            
            List<Vehiculo> salida = mapa.get(llaves);
            
            System.out.println(llaves + ": " + salida);
            
            
        }
        
    }
    
}
