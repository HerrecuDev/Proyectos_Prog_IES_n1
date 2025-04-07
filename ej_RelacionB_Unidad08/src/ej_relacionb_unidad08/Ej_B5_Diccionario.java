

package ej_relacionb_unidad08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;



public class Ej_B5_Diccionario {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        //Creamos una carpeta llamada diccionario y dentro todos los archivos con las letras del abecedario ,  despues se debe repartir cada palabra que hay dentro del
        //fichero diccionario en su correspondiente carpeta segun por la letra que empiece.
        
        //Añado las dos rutas que necesito donde voy a leer y donde voy a crear la carpeta : 
        String rutaPrincipal = "C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\Diccionario\\";
        
        
        //Con esto dejo ya creada la carpeta diccionario :
        File f = new File(rutaPrincipal);
       
        f.mkdir();
        
        
        
        //Genero un listado general para añadir todas las letras: 
        List<String> listadoGeneral = new ArrayList<>();
       //Para poder crear dentro de la carpeta todoas las palabras del abecedario : 
       
       int numero = 0;
       char caracter = 'x';
       
       
       
        for (int i = 65; i <= 90; i++) {
            
            numero = i;
            caracter = (char)numero;
            String letra = Character.toString(caracter) + ".txt";  //Le añado la extension .txt
            
            
            listadoGeneral.add(letra);
            
            
            
        }
        
        //Genero este bucle para crear todos los ficheros en el diccionario :
        
        String nuevoFichero = "";
        for (int i = 0; i < listadoGeneral.size(); i++) {
            
            nuevoFichero = listadoGeneral.get(i);
            
            File txt = new File(rutaPrincipal + nuevoFichero);
            
            txt.createNewFile();
            
            
            
        }
        
        
        //Genero otro lis para añadir todas las palabras que hay dentro del fichero diccionario : 
        List<String> palabras = new ArrayList<>();
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\alumnociclo\\Desktop\\Documentos\\Documentos\\diccionario.txt"));
 
        String palabraActual_fichero;
        
        while ((palabraActual_fichero = br.readLine()) != null) {           
            
            palabras.add(palabraActual_fichero);
            
        }
        
        //Una vez añadido todas las palabras a su fichero tengo que recorrer los ficheros y si la pimera letra de la palabra es igual que la primera letra del fichero se añade :
        
        
        for (int i = 65; i <= 90; i++) {
            
            
            char ascii = (char)i ;
            
            PrintWriter salida = null;
            salida = new PrintWriter(new FileWriter(rutaPrincipal),true);
            
            
            
            
            for (int j = 0; j < palabras.size(); j++) {
            
            String p = palabras.get(i);
            char primeraLetra = p.charAt(0);
            
                if (ascii == primeraLetra) {
                    
                    salida.print(p);
                    
                }
            
            
        }
        
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
       
        
        
    }

}
