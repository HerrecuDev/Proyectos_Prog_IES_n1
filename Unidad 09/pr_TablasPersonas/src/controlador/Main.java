/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author migue
 */
public class Main extends Application {
    
    static Stage escenarioPrincipal;

    @Override
    public void start(Stage primaryStage) {
        
    
         escenarioPrincipal = primaryStage;
         
         ventana1();
    }
       
        
    
    
    public static void ventana1(){
        
        try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/vistas/vista.fxml"));
            AnchorPane root = (AnchorPane) loader.load();


            Scene scene = new Scene(root);
            escenarioPrincipal.setScene(scene);
            escenarioPrincipal.show();
         
        }catch(IOException e){
            System.out.println(e.getCause());
        }
        
    }
    
    public static void ventana2(){
        
         try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/vistas/vista2.fxml"));
            Pane root = (Pane)loader.load();


            Scene scene = new Scene(root, 600, 450);
            escenarioPrincipal.setScene(scene);
            escenarioPrincipal.show();
         
        }catch(IOException e){
            System.out.println(e.getCause());
        }
        
    }
    
    public static void cerrarApp(){
        escenarioPrincipal.close();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
