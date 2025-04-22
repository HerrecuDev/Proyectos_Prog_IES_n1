package prficheros;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author migue
 */
public class XML_leerDeFichero {
 public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.parse(new File("concesionario.xml"));

            // Comenzar recorrido desde el elemento raíz
            Element raiz = documento.getDocumentElement();
            recorrerNodos(raiz, 0);
            
        } catch (Exception ex) {
            System.out.println("Error al procesar el archivo XML: " + ex.getMessage());
        }
    }

    public static void recorrerNodos(Node nodo, int nivel) {
        
        // Verificar si el nodo es un elemento (etiqueta)
        if (nodo.getNodeType() == Node.ELEMENT_NODE) {
            Element elemento = (Element) nodo;
            String etiqueta = elemento.getTagName();

            
            // Imprimir etiqueta de apertura con atributos
            System.out.print(getIndentation(nivel) + "<" + etiqueta);
            if (elemento.hasAttributes()) {
                NamedNodeMap atributos = elemento.getAttributes();
                for (int j = 0; j < atributos.getLength(); j++) {
                    Node atributo = atributos.item(j);
                    System.out.print(" " + atributo.getNodeName() + "=\"" + atributo.getNodeValue() + "\"");
                }
            }

            // Verificar si el elemento tiene hijos
            NodeList hijos = nodo.getChildNodes();
            if (hijos.getLength() > 0) {
                // Si tiene hijos, imprimir etiqueta de cierre de apertura
                System.out.println(">");

                // Recorrer recursivamente los hijos
                for (int i = 0; i < hijos.getLength(); i++) {
                    recorrerNodos(hijos.item(i), nivel + 1);
                }

                // Imprimir etiqueta de cierre
                System.out.println(getIndentation(nivel) + "</" + etiqueta + ">");
            } else {
                // Si no tiene hijos, imprimir etiqueta de cierre vacía
                System.out.println("/>");
            }
        } else if (nodo.getNodeType() == Node.TEXT_NODE) {
            // Imprimir texto del nodo
            String texto = nodo.getNodeValue().trim();
            if (!texto.isEmpty()) {
                System.out.println(getIndentation(nivel) + texto);
            }
        }
    }

    public static String getIndentation(int nivel) {
        StringBuilder indentacion = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            indentacion.append("\t");
        }
        return indentacion.toString();
    }
}