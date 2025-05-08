package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author tu_nombre
 */
public class Ejercicio1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Implementa aquí tu ejercicio 1
        
        String rutaAficiones = System.getProperty("user.dir") + "/recursos/ListadoAficiones.txt";
        String rutaContactos = System.getProperty("user.dir") + "/recursos/ListadoContactos.txt";
        
        //Intancio el objeto :
        
        AgendaContactos agenda = new AgendaContactos();
        
        //Creo un String vacio para poder recorrer todo el archivo : 
        String s;
        
        //Primero leo el archivo de aficiones y creo un enlace con el :
        BufferedReader br = new BufferedReader(new FileReader(rutaAficiones));
        
        //CReo el Listado de Aficiones :
        List<String> listaAficiones = new ArrayList<>();
        
        //PAra extraer los datos del archivo de aficiones :
        while ((s = br.readLine()) != null) {
            
            String [] aficion = s.split(" ");
            
            listaAficiones = Arrays.asList(aficion);
            
            
        }
        
        br.close();
        
        //Para extraer los datos del archivo de contactos :
        
        BufferedReader bd = new BufferedReader(new FileReader(rutaContactos));
        
        while ((s = bd.readLine()) != null) { 
            
            String[] dato = s.split(";");
            
            String nombre  = dato[0];
            //Divido el nombre y sus apellidos :
            String[] dividirNombre = nombre.split(" ");
            String primernombre = dividirNombre[0];
            String primerApellido = dividirNombre[1];
            String segundoApellido = dividirNombre[2];
            
            
            
            String direccion = dato[1];
            String telefono = dato[2];
            String fechaNacimiento = dato[3];
           
            //Pasamos la fecha de String a DateFormmater :
            
            DateTimeFormatter formato ;
            LocalDate localdate;
                    
                    
            String tipoContacto = dato[4];
            
            //Genero el objeto PErsona con todos los datos dentro :
            
            Persona p = new Persona(primernombre, primerApellido, segundoApellido, tipoContacto, direccion, telefono, fechaNacimiento);
            
            
            //Le añadimos al objeto persona 3 aficiones sacadas al azar del listado de Aficiones :
            
           
            
            System.out.println(p + " ");
            //Añadimos al Objeto en AgendaCOntactos :
            agenda.aniadir(p);
            
            
            
        }
        
        
       bd.close();
       
       
       
        //Por ultimo volcamos los contactos de la agenda en un archivo :
        PrintWriter bw = new PrintWriter("recursos/BDCAgendaContactos.txt");
        
        for (int i = 0; i < agenda.numContactos(); i++) {
            
            
            bw.println("ID " + "NOMBRE Y APELLIDO " + "DIRECCION" + "TELEFONO" + "FECHA NACIMIENTO" + "TIPO CONTACTO " + "AFICIONES");
            
            
            //eMPEZAMOS A RELLENAR LA TABLA :
            
            bw.print("["+ i + "]" + agenda.getPersonas().get(i).getNombre() + "    " + agenda.getPersonas().get(i).getDireccion()  );
            
            
            
            
        }
        
        
        bw.close();
    }
    
    
    
    
    
    
   
            
            
            
            
            
            
            
            
            
            
            
            
    //Utilidades que puedes necesitar
 
    public static int generarNumeroAleatorio(int maximoNumeroNoIncluido) {

        //Genera un numero aleatorio entre el 0 y el valor especificado, sin incluirlo.
        Random r = new Random();
        return r.nextInt(maximoNumeroNoIncluido);
    }

    private static Reader FileWriter(String recursosBDCAgendaContactostxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
