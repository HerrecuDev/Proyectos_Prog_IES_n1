

package ejemplo_Clase_Stack;


public class pr_MiClase_Stack{

    
    public static void main(String[] args) {
        
        Stack_Enlazado<Integer> pila = new Stack_Enlazado();
        
        System.out.println("Esta vacio : " + pila.isEmpty());
        pila.pop();
        pila.Push(1);
        System.out.println("Esta vacio : " + pila.isEmpty());
        
        pila.Push(2);
        pila.Push(3);
        pila.Push(6);
        
        System.out.println(pila.toString());
        
        
        System.out.println(pila.Peek());
        
        pila.pop();
        
        System.out.println(pila.toString());
         
        
        
    }

}
