

package ejemplo_Clase_Stack;

import java.util.Stack;


public class Ej_Clase_Stack {

    
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        
        System.out.println(pila);
   
        System.out.println(pila.peek());
        
        pila.pop();
        
        System.out.println(pila);
        
    }

}
