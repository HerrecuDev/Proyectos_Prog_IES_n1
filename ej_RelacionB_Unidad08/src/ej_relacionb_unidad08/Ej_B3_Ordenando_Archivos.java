

package ej_relacionb_unidad08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ej_B3_Ordenando_Archivos {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String rutaA = "C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\usa_personas.txt";
        String rutaB = "C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\usa_personas_sorted.txt";
        
        PrintWriter salida = null;
        
        //Salida = donde vamos a escribir : 
        
        salida = new PrintWriter(new FileWriter(rutaB), true);
        
        //Usamos Br para leer el fichero a escribir :
        
        BufferedReader br = new BufferedReader(new FileReader(rutaA));
        
        //inicio un String vacio :
        
        String s;
        
        //inico una lista donde se va a reinscribir mi fichero y poder ordenarlo alfabeticamente: 
        
        List<String> lista = new ArrayList<>();
        
        //Empezamos el bucle donde el bufferredReader va a leer nuestro fichero :
        
        while ((s=br.readLine()) != null) { 
        
        lista.add(s);
            
        }
        //Ordenamos la lista : 
        
        Collections.sort(lista);
        
        //Reccoro la ruta con un for each y escribo la ruta B/Archivo B : 
        
        for (String nombre : lista) {
            
            salida.println(nombre);
            
        }
        
        salida.close();
        br.close();
        
        
    }

}
