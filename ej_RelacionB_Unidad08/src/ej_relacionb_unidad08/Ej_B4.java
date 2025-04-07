

package ej_relacionb_unidad08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ej_B4 {

    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        
        int nombresAñadidos = 0;
        int apellidosAñadidos = 0;
        
        String rutaNombres = "C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\usa_nombres.txt";
        String rutaApellidos = "C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\usa_apellidos.txt";
        
        
        PrintWriter salida = null;
        
        
        
        do {       
            
            System.out.println("¿Cuantos nombres de personas desea generar ?");
            int numeroNombresSolicitados = sc.nextInt();
            
            System.out.println("¿A que archivo desea introducirlo ?");
            String archivoCreado = sc.nextLine();
            
            //Salida donde vamos a escribir los nombres creados aleatoriamente :
            salida = new PrintWriter(new FileWriter(archivoCreado),true);
            
            //Inicio una lista donde vamos a introducir los nuevos nombres creados :
            List<String> nombres = new ArrayList<>();
            
            //Lo mismo para introducir los apellidos :
            List<String> apellidos = new ArrayList<>();
            
            
            
             //Inicio un String vacio :
            String s;
            
            
            //Uso br para leer los dos archivos de donde vamos a sacar los nombre y apellidos :
            
            BufferedReader br = new BufferedReader(new FileReader(rutaNombres));
            
            
            //Añado todos los nombres en su list :
            
            
            while ((s = br.readLine()) != null ) {   
                
                nombres.add(s);
                
            }
            
            //Añado todos los nombres en su list de apellidos :
            
            while ((s = br.readLine()) != null) {
                
                apellidos.add(s);
                
            }
            
           
            
           
            
            
           
            
        } while (salir != false);
        
    }

}
