package Util;

import Objetos.Grafo;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class TesteXML {

    public static void testarVisualizar(Grafo grafo) {
        XStream xstream = new XStream(new DomDriver());
        String xml = xstream.toXML(grafo);
        System.out.println(xml);

    }

}
