

package exament6_7_pablo_herrera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class main_CorreccionExamen {

    public static String PAQUETE = "ReservaPaqueteTuristico";
    
    public static void main(String[] args) {
        
        
        
        
        List<Reserva> listaGeneral = new ArrayList<>();
        
        
        for (int i = 0; i < 4; i++) {
            
            if (i%2 == 0) {
                
                listaGeneral.add(new ReservaHabitacion(i+1, "Pepe", "", 5, "simple", 5));
                
            }
            else{
                listaGeneral.add(new ReservaPaqueteTuristico(i+1, "Paco", "", 8));
            }
            
            
        }
        
        
        
        
        HashMap<String , ColaReserva> mapa = new HashMap<>();
        
        mapa.put("habitacion", new ColaReserva());
        
        mapa.put("paquete", new ColaReserva());
        
        for (Reserva reservaActual : listaGeneral) {
            
            if (reservaActual instanceof ReservaHabitacion) {
                
                mapa.get("habitacion").insertarReserva(reservaActual);
                
            }
            else if(reservaActual.getClass().getSimpleName().equals(PAQUETE)){
                
            mapa.get("paquete").insertarReserva(reservaActual);
            }
            
        }
        
        
    }

}
