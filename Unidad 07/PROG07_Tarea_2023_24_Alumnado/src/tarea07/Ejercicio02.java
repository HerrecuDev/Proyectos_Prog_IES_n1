package tarea07;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/** Ejercicio 2. Búsqueda de especies de plantas populares
 * @author Profesor
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        
        final int CANTIDAD_ESPECIES_PLANTAS;
        
        // Variables de entrada
        
        List<String> lista_Plantas_1 = new ArrayList<>();
        List<String> lista_Plantas_2 = new ArrayList<>();
        
        
        // Variables auxiliares
        
        String planta_Aleatoria_1;
        String planta_Aleatorio_2;
        
        int contador_Plantas_Add = 0;
       
        // Variables de salida

        
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        System.out.println("BÚSQUEDA DE ESPECIES DE PLANTAS POPULARES");
        System.out.println("-----------------------------------------");
        
        
        
        
        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------

        // No hay, pues se usa un número fijo de elementos aleatorios
        
        CANTIDAD_ESPECIES_PLANTAS = 10;

        // Rellenamos la lista con aleatorios hasta que haya CANTIDAD_ESPECIES_PLANTAS
        
        
        while (contador_Plantas_Add < 10) {    
            //Genero el aleatorio para el primer List :
            planta_Aleatoria_1 = Utilidades.especiePlantaAleatoria();
            
            //Lo añado al List
            lista_Plantas_1.add(planta_Aleatoria_1);
            
            //Y sumamos ya una planta añadida en ambos LIST :
            
            contador_Plantas_Add++;
        }
        
        
        //Inicializo la variable del contador de plantas :
        
        contador_Plantas_Add = 0;
        
        //Repito el bucle anterior :
        
        while (contador_Plantas_Add < 10) {  
            
            //Genero el aleatorio para el segundo List :
            planta_Aleatorio_2 = Utilidades.especiePlantaAleatoria();
            
            lista_Plantas_2.add(planta_Aleatorio_2);
            
            //Y sumamos ya una planta añadida
            
            contador_Plantas_Add++;
            
        }

    
        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        
        
        //CREAMOS LAS DOS PRIMERAS LISTAS DE PLANTAS ALEATORIAMENTE :
        
        
        System.out.print("CONTENIDO INICIAL LISTADO 1 : ");
        
        for (int i = 0; i < lista_Plantas_1.size(); i++) {
            
            System.out.print("["+ lista_Plantas_1.get(i) + "]");
            
        }
        
        System.out.println("");
        
        System.out.print("CONTENIDO INICIAL LISTADO 2 : ");
        
        for (int j = 0; j < lista_Plantas_2.size(); j++) {
            
            System.out.print( "["+ lista_Plantas_2.get(j)+ "]");
        }
        
        System.out.println("");
        
        
        
        
        
        
        //Genero un set que contenga todas las especies POPULARES y otro List para almacenar las especies populares :
        
        //Conjunto:
        Set<String> conjunto_Populares = new TreeSet<>();
        
        //Nuevo List plantas populares :
        List<String> plantas_Populares = new ArrayList<>();
        
        //Recorro ambas listas y si tienen en la misma posicion la misma planta la añadimos a plantas Populares :
        
        for (int i = 0; i < lista_Plantas_1.size(); i++) {
           
            if (lista_Plantas_1.get(i).endsWith(lista_Plantas_2.get(i))) {
                
                plantas_Populares.add(lista_Plantas_1.get(i));
                
            }
            
        }
        
        System.out.println("Las plantas populares son : " + plantas_Populares);

    }
}