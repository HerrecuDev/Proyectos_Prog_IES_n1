package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Ejercicio 1: Lectura/escritura de un recetario en ficheros de texto.
 *
 * @author profe
 */
public class Ejercicio1 {

    /**
     * Método principal.
     *
     * @param args argumentos que recibe el método
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {

        String rutaRecetas = System.getProperty("user.dir") + "/recursos/ListadoRecetas.txt";
        
        
        //Genero el recetario :
        Recetario recetario = new Recetario();
        
        
        System.out.println("Abriendo archivo de recetas...");
        
        //Inicio un String vacio : 
        
        String s;
        
        BufferedReader br = new BufferedReader(new FileReader(rutaRecetas));
        
        //De esta forma separo la linea completa en varios  tipos : nombre , fecha , ingredientes etc 
        while (( s = br.readLine()) != null) {

            //Primero cortamos en trozos cada linea del archivo .txt
            
            String [] trozolinea = s.split(";");
            
            //Genero los tipos de informacion dentro de la linea : 
            String nombre = trozolinea[0];
            String tipo = trozolinea[1];
            String fecha = trozolinea[2];
            
            //Debo pasar el tipo fecha de String a Localdate:
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(fecha, formatter);
            
            String ingredientes = trozolinea[3];
            
            //Con los ingredientes tambien separamos esa linea interna por "," para dividir ingrediente por ingrediente y añadirlo a un ArrayList :
            String [] ingrediente_individual = ingredientes.split(",");
            
            //Genero el List con la siguiente linea = Arrays.asList(array) :
            List<String> listado_Ingredientes = Arrays.asList(ingrediente_individual);
            
            String intrucciones = trozolinea[4];
            
            Receta receta = new Receta(nombre, tipo, localDate,listado_Ingredientes , intrucciones);
            
            recetario.add(receta);
            
            
            
        }
        
        //Cerramos el bufferedReader
        br.close();
        
        //GENERO EL NUEVO FICHERO :
        
        PrintWriter bw = new PrintWriter(new FileWriter("C:\\Users\\alumnociclo\\Desktop\\recetas\\recetas.txt"));
        
        //RECORREMOS EL RECETARIO COMPLETO CON UN BUCLE FOR :
        
        bw.println("**************************************************************************************************");
        bw.println("LIBRO DE LA RECETA");
        bw.println("***************************************************************************************************");
        
        for (int i = 0; i < recetario.numRecetas(); i++) {
            
           bw.println("NOMBRE DE LA RECETA : " + recetario.getRecetas().get(i).getNombre());
           bw.println("TIPO DE PLATO : " + recetario.getRecetas().get(i).getTipoPlato());
           bw.println("FECHA DE CREACION : " + recetario.getRecetas().get(i).getFechaCreacion());
           bw.println("INGREDIENTES : " + recetario.getRecetas().get(i).getIngredientes());
           
           
           //PAra que aparezca dividido en opciones los pasos a seguir hacemos :
           String [] paso = recetario.getRecetas().get(i).getInstrucciones().split("\\.");
           
            for (int j = 0; j < paso.length; j++) {
                
                bw.println( (i+1)+ " - " + paso[i]);
                
            }
           
           bw.println("-------------------------------------------------------------------------------");
           
           bw.println();
            
        }
       
        
        bw.close();
            
    }
}
