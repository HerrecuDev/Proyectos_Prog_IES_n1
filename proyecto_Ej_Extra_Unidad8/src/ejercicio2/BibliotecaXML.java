package ejercicio2;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.time.format.DateTimeFormatter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 * Clase que permite serializar un objeto Biblioteca al formato XML y 
 viceversa.
 *   
 * @author profe
 */
public class BibliotecaXML {
    
     // Ruta del archivo donde se lee y escribe el objeto Biblioteca
    private String rutaArchivo;
    
    
    // Objeto Xstream que permite la L/E con archivos XML
    private XStream xstream;

    /**
     * Metodo constructor
     * @param nombreArchivo Ruta del archivo donde se lee y escribe el objeto Biblioteca
     */
    public BibliotecaXML(String nombreArchivo) {
        this.rutaArchivo = nombreArchivo;
        this.xstream = new XStream();
        //Permite asignar privilegios para poder operar con los archivos XML
        this.xstream.allowTypesByWildcard(new String[] { 
            "ejercicio2.**"
        });
    }

    
    // -----------------------------------------------------
    // Ejercicio 2: Metodos que debe implementar el alumnado
    // -----------------------------------------------------
    
    // 3.1. Metodo escribir()
    /**
     * Metodo que escribe, en un archivo de texto, un objeto Biblioteca serializable.
     * @param biblioteca Objeto Biblioteca serializable para almacenar en el archivo de texto.
     */    
    public void escribir(Biblioteca biblioteca) {
        try {
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder br = factory.newDocumentBuilder();
            DOMImplementation implementacion = br.getDOMImplementation();
            
            Document documento = implementacion.createDocument(null, "biblioteca", null);
            documento.setXmlVersion("1.0");
            
            //Genero el elemento raiz :
            
            
            for (int i = 0; i < biblioteca.numLibros(); i++) {
                
                //Cmprobacion 
                System.out.println(biblioteca.numLibros());
                
                
                Libro libroActual = biblioteca.getLibros().get(i);
                
                
                Element secundario = documento.createElement("Libro" + i);
                
                Element libro = documento.createElement("Libro");
                Element autor = documento.createElement("autor");
                Element etiquetaFecha = documento.createElement("fecha");
                Element genero = documento.createElement("Genero");
                
                
                Text nombreLibro = documento.createTextNode(libroActual.getTitulo());
                libro.appendChild(nombreLibro);
                
                documento.getDocumentElement().appendChild(libro);
                
                
                Text autorxLibro = documento.createTextNode(libroActual.getAutor());
                autor.appendChild(autorxLibro);
                
                documento.getDocumentElement().appendChild(autor);
                
                
                
                Text tipogenero = documento.createTextNode(libroActual.getGenero());
                genero.appendChild(tipogenero);
                documento.getDocumentElement().appendChild(genero);
                
               
                documento.getDocumentElement().appendChild(secundario);
               
                
                
                
                
                
                
            }
            
            System.out.println("");
            
            //ESTA PARTE LA DA EL PROFESOR :
            
            //TRANSFORMAR ÁRBOL DOM EN ARCHIVO XML
        //1º Especificamos la fuente de árbol DOM pasandole nuestro "documento"
        DOMSource source = new DOMSource(documento);

        //2º Creamos un transfomador de árboles DOM a documentos XML
        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");

        //3º Creamos el StreamResult, que permitirá volcar el documento XML transformado
        //al archivo de destino.
        StreamResult result = new StreamResult(new File("recursos/Biblioteca.xml"));

        //4º Realizamos la transformación indicando fuente y destino        
        t.transform(source, result);
            
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        
        System.out.println("");
    }
    
    // 3.2. Metodo leer()
     /**
     * Metodo que lee, desde un archivo de texto, un objeto Biblioteca serializado.
     * @return Objecto Biblioteca que estaba almacenado en el archivo de texto.
     */
    public Biblioteca leer() {
        return null; // Sustituir este return por el codigo que resuelve el ejercicio
    }
}
