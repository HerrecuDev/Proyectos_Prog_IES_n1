

package ej_Repaso;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;



public class main_Ejrepaso {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        
        //Mejor declaramos en una variable el ArrayList Generico : 
        
        List<Vehiculo> listaGenerica = new ArrayList<>();
        
        //Añado 5 Coches y 6 Motos en la lista para ello primero los creo:
        
        //Puedo o crear cada ccohe primero y despues añadirlo o añadir directamente con .add (su contructor).
        
        Coche coche1 = new Coche("Toyota", "Yaris", 2);
        Coche coche2 = new Coche("Dacia", "Yaris", 5);
        Coche coche3 = new Coche("Peugeot", "Yaris", 2);
        Coche coche4 = new Coche("Nissan", "Yaris", 5);
        Coche coche5 = new Coche("MG", "Yaris", 2);
        
        Motocicleta moto1 = new Motocicleta("Yamaha", "Xmax", false);
        Motocicleta moto2 = new Motocicleta("Yamaha", "Tmax", false);
        Motocicleta moto3 = new Motocicleta("Yamaha", "demo", false);
        Motocicleta moto4 = new Motocicleta("Yamaha", "pito", false);
        Motocicleta moto5 = new Motocicleta("Yamaha", "Xmax", false);
        Motocicleta moto6 = new Motocicleta("Yamaha", "Xmax", false);
        
        listaGenerica.add(coche1);
        listaGenerica.add(coche2);
        listaGenerica.add(coche3);
        listaGenerica.add(coche4);
        listaGenerica.add(coche5);
        
        listaGenerica.add(moto1);
        listaGenerica.add(moto2);
        listaGenerica.add(moto3);
        listaGenerica.add(moto4);
        listaGenerica.add(moto5);
        listaGenerica.add(moto6);
        
        
        
        //Ahora declaro el mapa depnde vamos a introducir todos los vehiculos :
        
        LinkedHashMap<String ,List<Vehiculo>> mapa = new LinkedHashMap<>();
        
        //Creo las dos lista una para moto y otra para coche y les añado su clave 
        List<Vehiculo> miListaMoto = new ArrayList<>();
        mapa.put("motocicletas", miListaMoto); //Debo darle el nombre diferente al de la clase.
        
        
        List<Vehiculo> miListaCoches = new ArrayList<>();
        mapa.put("coches", miListaCoches);//Debo darle el nombre a la KEY del LIST diferente al de la clase.
        
        
        
        for (int i = 0; i < listaGenerica.size(); i++) {
           
            Vehiculo vehiculoActual = listaGenerica.get(i);
            
            String tipoClase = vehiculoActual.getClass().getSimpleName();   //Esto basicamente nos devuelve a que tipo de clase Pertenece
            
            
            if (tipoClase.equals("Coche")) {
                
                //El vehiculo actual de la lista general es un coche
                
                //Lo añadimos al diccionario :
                
                mapa.get("coches").add(vehiculoActual);
                
                
            }
            else if(tipoClase.equals("Motocicleta")){
                
                mapa.get("motocicletas").add(vehiculoActual);
            }
            
        }
        
        
        //Recorremos el MAPA imprimiendo los detalles de cada vehiculo :
        
        System.out.println("IMPRIMO EL MAPA :");
        for(String llaves : mapa.keySet()){
            
            List<Vehiculo> valor = mapa.get(llaves);
            
            System.out.println(llaves + " : " + valor);
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
