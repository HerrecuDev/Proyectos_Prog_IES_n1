

package ejemplo_Iterator;

import java.util.Iterator;
import java.util.LinkedList;


public class Main_Iterator {

    
    public static void main(String[] args) {
        
        LinkedList<Integer> miLista = new LinkedList <> ();
        
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        
        
        
        //Forma 1. (For - each): 
        
        for(Integer valorActual : miLista){
            System.out.println(valorActual);
        }
        
        //2. Utilizando objeto Iterator : NO ES COMPATIBLE CON LOS MAPAS :
        
        Iterator<Integer> iter = miLista.iterator();
        
        while (iter.hasNext()) {            
            
            Integer aux = iter.next();
            
            System.out.println(aux);
        }
        
        
        
    }

}
