
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class theLast_Main {

    //Genero datos genericos en mi programa :
    public static Scanner sc = new Scanner(System.in);
    public static Personaje p = null;
    public static int opcion = 0;
   
        public static void main(String[] args) {

            
            try {
                
                while (opcion != -1) {
                
                System.out.println("¿Que quieres hacer?");
                System.out.println(" 1- Cargar Partida");
                System.out.println(" 2 - Nueva Partida");
                System.out.println("-1 - FINALIZAMOS EL PROGRAMA");
                
                opcion = sc.nextInt();
                
                sc.nextLine();
                
                switch (opcion) {
                    case 1:
                       
                        if (cargarPartida() == true) {
                              
                             System.out.println("Cargando la partida");
                             ContinuarPartida();
                        }
                        
                 
                        //Para que continue preguntando :
                        opcion = 0;
                        
                        break;
                    case 2:
                        NuevaPartida();
                        System.out.println("Se ha creado al personaje con exito");
                        
                        System.out.println(p.toString());
                        
                        System.out.println("Entrando a partida : ");
                        
                        ContinuarPartida();
                        
                        opcion = 0;
                        
                        break;
                    case -1:
                        
                        System.out.println("El usuario solicita finalizar el programa");
                        
                        opcion = -1;
                        
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
                
                
               
                    System.out.println("----------------------------------------------------------------");

                    System.out.println("");

                    System.out.println("Menu Principal :");
                
            }
                
            
                
                
            } catch (FileNotFoundException  | ClassNotFoundException e) {
                
                System.out.println( e.getMessage());
                     
            }
            catch(IOException ex){
                
                System.out.println(ex.getMessage());
                
            }
            


        }
        
        public static void ContinuarPartida(){
            

            try {
                
                opcion = 0;

                while(opcion != -1){

                System.out.println("¿Que desea realizar ? ");
                System.out.println("1 - Luchar");
                System.out.println("2 - Guardar Partida");
                System.out.println("-1 - Terminar Partida");

                opcion = sc.nextInt();

                //Limpiamos el Buffer :
                sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("Enhorabuena su personaje ha subido de nivel");
                            p.subirNivel();

                            //IMprimo los datos del Personaje :
                            p.toString();


                            break;
                        case 2:
                            guardarPartida();

                            break;
                        case -1:

                            System.out.println("Saliendo al menu Principal");
                            break;
                        default:

                            System.out.println("Opcion no disponible");
                    }
                
            }
            
                
                
            } catch (IOException e) {
                
                System.out.println(e.getMessage());
            }
         
        }
        
        public static boolean cargarPartida() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            //Creo mi variable booleana para ir comprobando si la partida ha sido cargada o no :
            
             boolean seCargaLaPartida = false;
            
            try {
                
                 
                   //pasamos lo que haya dentro del fichero a un Array : 

                   File[] ficheros = new File("ficheros/").listFiles();

                   if (ficheros.length > 0) {

                       for (int i = 0; i < ficheros.length; i++) {
                           System.out.println("[" + (i+1) + "]" + ficheros[i].getName());

                       }

                       System.out.println("Escribe el nombre de la partida que desea cargar :");
                       String partida = sc.nextLine();

                       File nombre_Part = new File("ficheros/" + partida + ".save");

                       if (nombre_Part.exists()) {

                           System.out.println("Desea cargar la partida \"" + nombre_Part.getName() + "? Si /NO");
                           String confirmacion = sc.nextLine();

                           if (confirmacion.equalsIgnoreCase("si")) {

                               System.out.println("Cargando Partida");

                               FileInputStream FicherosE = new FileInputStream(nombre_Part);
                               ObjectInputStream in = new ObjectInputStream(FicherosE);

                               p = (Personaje) in.readObject();

                               System.out.println("La partida ha sido cargada con exito");
                               System.out.println(p.toString());

                               seCargaLaPartida = true;                    }
                           else{
                               System.out.println("Se cancela la carga");
                           }

                       }
                       else{
                           System.out.println("No existe la partida Seleccionada");

                       }

                   }
                   else{
                       System.out.println("LA CARPETA ESTA VACIA NO TIENE NINGUNA PARTIDA GUARDADA");


                   }

                  
                
                
                
                
                
            } catch (FileNotFoundException e) {
                
                System.out.println(e.getMessage());
                
            }catch (IOException | ClassNotFoundException ex){
                
                System.out.println(ex.getMessage());
                
            }
            
             return seCargaLaPartida;
            
        }
        
        public static void guardarPartida() throws FileNotFoundException, IOException{
            
            
            try {
                    
                    File [] ficheros = new File("ficheros/").listFiles();

                    if (ficheros.length > 0 ) {

                        for (int i = 0; i < ficheros.length; i++) {

                            System.out.println("[" + (i+1) + "]" + ficheros[i].getName());

                        }

                    }

                    else{
                        System.out.println("No existen partidas guardadas");
                    }


                    System.out.println("Escribe el nombre de la partida a guardar , si existe ya se sobrescribira : ");
                    String partida = sc.nextLine();

                    File nombre_Part = new File("ficheros/" + partida + ".save");

                    if (nombre_Part.exists()) {

                        System.out.println("Hay una partida con este nombre , ¿Desea sobrescribirla? SI/NO");
                        String confirmacion = sc.nextLine();

                        if (confirmacion.equalsIgnoreCase("si")) {

                            System.out.println("Guardando partida....");

                            FileOutputStream ficherosS = new FileOutputStream(nombre_Part);
                            ObjectOutputStream out = new ObjectOutputStream(ficherosS);

                            out.writeObject(p);

                            System.out.println("Partida Guardada");

                        }

                        else{
                            System.out.println("Se cancela guardar la partida");
                        }

                    }

                    else{

                        System.out.println("Guardando la partida : ");

                        FileOutputStream ficheroS = new FileOutputStream(nombre_Part);
                        ObjectOutputStream out = new ObjectOutputStream(ficheroS);

                        out.writeObject(p);

                        System.out.println("La partida ha sido guardada con Exito");
                    }
                
                
                
            } catch (FileNotFoundException e) {
                
                System.out.println(e.getMessage());
                
            }catch(IOException ex){
                
                System.out.println(ex.getMessage());
                      
            }
            
            
        }


        public static void NuevaPartida(){
            
            System.out.println("¿Cual es el nombre de tu personaje?");
            
            
            String nombre = sc.nextLine();
            
            p = new Personaje(nombre);
        }
    
}
