/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack_Contiguo;

import ejemplo_Clase_Stack.MetodosStack;
import ejemplo_Clase_Stack.Nodo_Clase_Stack;
import java.util.Arrays;

/**
 *
 * @author alumnociclo
 */
public class StackContiguo {
    
    //Atributos : 
    private Integer [] miArray;
    private int top;
    
    
    public StackContiguo(){
        
        miArray = new Integer[1];
        top = -1;
    }
    

    
    public void push(Integer n) {
       asegurarCapacidad(); //Si esta completo crea una casilla mas si no , no realiza nada
       top++;
       miArray[top] = n;
        
        
    }

    
    public void pop() {
        if (isEmpty()) {
            
            System.out.println("Esta vacio");
        }else{
             miArray[top] = null; //No es necesario se sobreescribe al hacer top--;
             top--;
        }
        
        
    }

    
    public Integer peek() {
        if (isEmpty()) {
            
            System.out.println("Esta vacio");
            return null;
        }
        else{
            return miArray[top];
        }
        
        
    }

    
    public boolean isEmpty() {
        
        return top == -1;
    }
    
    public void asegurarCapacidad(){
        
        if ((top +1) == miArray.length) {
            
            //Esta completo 
           miArray = Arrays.copyOf(miArray, miArray.length+1); //este metodo coge un Array y le suma 1 posicion mas al array ya existente
           
            
           //Creamos una casilla mas para el siguiente elemento 
           //Ojo: no es muy optimo crear solo una casilla
            
            
        }
        
    }
    
    
   @Override
   public String toString(){
       
        StringBuilder sb = new StringBuilder();
       
      
        for (int i = top; i > -1; i--) {
           
           sb.append(" | ").append(miArray[i]).append("   |" + "\n");
           sb.append("|-----|");
       }
       
        
        return sb.toString();
       
   }
    
}
