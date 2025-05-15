/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Persona;

/**
 * FXML Controller class
 *
 * @author alumnociclo
 */
public class VistaModalController implements Initializable {

    @FXML
    private Label apellidos;
    @FXML
    private Label nombre;
    @FXML
    private Label Edad;
    @FXML
    private TextField campoNombre;
    @FXML
    private TextField campoApellidos;
    @FXML
    private TextField campoEdad;
    
    
    //Variables no mapeadas : 
    Persona persona = null;
    
    private boolean haPulsadoOk = false;

    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        haPulsadoOk = false;
        
        persona = null;
    }    

   
    
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @FXML
    private void agregarPersona(ActionEvent event) {
        
        String nombre = this.campoNombre.getText();
        String apellidos = this.campoApellidos.getText();
        int edad = Integer.parseInt(this.campoEdad.getText());

        Persona p = new Persona(nombre, apellidos, edad);
        
        haPulsadoOk = true;
        
        //Consigo el propio stage de esta vista :

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
