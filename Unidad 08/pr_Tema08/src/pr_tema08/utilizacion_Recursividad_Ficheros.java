/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr_tema08;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alumnociclo
 */
public class utilizacion_Recursividad_Ficheros {
    
    public static void explorarCarpetas(File f , String tab){
        
        
        File[] contenido = f.listFiles();
        
        List<File> ficheros = new ArrayList<>();
        List<File> carpetas = new ArrayList<>();
        
        for(File fileActual : contenido){
            
            if (fileActual.isDirectory()) {
                
                carpetas.add(fileActual);
                
            }
            else{
                ficheros.add(fileActual);
            }
            
        }
        
        
        Collections.sort(carpetas);
        Collections.sort(ficheros);
        
        
        for(File carpetaActual : carpetas){
            
            System.out.println(tab + "[*]" + carpetaActual.getName());
            
            explorarCarpetas(carpetaActual, tab + "\t");
        }
        
        
        for(File ficheroActual : ficheros){
            
            System.out.println(tab + "[A]" + ficheroActual.getName());
            
            
        }
        
    }
    
    
    
    public static void main(String[] args){
        
        File f = new File("C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos");
        
        explorarCarpetas(f, "");
    }
    
}
