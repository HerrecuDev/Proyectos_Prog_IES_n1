/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament6_7_pablo_herrera;

/**
 *
 * @author alumnociclo
 */
public class NodoReserva {
    
    //ATributos :
    
    private Reserva dato;
    private NodoReserva siguiente;
    
    //Contructores : 
    
    public NodoReserva( Reserva dato){
        
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    //Metodos :

    public Reserva getDato() {
        return dato;
    }

    public void setDato(Reserva dato) {
        this.dato = dato;
    }

    public NodoReserva getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoReserva siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NodoReserva{");
        sb.append("dato=").append(dato);
        sb.append(", siguiente=").append(siguiente);
        sb.append('}');
        return sb.toString();
    }

  
    

    
    
    
}
