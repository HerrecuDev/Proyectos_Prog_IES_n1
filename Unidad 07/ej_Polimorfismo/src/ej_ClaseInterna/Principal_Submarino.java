

package ej_ClaseInterna;


public class Principal_Submarino {

    
    public static void main(String[] args) {
        
        Submarino misubmarino = new Submarino("Napoleon");
        
        Submarino.Misil misil = misubmarino.new  Misil(5);
        
    } 

}
