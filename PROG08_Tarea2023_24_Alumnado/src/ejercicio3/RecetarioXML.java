package ejercicio3;

import static java.util.stream.DoubleStream.builder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



/**
 * Clase que permite serializar un objeto Recetario al formato XML y 
 viceversa.
 *   
 * @author profe
 */
public class RecetarioXML {
    
     // Ruta del archivo donde se lee y escribe el objeto Recetario
    private String rutaArchivo;
    
    
    
    
   
    // 3.1. Método escribir()
    /**
     * Método que escribe, en un archivo de texto, un objeto Recetario serializable.
     * @param recetario Objeto Recetario serializable para almacenar en el archivo de texto.
     */    
    public void escribir(Recetario recetario) throws ParserConfigurationException {
        // Incluir el código que debe realizar el método
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder br = factory.newDocumentBuilder();
        DOMImplementation implementacion = br.getDOMImplementation();
        
        Document documento = implementacion.createDocument(null, "recetario", null);
        documento.setXmlVersion("1.0");
        
        for (int i = 0; i < recetario.numRecetas(); i++) {
            
            recetario.getRecetas().get(i);
            
           
            
            Element receta = documento.createElement("receta");
            
        }
        
        
        
        
    }
    
    // 3.2. Método leer()
     /**
     * Método que lee, desde un archivo de texto, un objeto Recetario serializado.
     * @return Objecto Recetario que estaba almacenado en el archivo de texto.
     */
    public Recetario leer() {
        return null; // Sustituir este return por el código que resuelve el ejercicio
    }
}
