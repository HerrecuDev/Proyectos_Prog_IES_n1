
package pr;

public class Util {
    
    
    public static <T , E , J> int compararTamano(T[] array1 , E[] array2, J miVariable){
        
        return Math.abs(array1.length -array2.length);
        
    }
    /*
    public static int compararTamano(int [] array1 , boolean [] array2){
        
        return Math.abs(array1.length -array2.length);
        
    }
    
    public static int compararTamaño(int [] array1 , Persona[] array2){
        
        return Math.abs(array1.length -array2.length);
        
    }

    */
}

