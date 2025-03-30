

package exament6_7_pablo_herrera;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class Main_Principal {

    
    public static void main(String[] args) {
        
        
        //EXAMEN PABLO HERRERA :
        
        
        
        //Genero las reservas de Habitacion :
        ReservaHabitacion R1 = new ReservaHabitacion(0, "Fran", "20-03-2025", 1, "Doble", 2);
        ReservaHabitacion R2 = new ReservaHabitacion(1, "Pablo", "21-03-2025", 0, "Individual", 1);
        
        //Genero las reservas de paquete turistico :
        
        ReservaPaqueteTuristico R3 = new ReservaPaqueteTuristico(3, "Paula", "18-03-2025", 4);
        ReservaPaqueteTuristico R4 = new ReservaPaqueteTuristico(4, "Miguel", "28-01-2024", 1);
        
       
        //Genero una lista general de reservas :
        
        List<Reserva> listaGenerica = new ArrayList<>();
        
        //Despues las añadimos :
        
        listaGenerica.add(R1);
        listaGenerica.add(R2);
        listaGenerica.add(R3);
        listaGenerica.add(R4);
        
        
        //Genero el diccionario de RESERVAS :
        
        LinkedHashMap<String , ColaReserva> diccionario = new LinkedHashMap<>();
        
        
        //Genero dos tipos de lista de reserva :
        
        List<Reserva> listaReservaHabitaciones = new ArrayList<>();
        
        List<Reserva> listaReservaParqueTuristico = new ArrayList<>();
        
        
        //Recorro mi lista Generica para ir añadiendo segun su tipo a un listado u otro :
        
        for (int i = 0; i < listaGenerica.size(); i++) {
            
            if (listaGenerica.getClass().getSimpleName().equals("ReservaHabitacion")) {
                
                
                
                
              
            }
            else if(listaGenerica.getClass().getSimpleName().equals("reservaParqueTuristico")){
                
            }
            
        }
        
        
        
        
        
        //Recorro mi diccionario :
        
        System.out.println("IMPRIMIMOS EL DICCIONARIO ");
        for (String clave : diccionario.keySet()) {
            
            
           // List<String> salida = diccionario.
            
            
            System.out.println(clave + " : " );
            
            
            
            
        
        
            
        }
        
        
        
    }

}
