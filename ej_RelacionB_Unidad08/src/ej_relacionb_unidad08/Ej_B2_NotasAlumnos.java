

package ej_relacionb_unidad08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.Scanner;


public class Ej_B2_NotasAlumnos {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Scanner sc = new Scanner(new File("C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\numeros.txt"));
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        
        String frase = "";
        
        while ((s = br.readLine()) == null) {     
            
            
         String tokens [] = s.split(" ");
         
            
        }
       
    }

}
