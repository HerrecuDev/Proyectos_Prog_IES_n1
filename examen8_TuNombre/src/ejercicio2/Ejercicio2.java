package ejercicio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author migue
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Manuel", "Perez", "Perez", "amigos", "Av Andalucia", "654121314", "10/10/2000");
        Persona p2 = new Persona("Carlos", "Alcaraz", "Garfia", "familia", "Camino de Coin", "777889966", "05/05/2003");
        Persona p3 = new Persona("Isidoro", "Gercia", "Alvarez", "trabajo", "Plaza de Paco", "737889966", "15/10/1995");

        AgendaContactos agenda = new AgendaContactos();
        agenda.aniadir(p1);
        agenda.aniadir(p2);
        agenda.aniadir(p3);

        escribirAgenda(agenda);
        AgendaContactos personasLeidas = leerAgenda();
        System.out.println("Personas leidas de fichero: \n" + personasLeidas);

    }

    public static void escribirAgenda(AgendaContactos agenda) {
        //A implementar 
        
        try {
            
            FileInputStream in = new FileInputStream("/recursos/ListadoContactos.txt");
            
            
        } catch (Exception e) {
        }

    }

    public static AgendaContactos leerAgenda() {
        //A implementar
        
        try {
            
            FileOutputStream  out = new FileOutputStream("/recursos/contactosSerializados.dat");
            
            
            
            
            
        } catch (Exception e) {
        }
        
        AgendaContactos agenda = null;

        return agenda;
       
    }

}
