/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pr;


public class Pruebas_Unidad07 {

    public static void main(String[] args) {
        
        
        //EXPLICACION SOBRE TIPOS BASICOS Y OBJETOS DE UNA CLASE : 
        int x = 5;
        Integer xx = 5; //VARIABLE OBJETO , SU TIPO ES UNA CLASE.(ES LA FORMA DE INTEPRETAR UNA VARIABLE TIPO COMO OBJETO).
        
        
        
      
        Integer [] a ={1,2,3,4,5,6};
        Integer [] b = {1,2,3,4};
        
        Boolean [] c = {true , false};
        Persona pers1 = new Persona("Alvaro");
        Persona pers2 = new Persona("Zacarias");
        Persona [] personas = {pers1, pers2};
        
        
        //Metodo generico T,E y J.
        int diferencia = Util.<Integer,Integer,Persona>compararTamano(a,b , pers1);
        
        System.out.println(diferencia);
        
        
        //CLASE GENERICA :
        
        Util_ClaseGenerica objUtil = new Util_ClaseGenerica<>();
        
        
        objUtil.invertirArray(a);
        
        objUtil.imprimirArray(a);
        
        //AHORA CON EL ARRAY PERSONAS :
        objUtil.invertirArray(personas);
        
        objUtil.imprimirArray(personas);
        
  
        
        
    }
}
