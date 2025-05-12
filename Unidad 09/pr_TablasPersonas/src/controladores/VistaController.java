/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import modelos.Persona;

/**
 * FXML Controller class
 *
 * @author alumnociclo
 */
public class VistaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    
    @FXML
    private void cambiarVentana(ActionEvent event){
       NewFXMain.ventana2();
    }
    
    @FXML
    private void cerrarVentana(ActionEvent event){
       NewFXMain.cerrarApp();
    }
    
    @FXML
    private void seleccionar(ActionEvent event){
        Persona p = tabla.getSelectionModel().getSelectedItem();
                
        if (p!= null){
            
            campoNombre.setText(p.getNombre());
            campoApellidos.setText(p.getApellidos());
            campoEdad.setText(p.getEdad());
            
        }
    }
    
    
    @FXML
    private void modificar(ActiontEvent event){
        
        Persona p = tabla.getSelectionModel().getSelectedItem();
        
        
        if (p == null) {
            
            Alerta alerta = new Alert(Alert.Alertype.ERROR);
            alerta.setContectText("Ninguna persona seleccionada");
            alerta.showAndWait();
            
        }else{
            //ALguien de la tabla Seleccionado :
            
            String nombre = campoNombre.getText();
            String apellidos = campoApellidos.getText();
            int edad = Interger.parseInt(campoEdad.getText());
            
            //2. COntrol para evitar Modificar los campos de una persona con los valores de otro integrante.
            Persona aux = new Persona(nombre,apellidos, edad);
            
            if (!personas.contains(aux)) {
                
                p.setNombre(nombre);
                p.setApellido(apellidos);
                p.setEdad(edad);
                
                //HACEMOS UN REFRESH DE LA TABLA :
                
                tabla.refresh();
                
            }
            else{
               Alert alerta = new Alert(Alert.AlertType.WARNING);
               alerta.setContentText("Ya existe un integrante con los datos que estas intentando modificar");
               alerta.showAndWait();
               
               
            }
            
            
        }
    }
    
}
