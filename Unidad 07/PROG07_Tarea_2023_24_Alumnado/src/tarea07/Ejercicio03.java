package tarea07;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/** Ejercicio 3. Calendario de especies de plantas
 * @author Profesor
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        
        
        

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        
        int numero_Plantas = 0;
        int numero_Dias = 0;
        
        String planta_Aleatorio;
        
       //Primero genero un List que contenga 7 tipos de plantas :
       
       List<String> plantas = new ArrayList<>();
       
       //Añado las 7 plantas diferentes al List(Teniendo en cuenta que si se repite alguna vuelva a crear otra :
       
        while (numero_Plantas < 7) { 
            
            planta_Aleatorio = Utilidades.especiePlantaAleatoria();
            
            if (plantas.contains(planta_Aleatorio)) {
                
                planta_Aleatorio = Utilidades.especiePlantaAleatoria();
            }
            else{
                 plantas.add(planta_Aleatorio);
            
            numero_Plantas++;
            }
            
           
            
            
        }
        
        System.out.println(plantas);
        
        
        //Genero un mapa que contenga 7 dias de la semana y las plantas :
        
        LinkedHashMap< LocalDate , String> calendario = new LinkedHashMap<>();
        
        
        
        //Genero la fecha actual con el formato que quiero :
        LocalDate fechaActual  = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        
        
        for (int i = 0; i < 7; i++) {
            
            formato.format(fechaActual);
            
            //calendario.put(fechaActual, plantas);
            
            
            
            //Actualizamos el dia :
            fechaActual = fechaActual.plusDays(1);
      
            
        }
        
        
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("CALENDARIO DE ESPECIES DE PLANTAS");
        System.out.println("---------------------------------");
        
       
   
        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        
        
        //IMPRIMIMOS EL CALENDARIO :
        
        System.out.println("El calendario es :");
        
        for (int i = 0; i < plantas.size(); i++) {
            
            System.out.println(calendario.get(i) + ":" + plantas.get(i));
            
            
        }
 
    }
}