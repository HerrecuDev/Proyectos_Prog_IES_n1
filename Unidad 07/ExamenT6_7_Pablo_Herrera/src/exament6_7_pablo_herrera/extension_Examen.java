

package exament6_7_pablo_herrera;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class extension_Examen {

    
    public static void main(String[] args) {
        
        
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        
        while (lista1.size() < 10) {      
            
            lista1.add(Utilidades.productoAleatorio());
            lista2.add(Utilidades.productoAleatorio());
        }
        
        
        System.out.println("Lista 1 INICIAL :" + lista1);
        System.out.println("Lista 2 INICIAL : " + lista2);
        
        
        for (int i = 0; i < lista1.size(); i++) {
            
            
            if (lista1.get(i).equals(lista2.get(i))) {
                
                lista1.set(i, "*" +  lista1.get(i) + "*");
                
                lista2.set(i, "*" +  lista2.get(i) + "*" );
                
            }
            
        }
        
        
        System.out.println("Lista1 final" + lista1);
        System.out.println("Lista2 final" + lista2);
        
        
        //Ejercicio 2 :
        
        HashSet<String> C1 = new HashSet<>();
        HashSet<String> C2 = new HashSet<>();
        
        
        while (C1.size() < 5) {     
            
            C1.add(Utilidades.productoAleatorio());
            
        }
        while (C2.size() < 5) {     
            
            C2.add(Utilidades.productoAleatorio());
            
        }
        
        
       
        
        
        
        
    }

}
