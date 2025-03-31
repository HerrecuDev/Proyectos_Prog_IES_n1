

package ej_a_unidad08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ej_1 {

    
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        String ruta = "";
        File carpeta;
        
        String tipo = "";
        
        
        
        do {            
            System.out.println("¿Sobre que ruta desea imprimir la informacion ?");
            ruta = sc.nextLine();
            carpeta = new File(ruta);
            
            if (!carpeta.exists()) {
                
                throw new FileNotFoundException();
                
            }
            
            muestraInfoRuta(carpeta);
            
            
            
            
        } while (!ruta.equals(" "));
        
        System.out.println("SALIMOS DEL PROGRAMA");
        
    }

    
        public static void muestraInfoRuta(File fichero){

            String tipo = "";

            if (fichero.isFile()) {

                tipo = "[A]";

                System.out.println(tipo + " " +  fichero.getName());


            }
            

            else if(fichero.isDirectory()){

                File [] carpeta = fichero.listFiles();

                for (File file : carpeta) {

                    if (file.isDirectory()) {

                        tipo = "[*]";
                        System.out.println(tipo +" " + file.getName());

                    }

                    else{
                        tipo = "[A]";
                        System.out.println(tipo +" " + file.getName());

                    }



                }
            
            
            }  
        }
        
        
}
