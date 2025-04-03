


public class Funcion_Arrays {

    
    public static void main(String[] args) {
        
        int[] miArray = {3,1,7,2,8};
        boolean encontrado = encontrarNumero(miArray, 7, miArray.length-1);
        System.out.println("Encontrado : " + encontrado);
        
    }
    
    public static boolean encontrarNumero(int[] array , int buscar , int posACtual){
        
        //Caso base 1 : No se encuentra
        if (posACtual == -1) {
                
                return false;
                
            }
           
        //Caso base 2 : encontrado
       
            
            if (array[posACtual] == buscar) {
                
                return true;
                
            }
            
            
         //Caso general :
            return encontrarNumero(array, buscar, posACtual-1);
           
        
    }

}
