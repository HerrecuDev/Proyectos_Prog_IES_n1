

package ej_polimorfismo;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quieres crear un grupo de yoga o de Spinning :");
        
        int num = sc.nextInt();
        
        //DEclaro la actividad : 
        Actividad act1 = null;
        
        switch (num) {
            case 1:
                act1 = new ActividadSpining("FuengiSpinning", 3);
                break;
            case 2:
                
                act1 = new ActividadYoga("Yoga-Fuengi", true);
                
                break;
            default:
                System.out.println("opcion Incorrecta");
        }
        
        System.out.println(act1.toString());
    }

}
