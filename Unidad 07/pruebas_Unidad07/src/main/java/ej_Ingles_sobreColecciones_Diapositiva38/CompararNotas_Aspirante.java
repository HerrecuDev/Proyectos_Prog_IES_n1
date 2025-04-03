/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_Ingles_sobreColecciones_Diapositiva38;

import java.util.Comparator;

/**
 *
 * @author alumnociclo
 */
public class CompararNotas_Aspirante implements Comparator<Aspirante>{
    
    public int compare(Aspirante o1 , Aspirante o2){
        
        if ((o1.getNotaListening() + o1.getNotaReading()) > (o2.getNotaListening() + o2.getNotaReading())) {
            
            return -1;
            
        }else if((o1.getNotaListening() + o1.getNotaReading()) < (o2.getNotaListening() + o2.getNotaReading())){
            
            return 1 ;
        }
        else {
            return 0;
        }
        
        
    }
}
