/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament6_7_pablo_herrera;

/**
 *
 * @Pablo Herrera
 */
public class Reserva {
    
    //Atributos : 
    
    private int id;
    private String nombreCliente;
    private String fecha;
    protected int duracion;
    private String estado;
    
    
    public Reserva(int id , String nombre , String fecha , int duracion ){
        
        this.id = id;
        
        this.nombreCliente = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.estado = "pendiente";
        
        
    }
    
    
    //Getter and Setter :

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    //Metodo toString :

    @Override
    public String toString() {
        return "Reserva{" + "id= " + id + ", nombreCliente= " + nombreCliente + ", fecha= " + fecha + ", duracion= " + duracion + ", estado= " + estado + '}';
    }

  
    
    
    
    
}
