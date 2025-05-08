package ejercicio3;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Ejercicio3 {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        Persona p1 = new Persona("Manuel", "Perez", "Perez", "amigos", "Av Andalucia", "654121314", "10/10/2000");
        Persona p2 = new Persona("Carlos", "Alcaraz", "Garfia", "familia", "Camino de Coin", "777889966", "05/05/2003");
        Persona p3 = new Persona("Isidoro", "Gercia", "Alvarez", "trabajo", "Plaza de Paco", "737889966", "15/10/1995");

        AgendaContactos agenda = new AgendaContactos();
        agenda.aniadir(p1);
        agenda.aniadir(p2);
        agenda.aniadir(p3);

        escribirXML(agenda);

    }

    public static void escribirXML(AgendaContactos agenda){
        
        
        try {
            
           //Codigo ofrecido por profesor
           DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
           DocumentBuilder builder = factory.newDocumentBuilder();
           DOMImplementation implementation = builder.getDOMImplementation();

           Document documento = implementation.createDocument(null, "agenda", null);
           documento.setXmlVersion("1.0");
           
           
            for (int i = 0; i < agenda.numContactos(); i++) {
                
                Element contacto = documento.createElement("Contacto"); 
                
                //Nombre :
                Text nombre = documento.createTextNode(agenda.getPersonas().get(i).getNombre());
                
                documento.appendChild(nombre);
                
                //Apellido :
                
                Text apellido = documento.createTextNode(agenda.getPersonas().get(i).getApellido1() + " " + agenda.getPersonas().get(i).getApellido2());
                
                documento.appendChild(apellido);
                
               
                
                //Tipo :
                
                Text tipo = documento.createTextNode(agenda.getPersonas().get(i).getTipoContacto());
                
                documento.appendChild(tipo);
                
                
                //direccion:
                Text direccion = documento.createTextNode(agenda.getPersonas().get(i).getTipoContacto());
                
                documento.appendChild(direccion);
                
                //Telefono :
                
                Text telefono = documento.createTextNode(agenda.getPersonas().get(i).getTelefono());
                
                documento.appendChild(telefono);
                
                //Nacimiento :
                
                Text nacimiento = documento.createTextNode(agenda.getPersonas().get(i).getFechaNacimiento());
                
                documento.appendChild(nacimiento);
                
              
                
            }
        
        
            
            
            
            
            
            //A implementar 
        System.out.println("");
        
        

        //Hasta aqui tu implementacion
        //Codigo ofrecido por profesor
        DOMSource source = new DOMSource(documento);

        Transformer t;

        t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");

        StreamResult result = new StreamResult(new File("recursos/agenda.xml"));

        t.transform(source, result);

            
        } catch (ParserConfigurationException | TransformerException ex) {
            
            System.out.println("Error :" + ex);
        }
        
        

        
    }
}
