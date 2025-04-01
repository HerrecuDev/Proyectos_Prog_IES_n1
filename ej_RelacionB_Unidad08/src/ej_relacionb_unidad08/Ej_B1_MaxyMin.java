

package ej_relacionb_unidad08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Ej_B1_MaxyMin {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new FileReader("C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\numeros.txt"));
        
        int minimo = 0;
        int maximo = 0;
        boolean primerNumero = true;
    
        while (sc.hasNext()) {
            
            int number = sc.nextInt();
            
            if (primerNumero == true) {
                
                
                minimo = number;
                maximo = number;
                
                primerNumero = false;
                
            }
            else{
                
                if (number > maximo) {
                    
                    maximo = number;
                    
                }
                
                if (number < minimo) {
                    
                    minimo = number;
                    
                }
                
            }
            
           
           
            
        }
        
        System.out.println("El numero Maximo es  = " + maximo);
        System.out.println("El numero Minimo es  = " + minimo);
        
        
        
        
        
    }

}
