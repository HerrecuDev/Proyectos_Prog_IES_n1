package tarea09;

import java.io.File;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Clase Controladora
 * @author INDICAR NOMBRE DEL ALUMNO
 */
public class MemoriaController implements Initializable {

    // definición de variables internas para el desarrollo del juego
    private JuegoMemoria juego;         // instancia que controlará el estado del juego (tablero, parejas descubiertas, etc)
    private ArrayList<Button> cartas;   // array para almacenar referencias a las cartas @FXML definidas en la interfaz 
    private int segundos = 0;             // tiempo de juego
    
    private int intentos = 0;             //Intentos
    
    private boolean primerBotonPulsado = false, segundoBotonPulsado = false; // indica si se han pulsado ya los dos botones para mostrar la pareja
    private int idBoton1, idBoton2;     // identificadores de los botones pulsados
    private boolean esPareja;           // almacenará si un par de botones pulsados descubren una pareja o no
    
    @FXML private AnchorPane main;      // panel principal (incluye la notación @FXML porque hace referencia a un elemento de la interfaz)

    // linea de tiempo para gestionar la finalización del intento al pasar 1.5 segundos
    private final Timeline finIntento = new Timeline(new KeyFrame(Duration.seconds(1.0), e -> finalizarIntento()));
    
    // linea de tiempo para gestionar el contador de tiempo del juego
    private Timeline contadorTiempo;
    
    
    // inicialización de todos los aspectos necesarios
  
    @FXML
    private ImageView memoryGame;
    
    @FXML
    private Label num_Intentos;
    @FXML
    private Label tiempo;
    @FXML
    private Button boton0;
    @FXML
    private Button boton1;
    @FXML
    private Button boton2;
    @FXML
    private Button boton3;
    @FXML
    private Button boton4;
    @FXML
    private Button boton5;
    @FXML
    private Button boton6;
    @FXML
    private Button boton7;
    @FXML
    private Button boton8;
    @FXML
    private Button boton9;
    @FXML
    private Button boton10;
    @FXML
    private Button boton11;
    @FXML
    private Button boton12;
    @FXML
    private Button boton13;
    @FXML
    private Button boton14;
    @FXML
    private Button boton15;
    
    @FXML
    private Button comenzarNuevoJuego;
    @FXML
    private Button SalirDelPrograma;
    
    //VAriables no enlazadas por FXML :
    private MediaPlayer reproductorMusica;
    private int numParejas = 0;
    @FXML
    private ImageView imagenFondo;
    @FXML
    private ImageView imagenFinJuego;
   
    
   
   

    
    
    /**
     * Método interno que configura todos los aspectos necesarios para inicializar el juego.
     *
     * @param url No utilizaremos este parámetro (null).
     * @param resourceBundle No utilizaremos este parámetro (null).
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
         
        // detener el contador de tiempo 
        segundos = 0;
        
        //Restablecemos el numero de intentos :
        intentos = 0;
        num_Intentos.setText(intentos + "");
        
        //Asigno el Fondo del Tablero :
        imagenFondo.setImage(new Image("/tarea09/assets/interfaz/fondoDB.jpg"));
        
        //Asigno la imagen para el fin del juego :
        
        imagenFinJuego.setImage(new Image("/tarea09/assets/interfaz/victoria.jpg"));
        imagenFinJuego.setVisible(false);

        juego = new JuegoMemoria(); // instanciación del juego (esta instancia gestionará el estado de juego)
        juego.iniciarJuego();       // comienzo de una nueva partida
        cartas = new ArrayList<>(); // inicialización del ArrayList de referencias a cartas @FXML
        
        // guarda en el ArrayList "cartas" todas las referencias @FXML a las cartas para gestionarlo cómodamente
        cartas.addAll(Arrays.asList(boton0 ,boton1, boton2, boton3,boton4, boton5, boton6, boton7, boton8, boton9 , boton10 , boton11, boton12 , boton13, boton14, boton15));
        
        //Recorremos el ArrayList de cartas y le vamos asignando a cada boton su reverso :
        
        for (int i = 0; i < cartas.size(); i++) {
            
            ImageView reverso = (ImageView) cartas.get(i).getGraphic();
          
            reverso.setImage(new Image("/tarea09/assets/interfaz/reverso.jpg"));
            
        }
        
        
        
        
        
        // contador de tiempo de la partida (Duration indica cada cuanto tiempo se actualizará)
        contadorTiempo = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
              /// acciones a realizar (este código se ejecutará cada segundo)
              
              //Aqui cada segundo le sumamos 1 y reincribimos la interfaz :
              
              segundos++;
              
              tiempo.setText(segundos + "");  //Forma facil de pasar un int a String.

        }));
        contadorTiempo.setCycleCount(Timeline.INDEFINITE);  // reproducción infinita
        contadorTiempo.play();                                // iniciar el contador en este momento

       
        // música de fondo para que se reproduzca cuando se inicia el juego
        File f = new File("src/tarea09/assets/sonidos/intro_Dragon_ball.mp3");
        reproductorMusica = new MediaPlayer(new Media(f.toURI().toString()));
        reproductorMusica.setCycleCount(MediaPlayer.INDEFINITE);
        
        reproductorMusica.play();
        
        
        
    }
    
    /**
     * Acción asociada al botón <strong>Comenzar nuevo juego</strong> que permite comenzar una nueva partida.
     *
     * Incluye la notación @FXML porque será accesible desde la interfaz de usuario
     * @param event Evento que ha provocado la llamada a este método
     */
    @FXML
    private void reiniciarJuego(ActionEvent event) {
        
     
        
        // detener la reproducción de la música de fondo
        reproductorMusica.pause();
        /* hacer visibles las 16 cartas de juego ya que es posible que no todas estén visibles 
           si se encontraron parejas en la partida anterior */
        
        for (int i = 0; i < cartas.size(); i++) {
            
            cartas.get(i).setVisible(true);
            
        }
        
        
        
        
        // llamar al método initialize para terminar de configurar la nueva partida
        initialize(null,null);
        
      
        
    }

    /**
     * Este método deberá llamarse cuando el jugador haga clic en cualquiera de las cartas del tablero.
     *
     * Incluye la notación @FXML porque será accesible desde la interfaz de usuario
     * @param event Evento que ha provocado la llamada a este método (carta que se ha pulsado)
     */
    @FXML
    private void mostrarContenidoCasilla(ActionEvent event) {

        String cartaId = ((Button) event.getSource()).getId(); // obtener el ID de la carta pulsada

        //Para asignar el numero de cada boton(utilizamos el metodo subString).
        //Pasamos de String a int :
        int numeroBoton = Integer.parseInt(cartaId.substring(5)); //De esta forma nos devolvera lo que haya a la derecha de la posicion 5.
       
        
        //de esta forma asignamos al numero que tiene asignado el boton que pulsamos una imagen
        ImageView asignarImagen = (ImageView) cartas.get(numeroBoton).getGraphic();
        
        
        //Sacamos del back la imagen correspondiente al numero que tiene asignado el boton que pulsamos.
        //Dicha imagen ira cambiando cada vez que iniciamos una nueva partida :
        String Fotoid = juego.getCartaPosicion(numeroBoton);
        
        
        //Aqui asignamos la imagen al objeto imageView que hemos creado antes conforme al id que tiene asignado
        asignarImagen.setImage(new Image("tarea09/assets/cartas/Dragonball/" + (Fotoid)+ ".jpg"));
        
        
        
        
        // gestionar correctamente la pulsación de las cartas (si es la primera o la segunda)
        
        
        if (primerBotonPulsado == false) {
            
            //Realizo el sonido de pulsación :
            pulsacionMusic();
            
            
            idBoton1 = numeroBoton;
            
            primerBotonPulsado = true;
            
        }
        else{
            idBoton2 = numeroBoton;
            
            //Realizo el sonido de pulsación :
            pulsacionMusic();
            
            //Llammaos al metodo ya fin intento que ya esta implementado para que realice un timeline de 1 segundo
            //Para comprobar la segunda carta que pulsamos.
            
            finIntento.play();
           
            
        }
        
        
        
        
        // descubrir la imagen asociada a cada una de las cartas (y ajustar su tamaño al tamaño del botón)
        // identificar si se ha encontrado una pareja o no
        
        if (esPareja == true) {
            
            numParejas++;
            
        }
        
        // reproducir el efecto de sonido correspondiente
        // finalizar intento (usar el timeline para que haga la llamada transcurrido el tiempo definido)

    }

    
    
    /**
     * Este método permite finalizar un intento realizado. Se pueden dar dos situaciones:
     * <ul>
     *    <li>Si se ha descubierto una pareja: en este caso se ocultarán las cartas desapareciendo del tablero. Además, 
     *    se debe comprobar si la pareja descubierta es la última pareja del tablero y en ese caso terminar la partida.</li>
     *    <li>Si NO se ha descubierto una pareja: las imágenes de las cartas deben volver a ocultarse (colocando su imagen a null).</li>
     * </ul>
     * Este método será interno y NO se podrá acceder desde la interfaz, por lo que NO incorpora notación @FXML.
     */  
    private void finalizarIntento() {
        
        // hacer desaparecer del tablero las cartas seleccionadas si forman una pareja
        
         if (juego.compruebaJugada(idBoton1, idBoton2) == true) {
             
                //Realizamos el sonido de Correcto :
                sonidoEspareja();
                
                
                
                cartas.get(idBoton1).setVisible(false);
                cartas.get(idBoton2).setVisible(false);
                
         }
         
       
         
        // ocultar las imágenes de las cartas seleccionadas si NO forman una pareja
        
          else{
             ImageView asignarReversoIdBoton1 = (ImageView) cartas.get(idBoton1).getGraphic();
             ImageView asignarReversoIdBoton2 = (ImageView) cartas.get(idBoton2).getGraphic();
             
             //Realizamos el sonido del error:
             sonidoNoespareja();
             
             asignarReversoIdBoton1.setImage(new Image("/tarea09/assets/interfaz/reverso.jpg"));
             asignarReversoIdBoton2.setImage(new Image("/tarea09/assets/interfaz/reverso.jpg"));
             
             //Actualizamos el valor del numero intentos :
             intentos++;
             num_Intentos.setText(intentos + "");
          }
        
         
         //Una vez comprobamos todo volvemos a resetear los botones :
         
         primerBotonPulsado = false;
        
        // comprobar el final de partida 
        if (juego.compruebaFin() == true) {
            
            // si es final de partida mostra el mensaje de victoria y detener el temporizador y la música
            imagenFinJuego.setVisible(true);
            
        }
        
        


    }

    
    
    /**
     * Este método permite salir de la aplicación.
     * Debe mostrar una alerta de confirmación que permita confirmar o rechazar la acción
     * Al confirmar la acción la aplicación se cerrará (opcionalmente, se puede incluir algún efecto de despedida)
     * Incluye la notación @FXML porque será accesible desde la interfaz de usuario
     */      
    @FXML
    private void salir() {       
        
        // Alerta de confirmación que permita elegir si se desea salir o no del juego
        Alert mensajeFinal = new Alert(Alert.AlertType.CONFIRMATION);
        mensajeFinal.setContentText("¿Quiere cerrar el programa?");
        
        ButtonType botonSi = new ButtonType("Si");
        ButtonType botonNo = new ButtonType("No");
        
        mensajeFinal.getButtonTypes().setAll(botonSi , botonNo);
        
        Optional<ButtonType> salida = mensajeFinal.showAndWait();
        
        if (salida.get() == botonSi) {
             // SOLO si se confirma la acción se cerrará la ventana y el juego finalizará. 
                Platform.exit();
        }
        else if(salida.get() == botonNo){
            // llamar al método initialize para terminar de configurar la nueva partida
             Alert ayuda = new Alert(Alert.AlertType.INFORMATION);
             ayuda.setContentText("Pulsa el boton de comenzar de nuevo si quiere seguir jugando");
             
             //Que espere la decision :
             Optional<ButtonType> guia = ayuda.showAndWait();
        }
        
        

      
    }
    
    
    public void pulsacionMusic() {
        
        File soundclick =  new File("src/tarea09/assets/sonidos/pulsacion.mp3");
        Media click = new Media(soundclick.toURI().toString());
        AudioClip mediaPlayer = new AudioClip(click.getSource());
        mediaPlayer.play();
        
        
    }
    
    public void sonidoEspareja(){
        File soundclick =  new File("src/tarea09/assets/sonidos/correcto.mp3");
        Media click = new Media(soundclick.toURI().toString());
        AudioClip mediaPlayer = new AudioClip(click.getSource());
        mediaPlayer.play();
        
    }
    
    public void sonidoNoespareja(){
        
        File soundclick =  new File("src/tarea09/assets/sonidos/incorrecto.mp3");
        Media click = new Media(soundclick.toURI().toString());
        AudioClip mediaPlayer = new AudioClip(click.getSource());
        mediaPlayer.play();
        
    }
}
