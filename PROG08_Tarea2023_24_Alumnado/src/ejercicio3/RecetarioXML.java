package ejercicio3;

import java.io.File;
import static java.util.stream.DoubleStream.builder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;



/**
 * Clase que permite serializar un objeto Recetario al formato XML y 
 viceversa.
 *   
 * @author profe
 */
public class RecetarioXML {
    
     // Ruta del archivo donde se lee y escribe el objeto Recetario
    private String rutaArchivo;

    public RecetarioXML(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
    
    
    
    
   
    // 3.1. Método escribir()
    /**
     * Método que escribe, en un archivo de texto, un objeto Recetario serializable.
     * @param recetario Objeto Recetario serializable para almacenar en el archivo de texto.
     */    
    public void escribir(Recetario recetario) {
        // Incluir el código que debe realizar el método
        
        try {
            
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder br = factory.newDocumentBuilder();
        DOMImplementation implementacion = br.getDOMImplementation();
        
        Document documento = implementacion.createDocument(null, "recetario", null);
        documento.setXmlVersion("1.0");
            System.out.println(recetario.numRecetas());
        for (int i = 0; i < recetario.numRecetas(); i++) {
            
            Receta recetaACtual = recetario.getRecetas().get(i);
            
            
            //Genero las etiquetas principales :
          
            Element receta = documento.createElement("receta");
            
            
            //Genero las etiquetas secundarias :
            Element nombre = documento.createElement("nombre");
            Text textnombre = documento.createTextNode(recetaACtual.getNombre());
            nombre.appendChild(textnombre);
            documento.getDocumentElement().appendChild(nombre);
            
            Element tipo = documento.createElement("tipo");
            Text texttipo = documento.createTextNode(recetaACtual.getTipoPlato());
            tipo.appendChild(texttipo);
            documento.getDocumentElement().appendChild(tipo);
            
            
            Element fecha = documento.createElement("fecha");
            
            
            
            
            Element ingrediente = documento.createElement("ingredientes");
            Text textingrediente = documento.createTextNode(recetaACtual.getInstrucciones());
            ingrediente.appendChild(textingrediente);
            documento.getDocumentElement().appendChild(ingrediente);
            
            
            //Element Cirrereceta = documento.createElement("receta");
            
            
           
           
            
           
            
        }
        
       
        
         //TRANSFORMAR ÁRBOL DOM EN ARCHIVO XML
        //1º Especificamos la fuente de árbol DOM pasandole nuestro "documento"
        DOMSource source = new DOMSource(documento);

        //2º Creamos un transfomador de árboles DOM a documentos XML
        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");

        //3º Creamos el StreamResult, que permitirá volcar el documento XML transformado
        //al archivo de destino.
        StreamResult result = new StreamResult(new File("recursos/receta.xml"));

        //4º Realizamos la transformación indicando fuente y destino        
        t.transform(source, result);
        
         System.out.println(recetario.numRecetas());
            
        } catch (ParserConfigurationException  | TransformerConfigurationException ex) {
            System.out.println("Error" + ex);
        }
        catch(TransformerException e){
            
            System.out.println("Error" + e);
            
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
