/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package main;

import ejemplo_proyecto_javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author alumnociclo
 */
public class FxMain extends Application {
    
     @Override
    public void start(Stage primaryStage) {
         // Asignar 10 píxeles de separación entre los nodos
         try {
             
             //CARgamos la vista como panel :
             
             FXMLLoader loader = new FXMLLoader();
             loader.setLocation(getClass().getResource("/vista/Vista.fxml"));
             
             //Y ahora los cargamos :
             Pane root = (Pane) loader.load();
             
             //Escenario que envuelve a una -> Escena y -> Panel
             
             Scene scene = new Scene(root, 600,600);
             primaryStage.setScene(scene);
             
             //Imprimir :
             primaryStage.show();
         } catch (Exception e) {
             
             System.out.println(e.getMessage());
         }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
