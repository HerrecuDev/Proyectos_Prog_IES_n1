

package mapas;

import java.util.TreeMap;


public class NewMain {

    
    public static void main(String[] args) {
        
        TreeMap<Integer,String> mapa = new TreeMap<>();
        String res = mapa.put(1, "Manolo");  //El res lo utilizamos para comprobar por pantalla que todo funciona bien
        
        res = mapa.put(1, "Jose");
        
        System.out.println(res);
        
        System.out.println(mapa.get(1));
        
        mapa.put(2, "PEPE");
        
        mapa.containsValue("PEPE");
        
        
        mapa.clear();
        
        
        
    }

}
