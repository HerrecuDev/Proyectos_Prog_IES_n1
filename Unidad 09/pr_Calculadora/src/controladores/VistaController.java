/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author alumnociclo
 */
public class VistaController implements Initializable{

    @FXML
    private TextField campo1;
    @FXML
    private TextField TextOperador1;
    @FXML
    private RadioButton botonSumar;
    @FXML
    private RadioButton BotonRestar;
    @FXML
    private RadioButton BotonMultiplicar;
    @FXML
    private RadioButton BotonDividir;
    @FXML
    private TextField TextOperador2;
    @FXML
    private TextField campo2;
    @FXML
    private TextField campo3;
    @FXML
    private TextField textoResultado;
    @FXML
    private TextField resultado;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        //ToggleGroup tg = new ToggleGroup();
        
        //AHora metemos todos los botones dentro de toggerGroup:
        
        //radioSuma.setToggleGroup(tg)
    }    
    
    private void hacerOperacion(ActionEvent event){
        try {
            
            int operador1 = Integer.parseInt(campo1.getText());
            int operador2 = Integer.parseInt(campo2.getText());

            int resultado = operador1 + operador2;

           // resultadoCampo.setText(Integer.toString());
           
           
           //ASi con todos los botones
           
           /*
            if (radio.) {
                
                resultado = operador1 + operador2;
                
            }
            */
            
        } catch (NumberFormatException e) {
            
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            
            alerta.setTitle("Error de formato");
            alerta.setContentText("Uno de los campos no contiene el formato");
            alerta.showAndWait();
        }
        
       
    }
    
}
