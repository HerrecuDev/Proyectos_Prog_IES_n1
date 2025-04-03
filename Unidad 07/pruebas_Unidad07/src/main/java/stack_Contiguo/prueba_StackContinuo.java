

package stack_Contiguo;


public class prueba_StackContinuo {

    
    public static void main(String[] args) {
        
        StackContiguo pila = new StackContiguo();
        
        System.out.println("Esta vacio : " + pila.isEmpty());
       
        pila.push(1);
        System.out.println("Esta vacio : " + pila.isEmpty());
        
      // pila.pop();
       //pila.pop();
       
       pila.push(2);
       System.out.println("Esta vacio : " + pila.isEmpty());
       
       System.out.println(pila.toString());
         
        
    }

}
