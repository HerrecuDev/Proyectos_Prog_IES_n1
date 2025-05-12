/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author alumnociclo
 */
public class Vista2Controller implements Initializable {

    
    private PieChart grafica;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        PieChart.Data queso1 = new PieChart.Data("Android" ,47);
        PieChart.Data queso2 = new PieChart.Data("ios" ,27);
        PieChart.Data queso3 = new PieChart.Data("windows phone" ,13);
        PieChart.Data queso4 = new PieChart.Data("blackberry" ,13);
        
        
        grafica.getData().addAll(queso1 , queso2 ,queso3 , queso4);
        
        //SOlicitamos modificar la ventana
        //modificarBarra();
        
        System.out.println("");
        
    }    
    
    /*
    public void modificarBarra(){
        
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), (ActionEvent t) -> {
            
            double progresoACtual = barraProgreso.getProgress();
            
            if (progresoACtual < 1.0) {
                
                //Desde 0.0 -> 1.0 (1% se representa con 0.01)
            
                progresoACtual = progresoACtual + 0.01;
                barraProgreso.setProgress(progresoACtual);
       
            }
            if (progresoACtual >= 1.0) {
                
                Main.ventana1();
                
            }

        }));
        
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        
    }
    
    */
    private void cerrarApp(ActionEvent event){
       Main.cerrarApp();
    }
    private void cambiarVentana1(ActionEvent event){
       Main.ventana2();
    }
    
    
    
}
