

package pr_tema08;

import java.io.File;


public class prueba_Recorrer_Carpeta {

    
    public static void main(String[] args) {
        
        File desktop = new File("C:\\Users\\alumnociclo\\Desktop");
        
        File [] archivosDirectorios = desktop.listFiles();
        System.out.println("");
        
        String tipo ="";
        
        for(File ficheroActual : archivosDirectorios){
            
            if (ficheroActual.isDirectory()) {
                
                tipo = "[D]";
                
                
            }
            else if(ficheroActual.isFile()){
                
                tipo = "[A]";
            }
            
            System.out.println(tipo + " " + ficheroActual.getName());
        }
        
        
        
    }

}
