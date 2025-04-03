/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList_pruebas;

import java.util.Comparator;

/**
 *
 * @author alumnociclo
 */
public class CompararObjetos implements Comparator<Integer> {
    
    @Override
    public int compare(Integer o1 , Integer o2){
        
        //-1 primer objeto tiene prioridad.
        //0 ambos tienen la misma prioridad.
        // 1 segundo objeto tiene prioridad.
        
        if (o1 > o2) {
            
            return -1;
            
        }else if (o1<o2) {
            
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
