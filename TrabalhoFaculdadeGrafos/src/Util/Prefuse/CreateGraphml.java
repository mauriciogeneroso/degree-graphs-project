package Util.Prefuse;

import Objetos.Armazenamento.Matrix;
import Objetos.Armazenamento.AdjacencyMatrix;
import Objetos.Graph;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 * Classe para criar um arquivo XML no modelo graphml, que será lido pela API
 * Prefuse. Site: http://graphml.graphdrawing.org/
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 12/11/2016
 * @version 2.1
 */
public class CreateGraphml {

    private final String[] keyNames = {"name", "idcolor"};
    private final int NAME = 0;
    private final int COLOR = 1;

    public void createXml(Graph grafo) {

        // Cria a tag Pai
        Element graphml = new Element("graphml");
        // Cria um documento
        Document myDocument = new Document(graphml);

        // Adiciona os elementos nas demais tags com os atributos e valores
        Element graph = new Element("graph");
        graph.setAttribute("edgedefault", "undirected");

        /// Chave para identificação das informações do grafo
        Element key[] = new Element[2];
        key[0] = new Element("key");
        key[0].setAttribute("id", keyNames[NAME]);
        key[0].setAttribute("for", "node");
        key[0].setAttribute("attr.name", keyNames[NAME]);
        key[0].setAttribute("attr.type", "string");
        key[1] = new Element("key");
        key[1].setAttribute("id", keyNames[COLOR]);
        key[1].setAttribute("for", "node");
        key[1].setAttribute("attr.name", keyNames[COLOR]);
        key[1].setAttribute("attr.type", "string");

        // Tag para o nó
        Element[] node = new Element[grafo.countNode()];
        // Tag inserida dentro do nó, com os dados
        Element[] data = new Element[grafo.countNode() * 2];
        // Variável para gerar valores aleatórios na tag que conterá o valor da 
        //cor a ser lido pela API prefuse
        Random rand = new Random();

        // Cria os nós e dados de cada nó
        for (int i = 0, j = 0; i < grafo.countNode(); i++, j += 2) {
            node[i] = new Element("node");
            node[i].setAttribute("id", String.valueOf(i + 1));

            data[j] = new Element("data");
            data[j].setAttribute("key", keyNames[NAME]);
            data[j].setText(grafo.getPositionNode(i));
            data[j + 1] = new Element("data");
            data[j + 1].setAttribute("key", keyNames[COLOR]);
            data[j + 1].setText(String.valueOf(rand.nextInt(8)));

            node[i].addContent(data[j]);
            node[i].addContent(data[j + 1]);
        }

        // Cria a tag com as arestas
        Matrix mat = (AdjacencyMatrix) grafo.getAdjMatrix();
        int numEdge = 0;
        Element[] edge = new Element[grafo.countEdge()];

        for (int i = 0; i < mat.getCountRows(); i++) {
            for (int j = i; j < mat.getCountColumns(); j++) {
                if (mat.getMatrix()[i][j] > 0) {
                    int init = 0;
                    while (init < mat.getMatrix()[i][j]) {
                        edge[numEdge] = new Element("edge");
                        edge[numEdge].setAttribute("source", String.valueOf(i + 1));
                        edge[numEdge].setAttribute("target", String.valueOf(j + 1));
                        numEdge++;
                        init++;
                    }
                }
            }
        }

        graph.addContent(key[0]);
        graph.addContent(key[1]);

        for (Element n : node) {
            graph.addContent(n);
        }
        for (Element e : edge) {
            graph.addContent(e);
        }
        graphml.addContent(graph);
        XMLOutputter xout = new XMLOutputter();

        try {
            xout.output(myDocument, System.out);
            FileWriter xml = new FileWriter(new File("graphML.xml"));
            xout.output(myDocument, xml);
        } catch (IOException ex) {
            Logger.getLogger(CreateGraphml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
