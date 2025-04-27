
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;




public class Main_GuardarPartida {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        
        Personaje p1;
        
        do {            
            
            System.out.println("Bienvenido al videojuego de PRUEBA!");
            System.out.println("Marca R para cargar la partida ANTERIOR");
            System.out.println("Pulsa A para empezar una partida NUEVA");
          
            System.out.println("Pulsa S para salir de la partida");
            
            String marcado = sc.nextLine().toUpperCase();
            
            
            
            switch (marcado) {
                
                //En caso de querer cargar la partida anterior :
                
                case "R":
                    
                        File [] partidas = new File("/partidas_Guardadas").listFiles();

                        if (partidas.length == 0) {

                            System.out.println("No hay ninguna partida guardada");

                        }
                        else{

                            for (int i = 0; i < partidas.length; i++) {

                                    System.out.println( partidas[i].getName() + " ");

                            }

                        }
                    
                    break;
                
                   
                //En caso de EMPEZAR PARTIDA NUEVA :
                
                case "A":
                    
                    System.out.println("¿Que nombre desea ponerle al personaje ?");
                    String nombre = sc.nextLine();
                    p1 = new Personaje(nombre);
                    
                  
                    FileOutputStream partida_Nueva = new FileOutputStream(nombre + ".save");
                    ObjectOutputStream out = new ObjectOutputStream(partida_Nueva);
                    out.writeObject(nombre + ".save");
                    
                    juegoIniciado();
                   
                   
                    sc.nextLine();
                    
                    System.out.println("¿Que desea realizar ? ");
                    System.out.println(" 1 - LUCHAR ");
                    System.out.println(" 2 - Guardar Partida" );
                    System.out.println(" -1 - Terminar");
                    
                    int solicitudDelUsuario = sc.nextInt();
                    
                    switch(solicitudDelUsuario) {
                        case 1:
                            
                            int nivel = p1.getNivel();
                            
                            nivel = nivel +1;
                            
                            System.out.println("Ha subido de nivel, su nivel actual es  = " + nivel);
                            
                            System.out.println("---------------------------------------------------------");
                            
                            System.out.println("");
                            
                            break;
                        case 2:
                            
                            //Recupero la ruta donde estan todas las partidas : 
                            
                            partidas = new File("/partidas_Guardadas").listFiles();
                         
                            System.out.println("¿Que desea realizar ? || ( 0 - Sobrescribir la partida / 1 - Crear una partida nueva");
                            int funcionARealizar = sc.nextInt();
                            
                            if (funcionARealizar == 0) {
                                
                                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombre + ".save"));
                                outputStream.writeObject(nombre + ".save");
                                
                                
                                
                            }
                            else if(funcionARealizar == 1){
                                
                                System.out.println("¿Con que nombre quiere guardar la nueva partida?");
                                String nombrePartida = sc.nextLine();
                                
                                
                                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombrePartida + ".save"));

                                outputStream.writeObject(nombrePartida + ".save");
                                
                                
                                
                            }
                            
                            break;
                        case -1:
                            
                            System.out.println("FIN DE LA PARTIDA");
                            
                            salir = true;
                            
                            break;
                        
                    }
                    
                    break;
                    
                case "S" :
                    
                    System.out.println("Ha decidido salir del programa ");
                    
                    salir = true;
                    
                    break;
               
                
               
            }
            
            
            
            
        } while (salir != true);
        
    }
    
    
    
    
    public static void juegoIniciado() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
                    FileInputStream guardar_Partida = new FileInputStream("/partidas_Guardadas");
                    ObjectInputStream objetosstream = new ObjectInputStream(guardar_Partida);
                    Personaje objeto = (Personaje) objetosstream.readObject();
                    System.out.println(objeto);
                    
                   
                  
    }

}
