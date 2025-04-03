

package ej_GestionTareas;


public class Main_Tarea {

    
    public static void main(String[] args) {
        
        PilaTareas pila = new PilaTareas();
        
        //Agregamos tarea de Desarrollo o pruebas al proyecto :
        
        Tarea tareaDesarrollo1 = new TareaDesarrollo("Pablo", "deberes", 1, "desarrollo");
        Tarea tareaPrueba1 = new TareaPruebas("Miguel", "Dar clase", 2, "Tarea Unidad 7");
        
        pila.insertarPila(tareaPrueba1);
        
        
        
    }

}
