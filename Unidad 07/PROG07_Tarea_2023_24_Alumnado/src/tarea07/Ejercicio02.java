package tarea07;

import java.util.ArrayList;
import java.util.List;

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
        
        
        // No hay, pues se usa un número fijo de elementos aleatorios
        
        CANTIDAD_ESPECIES_PLANTAS = 10;

        // Rellenamos la lista con aleatorios hasta que haya CANTIDAD_ESPECIES_PLANTAS
        
        
        while (contador_Plantas_Add < 10) {    
            //Genero el aleatorio para el primer List :
            planta_Aleatoria_1 = Utilidades.especiePlantaAleatoria();
            
            //Lo añado al List
            lista_Plantas_1.add(planta_Aleatoria_1);
            
            
            
            //Genero el aleatorio para el segundo List :
            planta_Aleatorio_2 = Utilidades.especiePlantaAleatoria();
            
            lista_Plantas_2.add(planta_Aleatorio_2);
            
            //Y sumamos ya una planta añadida en ambos LIST :
            
            contador_Plantas_Add++;
            
            
            
            
            
        }
        
        
        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------


        
        
        System.out.print("CONTENIDO INICIAL LISTADO 1 : ");
        
        for (int i = 0; i < lista_Plantas_1.size(); i++) {
            
            System.out.print("["+ lista_Plantas_1.get(i) + "]");
            
        }
        
        System.out.println("");
        
        System.out.print("CONTENIDO INICIAL LISTADO 2 : ");
        
        for (int j = 0; j < lista_Plantas_2.size(); j++) {
            
            System.out.print( "["+ lista_Plantas_2.get(j)+ "]");
        }
        

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        

    }
}