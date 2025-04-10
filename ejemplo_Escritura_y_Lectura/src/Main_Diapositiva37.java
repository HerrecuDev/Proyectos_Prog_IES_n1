
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;




public class Main_Diapositiva37 {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        
        Personaje p1;
        
        do {            
            
            System.out.println("Bienvenido al videojuego de PRUEBA!");
            System.out.println("Pulsa A para empezar la partida");
            System.out.println("Marca R para cargar una partida");
            
            
            System.out.println("Pulsa S para salir de la partida");
            
            String solicitud = sc.nextLine().toUpperCase();
            
            
            
            switch (solicitud) {
                case "A":
                    
                    p1 = new Personaje(1, "prueba");
                    
                    
                    
                    juegoIniciado();
                            
                    FileOutputStream partida_Nueva = new FileOutputStream("str.save");
                    ObjectOutputStream out = new ObjectOutputStream(partida_Nueva);
                    out.writeObject(p1);
                    
                    break;
               
                
                default:
                    throw new AssertionError();
            }
            
            
            
            
        } while (salir != true);
        
    }
    
    
    
    
    public static void juegoIniciado() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
                    
                    
                    FileInputStream guardar_Partida = new FileInputStream("str.save");
                    ObjectInputStream objetosstream = new ObjectInputStream(guardar_Partida);
                    Personaje objeto = (Personaje) objetosstream.readObject();
                    System.out.println(objeto);
                    
                   
                    
                    //salir = true;
                    
                    System.out.println("FINALIZAMOS EL JUEGO");
                  
    }

}
