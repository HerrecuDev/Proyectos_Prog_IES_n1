

package arrayList_pruebas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Pr_Conjuntos {

    
    public static void main(String[] args) {
        
        Set<Integer> conjunto1 = new TreeSet<> (new CompararObjetos());
       // Set conjunto1 = new LinkedHashSet<>(); //Ordena de menos a mayor pero ocupa mas espacio en memoria.
       // Set conjunto1 = new TreeSet<>();  su ventaja los datos almacenados se ordenan por su valor incoveniente es mas lento que los dos anteriores.
        
       /*
       //EJEMPLO PARA LINKED Y HASHSET :
        int numero = 10;
        conjunto1.add(numero);
        
        
        conjunto1.add(4);
        conjunto1.add(4); //Las colecciones no permite valores repetidos.
        
        System.out.println(conjunto1);
        */
       
       
        //EJEMPLO PARA LOS TreeSet :
        conjunto1.add(1);
        conjunto1.add(5);
        conjunto1.add(7);
        
        System.out.println(conjunto1);
        
        
        Set<Integer> conjunto2 = new TreeSet<>();
        
        conjunto2.add(5);
        conjunto2.add(7);
        conjunto2.add(10);
        conjunto2.add(20);
        
        System.out.println("Conjunto 1 : " + conjunto1);
        System.out.println("Conjunto 2 : " + conjunto2);
        
        
        conjunto1.addAll(conjunto2);
        System.out.println("Union de ambos  : " + conjunto1 );
        
        
        /*
        conjunto1.removeAll(conjunto2);
        
        System.out.println("Diferencia entre ambos : " + conjunto1);
        
        
        /*
        conjunto1.retainAll(conjunto2);
        
        System.out.println("la interseccion de ambos es  :" + conjunto1);
        */
        
        
    }

}
