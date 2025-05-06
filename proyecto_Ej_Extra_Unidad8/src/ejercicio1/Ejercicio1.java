package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Ejercicio 1: Lectura/escritura de una biblioteca de libros en ficheros de texto.
 *
 * @author apellidos y nombre del alumno
 */
public class Ejercicio1 {

    /**
     * Método principal.
     *
     * @param args argumentos que recibe el método
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
        
        
        String rutaLibros = System.getProperty("user.dir") + "/recursos/ListadoLibros.txt";
      
        
        
        //Genero la Biblioteca : 
       Biblioteca biblioteca = new Biblioteca();
       
       System.out.println("Abriendo archivo de libros...");
       
       //Iniciamos un String vacio : 
       String s;
       
       //CReo enlace con la carpeta de la listadoLibros :
        BufferedReader br = new BufferedReader(new FileReader(rutaLibros));
       
        while ((s = br.readLine()) != null) { 
            
            //Primero corto en trozo en cada linea :
            
            String[] parte = s.split(";");
            
            //Genero los tipos de informacion : 
            
            String titulo = parte[0];
            String autor = parte[1];
            
            //Cambio el formato de variable fecha de String a localdate
            String fechaPublicacion = parte[2];
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(fechaPublicacion, formatter);
            
            
            
            String genero = parte[3];
            
            String capitulos = parte[4];
            String [] todosCapitulos = capitulos.split(",");
            
            //Geenro un list para a�adir el listado de libros del autor :
            List<String> lista_Capitulos = Arrays.asList(todosCapitulos);
            
            Libro libro = new Libro(titulo, autor, localDate, genero, lista_Capitulos);
            
            biblioteca.add(libro);
        }

        //Cierro el BufferREader
         br.close();

       

       
        
        System.out.println();
        
        

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        
        //Genero el nuevo Fichero :
        
        PrintWriter bw = new PrintWriter("C:\\Users\\pablo\\Desktop\\Ruta_Ej_Ficheros\\ListadoLibros.txt");
        
        //REcorremos el recetario completo con un bucle for :
        
        bw.println("*********************************************");
        
        bw.println("BIBLIOTECA DE DIFERENTES AUTORES");
        
        bw.println("*********************************************");
        
        for (int i = 0; i < biblioteca.numLibros(); i++) {
            
            bw.println("NOMBRE DEL LIBRO : " + biblioteca.getLibros().get(i).getTitulo());
            bw.println("NOMBRE DEL AUTOR : " + biblioteca.getLibros().get(i).getAutor());
            bw.println("FECHA DE PUBLICAACION : " + biblioteca.getLibros().get(i).getFechaCreacion());
            bw.println("GENERO : " + biblioteca.getLibros().get(i).getGenero());
            bw.println("LISTADO DE CAPITULOS: " + biblioteca.getLibros().get(i).getCapitulos());
            
            
            //Para que aparezca dividido en opciones seria : 
            /*
           String[] paso =  biblioteca.getLibros().get(i).getCapitulos().spliterator()
                    
            for (int j = 0; j < paso.length; j++) {
               
                bw.println((i+1) + "-" + paso[i]);
                
            }
            
             */
            
            
            bw.println("-----------------------------------------------");
            bw.println();
        }
        
        bw.close();
    }
}
