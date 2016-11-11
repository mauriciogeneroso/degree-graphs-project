package Util;

import Objetos.Grafo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class TesteXML {

    public static void testarVisualizar(Grafo grafo) {
//        XStream xstream = new XStream(new DomDriver());
//        String xml = xstream.toXML(grafo);
//        System.out.println(xml);

        Element graphml = new Element("graphml");
        Document myDocument = new Document(graphml);
        
        Element graph = new Element("graph");
        graph.setAttribute("edgedefault", "undirected");
        
        Element teste = new Element("teste");
        graph.addContent(teste);
        graphml.addContent(graph);
        
        XMLOutputter xout = new XMLOutputter();
        try {
            xout.output(myDocument, System.out);
        } catch (IOException ex) {
            Logger.getLogger(TesteXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        // Estudar e continuar 
        //http://www.devmedia.com.br/manipulando-arquivos-xml-com-o-jdom-parte-i-escrevendo-arquivos/3330
        //http://www.botecodigital.info/java/lendo-e-escrevendo-xml-em-java-com-jdom/
    }

}
