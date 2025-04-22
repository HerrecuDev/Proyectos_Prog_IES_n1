package prficheros;

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

public class XML_escribirAFichero {

    public static void main(String[] args) throws TransformerException, ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DOMImplementation implementation = builder.getDOMImplementation();

        Document documento = implementation.createDocument(null, "concesionario", null);
        documento.setXmlVersion("1.0");

        Element coches = documento.createElement("coches");
        Element coche1 = documento.createElement("coche");

        Element matricula = documento.createElement("matricula");
        Text textMatricula = documento.createTextNode("1234ABC");
        matricula.appendChild(textMatricula);
        coche1.appendChild(matricula);

        Element marca = documento.createElement("marca");
        Text textMarca = documento.createTextNode("Opel");
        marca.appendChild(textMarca);
        coche1.appendChild(marca);

        Element fecha = documento.createElement("fecha");
        fecha.setAttribute("anio", "1970");
        coche1.appendChild(fecha);

        Element precio = documento.createElement("precio");
        Text textPrecio = documento.createTextNode("25000");
        precio.appendChild(textPrecio);
        coche1.appendChild(precio);

        coches.appendChild(coche1);

        documento.getDocumentElement().appendChild(coches);

        //TRANSFORMAR ÁRBOL DOM EN ARCHIVO XML
        //1º Especificamos la fuente de árbol DOM pasandole nuestro "documento"
        DOMSource source = new DOMSource(documento);

        //2º Creamos un transfomador de árboles DOM a documentos XML
        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");

        //3º Creamos el StreamResult, que permitirá volcar el documento XML transformado
        //al archivo de destino.
        StreamResult result = new StreamResult(new File("concesionario.xml"));

        //4º Realizamos la transformación indicando fuente y destino        
        t.transform(source, result);

    }

}
