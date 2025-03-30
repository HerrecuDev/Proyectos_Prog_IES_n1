/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament6_7_pablo_herrera;

/**
 *
 * @Pablo Herrera
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utilidades {

    // Método para generar un producto aleatorio
    public static String productoAleatorio() {
        List<String> productos = Arrays.asList("Mouse", "Teclado", "Cámara", "Monitor", 
                                               "Auriculares", "Laptop", "Smartphone", 
                                               "Tablet", "Impresora", "Altavoces");
        return productos.get(new Random().nextInt(productos.size()));  // Devuelve un producto aleatorio
    }

}
