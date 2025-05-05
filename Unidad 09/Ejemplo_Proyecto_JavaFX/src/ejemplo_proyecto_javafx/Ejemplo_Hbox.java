/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ejemplo_proyecto_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author alumnociclo
 */
public class Ejemplo_Hbox extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) {
         // Asignar 10 píxeles de separación entre los nodos
        HBox caja = new HBox(10); 
        // Agregar un relleno de 15 píxeles para separarlo del borde de la ventana
        caja.setPadding(new Insets(15)); 
        // Llamando al metodo addAll podemos agregar nodos en una sola línea
        caja.getChildren().addAll(new Button("Botón 1"), new Button("Botón 2"), 
                new Button("Botón 3"));
        
               
        Scene s = new Scene(caja);
        primaryStage.setScene(s);
        primaryStage.setTitle("Horizontal");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
