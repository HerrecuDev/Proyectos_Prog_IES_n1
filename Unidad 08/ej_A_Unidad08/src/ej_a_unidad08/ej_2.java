

package ej_a_unidad08;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import java.util.List;
import java.util.Scanner;


public class ej_2 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String ruta = "";
        File carpeta;
        
        String tipo = "";
        boolean info =  false;
        
        
        do{            
            System.out.println("¿Sobre que ruta desea imprimir la informacion ?");
            ruta = sc.nextLine();
            carpeta = new File(ruta);
            
            
            
            System.out.println("¿Como desea que salga la informacion ? (TRUE MUESTRA TAMAÑO EN BYTES Y FECHA ULT MODIFICACION : FALSE (NOMBRE/TIPO) ");
            info = sc.nextBoolean();
            
            
            sc.nextLine(); //Limpiamos el buffer
            
            muestraInfoRuta(carpeta, info);
            
            
            
            
            
        } while (!ruta.equals(" "));
        
        System.out.println("SALIMOS DEL PROGRAMA");
        
    }

    
        public static void muestraInfoRuta(File fichero , boolean info){

            String tipo = "";
            String datos = "";
            
            List<String> carpeta_Archivos = new ArrayList<>();

            if (fichero.isFile()) {

                tipo = "[A]";

                
                System.out.println(tipo +" " + fichero.getName());
                
            }
            

            else if(fichero.isDirectory() ){

                File [] carpeta = fichero.listFiles();
                List<String> directorios = new ArrayList<>();
                List<String> ficheros = new ArrayList<>();
                
                
                

                for (File file : carpeta) {

                    if (file.isDirectory()) {

                        tipo = "[*]";
                        
                        directorios.add((info? new Date(file.lastModified()).toString() + " " + file.length() : tipo +" " + file.getName() ) );

                    }
                    
                    

                    else{
                        tipo = "[A]";
                        ficheros.add((info? new Date(file.lastModified()).toString() + " " + file.length() : tipo +" " + file.getName() ) );

                    }

                    

                }
                
                Collections.sort(directorios);
                Collections.sort(ficheros);
                
                
                for (int i = 0; i < directorios.size(); i++) {
                   
             
                    System.out.println(directorios.get(i) + " ");
                    
                }
                
                
                for (int i = 0; i < ficheros.size(); i++) {
                   
             
                    System.out.println(ficheros.get(i) + " ");
                    
                }
            
            
            }  
        }
        
    

}
