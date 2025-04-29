package ejercicio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase encargada de realizar la lectura y escritura de objetos Recetario en archivos binarios.
 * @author profe
 */
public class RecetarioIO {
    
    // Ruta del archivo donde se lee y escribe el objeto Recetario
    private String rutaArchivo;

    /**
     * Método constructor
     * @param archivo Ruta del archivo donde se lee y escribe el objeto Recetario
     */
    public RecetarioIO(String archivo) {
        this.rutaArchivo = archivo;
    }
    
 
    // -----------------------------------------------------
    // Ejercicio 2: Métodos que debe implementar el alumnado
    // -----------------------------------------------------
    
    /**
     * Método que lee, desde un archivo binario, un objeto Recetario serializado.
     * @return Objeto Recetario que estaba almacenado en el archivo binario.
     */
    public Recetario leer() {
        
        
        try {
            
            FileInputStream ruta = new FileInputStream(rutaArchivo );
            
            ObjectInputStream in = new ObjectInputStream(ruta);
            Recetario recetario = (Recetario)in.readObject();
            
            return recetario;
            
            
            
        } catch (IOException | ClassNotFoundException ex) {
            
            System.out.println("Error : " + ex);
        }
        
        
        return null; // Sustituir este return por el código que resuelve el ejercicio 
    }
    
    /**
     * Método que escribe, en un archivo binario, un objeto Recetario serializable.
     * @param recetario Objeto Recetario serializable para almacenar en el archivo binario.
     */   
    public void escribir(Recetario recetario)  {
       
        try {
            
            FileOutputStream ruta = new FileOutputStream(rutaArchivo);

            ObjectOutputStream out = new ObjectOutputStream(ruta);
            out.writeObject(recetario);
        
            
        } catch (IOException ex) {
            
            System.out.println(" Error :" + ex);
        }
        
        
        
        
        
    }
}
