/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ProgressBar;
import javafx.scene.media.Media;
import javafx.scene.media.MediaErrorEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author alumnociclo
 */
public class Vista2Controller implements Initializable {

    
    //VAriables autocompletadas por el programa SCENE BUILDER :
    @FXML
    private MediaView video;
    @FXML
    private ProgressBar barraProgreso;
    @FXML
    private PieChart grafica;
    
    //VAriables definidas :
    
    private MediaPlayer reproductorMusica;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Video:
        File f = new File("src/assets/video.mp4");
        MediaPlayer mediaPlayer = new MediaPlayer(new  Media(f.toURI().toString()));
        
        video.setMediaPlayer(mediaPlayer);
        
        PieChart.Data queso1 = new PieChart.Data("Android" ,47);
        PieChart.Data queso2 = new PieChart.Data("ios" ,27);
        PieChart.Data queso3 = new PieChart.Data("windows phone" ,13);
        PieChart.Data queso4 = new PieChart.Data("blackberry" ,13);
        
        
        grafica.getData().addAll(queso1 , queso2 ,queso3 , queso4);
        
               modificarBarra();
        
        System.out.println("");
        
        
        reproducirMusica();
    }    
    
    
    public void modificarBarra(){
        
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), (ActionEvent t) -> {
            
            double progresoACtual = barraProgreso.getProgress();
            
            if (progresoACtual < 1.0) {
                
                //Desde 0.0 -> 1.0 (1% se representa con 0.01)
            
                progresoACtual = progresoACtual + 0.01;
                barraProgreso.setProgress(progresoACtual);
       
            }
    
    
           // ESTO DEJARLO COMENTADO DEBIDO A QUE NO PARA DE INTENTAR CAMBIAR DE VENTANA
            /*if (progresoACtual >= 1.0) {
                
                Main.ventana1();
                
            }
            */
        }));
        
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        
    }
     public void reproducirMusica(){
        File f = new File("src/assets/gorila.mp3");
        reproductorMusica = new MediaPlayer(new Media(f.toURI().toString()));
        reproductorMusica.setCycleCount(MediaPlayer.INDEFINITE);
        
        reproductorMusica.play();
    }
    
    private void cerrarApp(ActionEvent event){
       Main.cerrarApp();
    }
    

    
    
    
}
