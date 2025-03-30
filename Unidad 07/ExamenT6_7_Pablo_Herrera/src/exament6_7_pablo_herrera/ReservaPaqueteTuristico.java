/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament6_7_pablo_herrera;

import java.util.List;

/**
 *
 * @author Pablo
 */
public class ReservaPaqueteTuristico extends Reserva implements AccionesReserva{
    
    //Atributos : 
    private List<String> serviciosAdicionales;
    
    
    
    
    //Contructores :
    
    public ReservaPaqueteTuristico(int id , String nombreCliente , String fecha , int duracion ){
        
        super(id, fecha, fecha, duracion);
        
        this.serviciosAdicionales = null;
        
        
    }
    
    
    
    //Getters and Setters: 
    public List<String> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(List<String> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
    
    
    
    
    //tooString :
    
    @Override
    public String toString(){
        
        return "{ " + super.toString() + "Listado de Servicios Adicionales :  " + serviciosAdicionales + " }";
        
    }
     //Metododos :
    @Override
    public void confirmarReserva() {
       
        setEstado("confirmada");
    }

    @Override
    public void cancelarReserva() {
        setEstado("cancelada");
    }

    @Override
    public void ampliarReserva() {
        
       
    }
    
    
}
