

package arrayList_pruebas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class PrColecciones {

    
    public static void main(String[] args) {
        /*
        int [] miArray = {1,2,3};
        System.out.println(miArray);
        
        List miLista = new ArrayList<>();
        
        //Lista<Integer> miLista2 = new LinkedList<>();
        miLista.add(4);
        miLista.add(6);
       
        
        
        
        
        System.out.println(miLista);
        
        //De esta forma añado un numero a una casilla : 
        miLista.add(1,10);
        
        System.out.println(miLista);
        
        //Nos devuelve la posicion donde esta el numero que solicitamos : 
        
        System.out.println(miLista.indexOf(6));
        
        
        List sublista = miLista.subList(1, 3);  //Hasta una posicion mas de mi Lista :
        
        
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(5);
        
        miLista = miLista.subList(1, 3);
        
        System.out.println(miLista);
        
        
        */
        
        
        
        
        
        
        //Nodos : 
        Nodo n1 = new Nodo("primero");
        Nodo n2 = new Nodo("segundo");
        Nodo n3 = new Nodo("tercero");
        Nodo n4 = new Nodo("Cuarto");
        
       ListaEnlazada miListaEnlazada = new ListaEnlazada();
       
       miListaEnlazada.añadirNodo(n1);
       miListaEnlazada.añadirNodo(n2);
       miListaEnlazada.añadirNodo(n3);
       miListaEnlazada.añadirNodo(n4);
       
        System.out.println(miListaEnlazada.lenght());
        
        miListaEnlazada.recorrerLista();
        
        
         
        LinkedList<Object> lista = new LinkedList<>(); 
        
        lista.add(5);
        lista.add(8);
         
       
    }

}
