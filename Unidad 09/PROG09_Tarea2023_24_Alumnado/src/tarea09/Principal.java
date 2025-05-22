package tarea09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Juego de Memoria. Clase lanzadora
 * @author INDICAR NOMBRE DEL ALUMNO
 */

//Agrego un final para la imagen de fondo :
 

public class Principal extends Application {
    
    @Override

    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("memoria.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Dragon Ball Z GAME! - Pablo Herrera 1ºDAW (2025)");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
        
       
        
    }

    public static void main(String[] args) {
        launch();
    }
}