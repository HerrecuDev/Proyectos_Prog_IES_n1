
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
            
            String solicitud = sc.nextLine().toUpperCase();
            
            
            
            switch (solicitud) {
                
                //En caso de querer cargar la partida anterior :
                
                case "R":
                    
                    
                    break;
                
                    
                    
                    
                //En caso de EMPEZAR PARTIDA NUEVA :
                
                case "A":
                    
                    p1 = new Personaje(1, "nueva Partida");
                    
                  
                    FileOutputStream partida_Nueva = new FileOutputStream("str.save");
                    ObjectOutputStream out = new ObjectOutputStream(partida_Nueva);
                    out.writeObject(p1);
                    
                    juegoIniciado();
                   
                   
                    sc.nextLine();
                    
                    System.out.println("¿Que desea realizar ? ");
                    System.out.println(" 1 - LUCHAR ");
                    System.out.println(" 2 - Guardar Partida" );
                    System.out.println(" -1 - Terminar");
                    
                    int decision = sc.nextInt();
                    
                            switch (decision) {
                        case 1:
                            
                            int nivel = p1.getNivel();
                            
                            nivel = nivel +1;
                            
                            System.out.println("Ha subido de nivel, su nivel actual es  = " + nivel);
                            
                            System.out.println("---------------------------------------------------------");
                            
                            System.out.println("");
                            
                            break;
                        case 2:
                            
                            System.out.println("¿Que desea realizar ? || ( 0 - Sobreescribir la partida / 1 - Crear una partida nueva");
                            int partida = sc.nextInt();
                            
                            if (partida == 0) {
                                
                            }
                            else if(partida == 1){
                                
                                
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
        
        
                    FileInputStream guardar_Partida = new FileInputStream("C:\\Users\\alumnociclo\\Desktop\\Partidas");
                    ObjectInputStream objetosstream = new ObjectInputStream(guardar_Partida);
                    Personaje objeto = (Personaje) objetosstream.readObject();
                    System.out.println(objeto);
                    
                   
                  
    }

}
