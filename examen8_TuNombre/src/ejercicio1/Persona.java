
package ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author migue
 */
public class Persona {
    
    //Variable de clase
    private static int contador=0;  //Personas creadas hasta ahora
    
    
    //Variables de objeto
    private final int identificador; //Identificador del contacto
    private String nombre; //Nombre del contacto
    private String apellido1;
    private String apellido2;
    private String tipoContacto; //Tipo de contacto: "amigos", "familia", "trabajo"
    private String direccion; //Direccion del contacto
    private String telefono;
    private String fechaNacimiento;
    public List<String> aficiones;

    public Persona(String nombre,String ape1, String ape2, String tipoContacto, String direccion, String telefono, String fechaNacimiento) {
        this.identificador = ++Persona.contador;
        this.nombre = nombre;
        this.apellido1=ape1;
        this.apellido2=ape2;
        this.tipoContacto = tipoContacto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.aficiones = new ArrayList<>();
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<String> getAficiones() {
        return aficiones;
    }

    public void setAficiones(List<String> aficiones) {
        this.aficiones = aficiones;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    

    @Override
    public String toString(){
        String salida = String.format("#%d;%s;%s;%s;%s;%s;", 
                this.identificador,this.nombre, this.direccion, this.telefono, 
                this.fechaNacimiento, this.tipoContacto);
       
        for(int i=0; i<this.aficiones.size();i++){
            salida +=  this.aficiones.get(i);
            if((i+1)<this.aficiones.size())
                salida += ",";
            else
                salida += ";";
        }
        return salida;
    }
    
    
    
}
