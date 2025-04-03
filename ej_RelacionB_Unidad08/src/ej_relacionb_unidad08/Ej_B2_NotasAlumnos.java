

package ej_relacionb_unidad08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.Scanner;


public class Ej_B2_NotasAlumnos {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Hay dos formas : 
        
        Scanner sc = new Scanner(new File("C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\alumnos_notas.txt"));
        
        
        //CON EL SCANNER ES IGUAL PERO CAMBIANDO ESTA PARTE :
        /*while ((sc.hasNext()) {     
            
            
         String s = sc.nextLine();
         
            
        }*/
        
        //Con el formato de BufferedReader
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\alumnos_notas.txt"));
        
       
        
        String linea = "";
        
        
        
        while ((linea = br.readLine()) != null) {     
            
            
         String[] lineaProcesada = linea.split(" ");
         
         int sumaNotas = 0;
         int numeroNotas = lineaProcesada.length-2;
         
         
         //Desde i  = 2 debido que es donde empiezan las notas :
         
            for (int i = 2; i < lineaProcesada.length; i++) {
                
                //De esta forma pasamos la linea procesada a numero (Integer.parseInt)
                sumaNotas = sumaNotas + Integer.parseInt(lineaProcesada[i]);
                
                
            }
            
            double media =  (double) sumaNotas/ numeroNotas;
            
            System.out.print(lineaProcesada[0] + " " + lineaProcesada[1] );
            
            System.out.printf("media : %.2f%n", media); //Para obtenerlo del formato con ","
         
            
        }
        
        br.close();
        
        
        
        //EXTRA ITERAR UN MAPA POR EL PESO DE LA NOTA MAYOR O MENOR:
        
       
    }

}
