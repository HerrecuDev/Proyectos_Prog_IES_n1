/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament6_7_pablo_herrera;

/**
 *
 * @author Pablo
 */
public class ReservaHabitacion extends Reserva implements AccionesReserva {
    
    //Atributos : 
    
    private String tipoHabitacion;
    private int numeroPersonas;
    
    
    
    //Contructores :
    
    public ReservaHabitacion(int id , String nombreCliente , String fecha , int duracion , String tipoHabitacion , int numeroPersonas){
        
        super(id, fecha, fecha, duracion);
        
        this.tipoHabitacion = tipoHabitacion;
        this.numeroPersonas = numeroPersonas;
    }
    
    
    
    //Getters and Setters: 
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    
    
    
   //TOsTRING

    @Override
    public String toString(){
        
        return "{ " + super.toString() + "TipoHabitacion : " + tipoHabitacion + "Numero de personas : " + numeroPersonas + " }";
        
    }
    
     //Metododos :

    @Override
    public void confirmarReserva() {
        
        
        //SE PUEDE HACER CON EL SET  O PONIENDO ESTE ATRIBUTO COMO PROTECTED
        setEstado("confirmada");
       
        
    }

    @Override
    public void cancelarReserva() {
        //SE PUEDE HACER CON EL SET  O PONIENDO ESTE ATRIBUTO COMO PROTECTED
        setEstado("cancelada");
        
    }

    //PARA SUMARLE UN DIA MAS A LA DURACION DE LA RESERVA HACEMOS ESTE ATRIBUTO PROTECTED
    @Override
    public void ampliarReserva() {
        
        this.duracion = duracion +1;
        
    }
    

    
}
