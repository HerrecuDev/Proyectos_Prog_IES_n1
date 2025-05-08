/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package main;

import java.io.IOException;
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
public class NewFXMain extends Application {
    
   @Override
    public void start(Stage primaryStage) {
        
       try {
           
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("/vistas/Vista.fxml"));
           Pane root = (Pane) loader.load();
          
           
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Horizontal");
            primaryStage.show();
           
       } catch (IOException e) {
           
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
