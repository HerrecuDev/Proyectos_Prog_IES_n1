/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Persona;

/**
 * FXML Controller class
 *
 * @author migue
 */
public class VistaController implements Initializable {

    
    //Variables mapeadas con SceneBuilder
    private TextField campoNombre;
    private TextField campoApellidos;
    private TextField campoEdad;
    private TableView<Persona> tabla;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colApellidos;
    @FXML
    private TableColumn colEdad;

   
    @FXML
    private TableView<Persona> tablaPersonas;
    
    
    private MediaPlayer reproductorMusica = null;
    
    //Variables creadas por mi :
     //Array Observable
    private ObservableList<Persona> personas;
    @FXML
    private ImageView ficheroTxt;
    @FXML
    private Button crearPersona;
    @FXML
    private Button eliminar;
    @FXML
    private Button editar;
   
   
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.personas = FXCollections.observableArrayList();
        
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
        
        
        cargarDatosDeFichero();
        
        
        
        //Cargar imagenes en los botones : 
        
        ImageView cuadrobtnAgregar = (ImageView) crearPersona.getGraphic();
        cuadrobtnAgregar.setImage(new Image("assets/agregar.png"));
        
        ImageView cuadrobtneliminar = (ImageView) eliminar.getGraphic();
        cuadrobtneliminar.setImage(new Image("assets/eliminar.png"));
        
        /*
        ImageView cuadrobtnModificar = (ImageView) editar.getGraphic();
        cuadrobtnModificar.setImage(new Image("assets/editar.png"));
        
        */
    }
    
   
    
    private void cargarDatosDeFichero(){
        
        try {
            
          BufferedReader br = new BufferedReader(new FileReader("src/inputs/ficherosPersonas.txt"));
          
          String s;
          
            while((s = br.readLine()) != null) {       
                
                String [] lineaTroceada = s.split(";");
                Persona pers = new Persona(lineaTroceada[0], lineaTroceada[1], Integer.parseInt(lineaTroceada[2]));
                personas.add(pers);
            }
             
            tablaPersonas.setItems(personas); //Vincular/Refrescar la tabla con la lista de objetos
            
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero");
        }catch(IOException e){
            System.out.println("Error en la lectura inicial de personas de fichero");
            
        }
        
       
        
    }

    
    private void agregarPersonaAction(ActionEvent event) {
        String nombre = this.campoNombre.getText();
        String apellidos = this.campoApellidos.getText();
        int edad = Integer.parseInt(this.campoEdad.getText());

        Persona p = new Persona(nombre, apellidos, edad);

        if (!personas.contains(p)) {
            this.personas.add(p);
            tablaPersonas.setItems(personas);
        }else{
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setContentText("El individuo ya esta en la lista de personas");
            alerta.showAndWait();
        }
    }

    @FXML
    private void generarTXTAction(ActionEvent event) throws IOException {
        PrintWriter pt = new PrintWriter(new FileWriter("src/salidas/ficheroPersonas.txt"));
        for(int i = 0; i<personas.size();i++){
            pt.println(personas.get(i).getNombre()+"\t"+personas.get(i).getApellidos()+"\t"+personas.get(i).getEdad());
        }
        pt.close();
        
    }
    
    
    
    private void cambiarVentana(ActionEvent event){
       Main.ventana2();
    }
    
    private void cerrarVentana(ActionEvent event){
       Main.cerrarApp();
    }
    
    
    /*
    private void seleccionar(ActionEvent event){
        Persona p = tabla.getSelectionModel().getSelectedItem();
                
        if (p!= null){
            
            campoNombre.setText(p.getNombre());
            campoApellidos.setText(p.getApellidos());
            //campoEdad.setText(Integer.parseInt(p.getEdad()));
            
        }
    }
    
    */ //cON EL CAMBIO DE VIEW DEL PRIMER ACTO SE BORRA
    private void modificar(ActionEvent event){
        /*
        Persona p = tablaPersonas.getSelectionModel().getSelectedItem();
        
        
        if (p == null) {
            
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setContentText("Ninguna persona seleccionada");
            alerta.showAndWait();
            
        }else{
            //ALguien de la tabla Seleccionado :
            
            String nombre = campoNombre.getText();
            String apellidos = campoApellidos.getText();
            int edad = Integer.parseInt(campoEdad.getText());
            
            //2. COntrol para evitar Modificar los campos de una persona con los valores de otro integrante.
            Persona aux = new Persona(nombre,apellidos, edad);
            
            if (!personas.contains(aux)) {
                
                p.setNombre(nombre);
                p.setApellidos(apellidos);
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

*/
    }
    
    
    private void eliminar(ActionEvent event){
        
        Persona p = tabla.getSelectionModel().getSelectedItem();
        
        if (p== null) {
            //No hay nadie Seleccionado :
            
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setContentText("Ninguna persona seleccionada");
            alerta.showAndWait();
            
        }
        
        else{
            personas.remove(p);
            tabla.refresh();
        }
        
    }


   

    @FXML
    private void desmarcar(ActionEvent event) {
        tabla.getSelectionModel().clearSelection();
    }

    @FXML
    private void cambiarventana(ActionEvent event) {
        Main.ventana2();
    }

    @FXML
    private void desplegarModal(ActionEvent event) throws IOException {
        //Cargamos otra vista superpuesta o vista modal :
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/vistas/vistaModal.fxml"));
        Pane rootModal = (AnchorPane) loader.load();
        
        
        Scene sceneModal = new Scene(rootModal);
        Stage escenarioModal = new Stage();
        
        
        escenarioModal.initModality(Modality.APPLICATION_MODAL);
        escenarioModal.setScene(sceneModal);
        escenarioModal.showAndWait();
    }

   

    

   
    
}
