

package frases.txt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class newMain {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String rutaArchivoEntrada = "Recursos/Documentos/frases.txt";
        String rutaArchivoSalida = "Recursos/Documentos/frasesCopia.txt";
        
        FileInputStream fentrada = new FileInputStream(new File(rutaArchivoEntrada));
        FileOutputStream fsalida = new FileOutputStream(new File(rutaArchivoSalida));
        
        byte[] buffer = new byte[256];
        
        int n;
        
        while ((n = fentrada.read(buffer))>= 0) {    
            
            fsalida.write(buffer, 0, n);
            
        }
        
        fentrada.close();
        fsalida.close();
        
        
        
    }

}
