

package ej_Ingles_sobreColecciones_Diapositiva38;

import java.util.Set;
import java.util.TreeSet;


public class Main {

    
    public static void main(String[] args) {
        
        TreeSet <Aspirante> conjuntoAspirantes = new TreeSet<> (new CompararNotas_Aspirante());
        
        Aspirante n1 = new Aspirante("Pablo", 5, 6);
        Aspirante n2 = new Aspirante("Miguel", 8, 7);
        Aspirante n3 = new Aspirante("Fran", 1, 2);
        
        conjuntoAspirantes.add(n1);
        conjuntoAspirantes.add(n2);
        conjuntoAspirantes.add(n3);
        
        System.out.println(conjuntoAspirantes);
        
    }

}
