package tarea07;

import java.util.HashSet;
import java.util.Set;

/**
 * Ejercicio 1. Creando jardín botánico
 * @author Profesor
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        final int CANTIDAD_ESPECIES_PLANTAS = 5;
        
        
        
        // Variables de entrada
        Set<String> conjunto_C1 = new HashSet<>();
        Set<String> conjunto_C2 = new HashSet<>();
        
        
        // Variables auxiliares
        
        String planta_Aleatoria_C1;
        String planta_Aleatorio_C2;
        int contador_Especies_Asignadas = 0;
        
        // Variables de salida
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        
        // No hay, pues se usa un número fijo de elementos aleatorios
        
        System.out.println("CONJUNTOS DE ESPECIES DE PLANTAS");
        System.out.println("--------------------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        
        // Rellenamos los conjuntos con especies de plantas aleatorias hasta que haya CANTIDAD_ESPECIES_PLANTAS
        
        //Primero asigno las plantas al primer y segundo conjunto :
        
        
        
        while (contador_Especies_Asignadas < 5) { 
            planta_Aleatoria_C1 = Utilidades.especiePlantaAleatoria();
            planta_Aleatorio_C2 = Utilidades.especiePlantaAleatoria();
            
            if (!conjunto_C1.contains(planta_Aleatoria_C1) && !conjunto_C2.contains(planta_Aleatorio_C2)) {
                
                conjunto_C1.add(planta_Aleatoria_C1);
                conjunto_C2.add(planta_Aleatorio_C2);
                
                contador_Especies_Asignadas++;
                
                
                
            }
            
            
        }
        
        System.out.println("Conjunto C1 = " + conjunto_C1);
        System.out.println("Conjunto C2 = " + conjunto_C2);
        
        
        // Unión de los dos conjuntos
        
        //Creo primero el tercer conjunto :
        Set<String> union = new HashSet<>(conjunto_C1);
        
        //Realizo la union de ambos :
        union.addAll(conjunto_C2);
        
        
        // Intersección de los conjuntos
        
        //Creo de nuevo un conjunto nuevo :
        Set<String> interseccion = new HashSet<>(conjunto_C1);
        
        //Realizo la interseccion :
        interseccion.retainAll(conjunto_C2);
        
        
        
        
        // Diferencia de los conjuntos
        
        //Creo un nuevo conjunto :
        Set<String> diferencia = new HashSet<>(conjunto_C1);
        //Realizo la diferencia entre ambos :
        diferencia.removeAll(conjunto_C2);
        
        
        
        
        //----------------------------------------------
        //              Salida de Resultados 
        //----------------------------------------------
        
        // Recorremos el conjunto y mostramos su contenido por pantalla
        System.out.println("Conjunto C1 = " + conjunto_C1);
        
        System.out.println("Conjunto C2 = " + conjunto_C2);
        
        System.out.println("Union C1 y C2  = " + union);
        
        System.out.println("Interseccion de C1 y C2 = " + interseccion);
        
        System.out.println("La diferencia de C2 - C1 = " + diferencia);
        
    }
}