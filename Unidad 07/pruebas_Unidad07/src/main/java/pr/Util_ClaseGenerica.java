
package pr;


public class Util_ClaseGenerica<T> {
    
    T miVariable;
    
    public Util_ClaseGenerica(){
        
        //miVariable = miVar;
        
        
    }
    
    public void obetenerTipoLetraT(){
        
           System.out.println(miVariable.getClass().getSimpleName());
    }
    
    
    //AL NO ESTAR PERDMITIDO CREAR UN ARRAY AUXILIAR DEBEMOS HACERLO ASI :
    public void invertirArray (T[] array){
        
        T aux; //Se interpreta como Integer.
        
        
        for (int i = 0; i < array.length/2; i++) //HAY QUE AVANZAR HASTA LA MITAD DEL ARRAY ORIGINAL PARA NO INVERTIR LOS CAMBIOS 
        {
           
            
            aux = array[i];
            
            array[i] = array[array.length-1-i];
            
            array[array.length-1-i] = aux;
            
            
        }
        
        
       
       
    }
    
    public void imprimirArray(T[] array){
        
        System.out.println("EL array es :");
        
        for (int i = 0; i < array.length; i++) {
            
            
            System.out.print( " " + array[i]);
            
        }
    }
    
   
    
}
