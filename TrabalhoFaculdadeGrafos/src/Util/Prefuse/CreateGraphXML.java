package Util.Prefuse;

import Objetos.Grafo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class CreateGraphXML {

    public static void testarVisualizar(Grafo grafo) {

        Element graphml = new Element("graphml");
        Document myDocument = new Document(graphml);

        Element graph = new Element("graph");
        graph.setAttribute("edgedefault", "undirected");
        
        Element key = new Element("key");
        key.setAttribute("id", "name");
        key.setAttribute("for", "node");
        key.setAttribute("attr.name", "name");
        key.setAttribute("attr.type", "string");
        
        Element node = new Element("node");
        node.setAttribute("id", "1");
        Element node2 = new Element("node");
        node2.setAttribute("id", "2");
        
        Element data = new Element("data");
        data.setAttribute("key", "name");
        data.setText("no1");
        
        Element data2 = new Element("data");
        data2.setAttribute("key", "name");
        data2.setText("no2");
        
        Element edge = new Element("edge");
        edge.setAttribute("source", "1");
        edge.setAttribute("target", "2");
        
        node.addContent(data);
        node2.addContent(data2);
        graph.addContent(key);
        graph.addContent(node);
        graph.addContent(node2);
        graph.addContent(edge);
        graphml.addContent(graph);
        XMLOutputter xout = new XMLOutputter();
        
        try {
            xout.output(myDocument, System.out);
        } catch (IOException ex) {
            Logger.getLogger(CreateGraphXML.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileWriter xml = new FileWriter(new File("graphXML.xml"));
            xout.output(myDocument, xml);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Estudar e continuar 
        //http://www.devmedia.com.br/manipulando-arquivos-xml-com-o-jdom-parte-i-escrevendo-arquivos/3330
        //http://www.botecodigital.info/java/lendo-e-escrevendo-xml-em-java-com-jdom/
    }

}
