


public class Detector_NumerosBinarios {

    
    public static void main(String[] args) {
        
        int binario = 101010101;
        
        //Pasamos este numero a String :
        
        
        String numFormatoString = Integer.toString(binario);
        
        //Utilizando el metodo Split : 
        
        String [] numBinariosArray = numFormatoString.split("");
        
        for (int i = 0; i < numBinariosArray.length; i++) {
            
            System.out.print("["+numBinariosArray[i]+"]");
            
        }
        
        boolean todoCorrecto = cadenaBinariaCorrecta(numBinariosArray, numBinariosArray.length-1);
        
        System.out.println(" Todo correcto : " + todoCorrecto);
        
    }
    
    public static boolean cadenaBinariaCorrecta(String [] numStringArray , int posActual){
        
        
         //Cadena correcta : 
        if (posActual == -1) {
            
            return true;
            
        }
        
        //Cadena incorrecta : 
        
        if (!numStringArray[posActual].equals("1") && !numStringArray[posActual].equals("0")) {
            
            return false;
            
        }
        
        //Caso general : No he encontrado aun un fallo y quedan casillas por recorrer : 
        
        return cadenaBinariaCorrecta(numStringArray, posActual-1);
        
        
        
       
        
        
        
    }

}
