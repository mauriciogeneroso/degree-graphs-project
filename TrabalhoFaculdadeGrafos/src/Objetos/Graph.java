package Objetos;

import Objetos.Armazenamento.AdjacencyElement;
import Objetos.Armazenamento.IncidencyElement;
import Objetos.Armazenamento.IncidenceMatrix;
import Objetos.Armazenamento.AdjacencyMatrix;
import Objetos.Armazenamento.Matrix;
import java.util.LinkedList;

/**
 * Classe para armazenar a Matriz e lista de Adjacência e Incidência. O
 * armazenamento direcionado ou não direcionado é feito de acordo com a opção
 * que o usuário seleciona na criação do grafo. Se selecionar direcionado a
 * matriz será criada com caracteristicas de direcionada, e assim por diante
 * para todos os demais casos.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 15/10/2016
 * @version 1.7
 */
public class Graph implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    // Matrizes
    private Matrix AdjMatrix;
    private Matrix IncMatrix;

    // Listas
    private LinkedList<AdjacencyElement>[] listAdj;
    private LinkedList<IncidencyElement>[] listInc;

    // Nós e arestas
    private String[] nodes;
    private String[] edges;

    /**
     * Construtor.
     */
    public Graph() {
        AdjMatrix = null;
        IncMatrix = null;

        listAdj = null;
        listInc = null;

        nodes = null;
        edges = null;
    }

    /**
     * Retorna mariz de adjacencia.
     *
     * @return Matriz de adjacencia
     */
    public Matrix getAdjMatrix() {
        return AdjMatrix;
    }

    /**
     * Retorna mariz de incidência.
     *
     * @return Matriz de incidência
     */
    public Matrix getIncMatrix() {
        return IncMatrix;
    }

    /**
     * Lista de adjacencia.
     *
     * @return Lista de elementos da lista de adjacencia
     */
    public LinkedList<AdjacencyElement>[] getListAdj() {
        return listAdj;
    }

    /**
     * Lista de incidência.
     *
     * @return Lista de elementos da lista de incidência
     */
    public LinkedList<IncidencyElement>[] getListInc() {
        return listInc;
    }

    /**
     * Retorna Nós.
     *
     * @return String[] de nós
     */
    public String[] getNodes() {
        return nodes;
    }

    /**
     * Atribui Nós.
     *
     * @param nodes String[] - Array de strings para setar nós
     */
    public void setNodes(String[] nodes) {
        this.nodes = nodes;
    }

    /**
     * Retorna arestas.
     *
     * @return String[] de arestas
     */
    public String[] getEdges() {
        return edges;
    }

    /**
     * Atrubui arestas.
     *
     * @param edges String[] - Array de strings para setar arestas
     */
    public void setEdges(String[] edges) {
        this.edges = edges;
    }

    /**
     * Retorna nó da posição.
     *
     * @param position int - Posição do nó solicitado
     * @return String - Nome do nó na posição
     */
    public String getPositionNode(int position) {
        return nodes[position];
    }

    /**
     * Retorna aresta da posição.
     *
     * @param position int - Posição da aresta solicitado
     * @return String - Nome da aresta na posição
     */
    public String getPositionEdge(int position) {
        return edges[position];
    }

    /**
     * Retorna a quantidade de nós.
     *
     * @return int - Quantidade de nó
     */
    public int countNode() {
        return nodes.length;
    }

    /**
     * Nó é vazio.
     *
     * @return boolean - Verdadeiro se estiver vazio, caso contrário falso
     */
    public boolean noIsEmpty() {
        return nodes == null;
    }

    /**
     * Retorna a quantidade de arestas.
     *
     * @return int - Quantidade de arestas
     */
    public int countEdge() {
        return edges.length;
    }

    /**
     * Inicia a matriz.
     *
     * @param mt Matriz - A matriz que será iniciada
     * @param amountRows int - Quantidade de linhas
     * @param amountColumns int - Quantidade de colunas
     */
    public void startMatrix(Matrix mt, int amountRows, int amountColumns) {
        if (mt instanceof AdjacencyMatrix) {
            mt = new AdjacencyMatrix();
            mt.startMatrix(amountRows, amountColumns);
            AdjMatrix = mt;
        } else if (mt instanceof IncidenceMatrix) {
            mt = new IncidenceMatrix();
            mt.startMatrix(amountRows, amountColumns);
            IncMatrix = mt;
        }
    }

    /**
     * Inicia as listas.
     */
    public void startLists() {
        listAdj = new LinkedList[countNode()];
        for (int i = 0; i < countNode(); i++) {
            listAdj[i] = new LinkedList<>();
        }

        listInc = new LinkedList[countNode()];
        for (int i = 0; i < countNode(); i++) {
            listInc[i] = new LinkedList<>();
        }
    }

    /**
     * Destroi o grafo.
     */
    public void destroyGraph() {
        nodes = null;
        edges = null;
        AdjMatrix = null;
        IncMatrix = null;
        listAdj = null;
        listInc = null;
    }

    /**
     * Altera a matriz do grafo não direcionado.
     *
     * @param mt Matriz - Matriz a ser alterada
     * @param startingNode int - Nó inicial
     * @param finishingNode int - Nó final
     * @param edge int - Aresta
     */
    public void alterMatrix(Matrix mt, int startingNode, int finishingNode, int edge) {
        if (mt instanceof AdjacencyMatrix) {
            ((AdjacencyMatrix) mt).alterarMatrizGrafoNaoDirecionado(startingNode, finishingNode);
        } else if (mt instanceof IncidenceMatrix) {
            ((IncidenceMatrix) mt).alterarMatrizGrafoNaoDirecionado(startingNode, finishingNode, edge);
        }
    }

    /**
     * Imprimi a lista Este método iŕá chamar o toString() da classe "Lista"
     * para cada posição do array(listaInc[i]). O toString() da classe Lista irá
     * imprimir cada elemento presente em tal posição do vetor, ou seja, a outra
     * lista(chamando o toString de cada elemento);
     *
     * @param lt Lista - Lista a ser impressa
     */
    public void printList(LinkedList[] lt) {
        for (int i = 0; i < countNode(); i++) {
            System.out.println(nodes[i] + " -> " + lt[i]);
        }
    }

    /**
     * Captura posição de um nó em uma lista
     *
     * @param node String - nó a ser pesquisado
     * @return posição do nó solicitado
     */
    private int positionList(String node) {
        for (int i = 0; i < countNode(); i++) {
            if (nodes[i].equals(node)) {
                return i;
            }
        }
        System.out.println("OCORREU UM ERRO");
        return -1;
    }

    /**
     * Altera a lista do grafo não direcionado.
     *
     * @param startingNode int - Nó inicial
     * @param finishingNode int - Nó final
     * @param edge int - Aresta
     */
    public void alterList(String startingNode, String finishingNode, String edge) {
        if (startingNode.equals(finishingNode)) {
            listAdj[positionList(startingNode)].add(new AdjacencyElement(finishingNode));

            listInc[positionList(startingNode)].add(new IncidencyElement(finishingNode, edge)); //uni os dois para não ter 2 ifs com mesmo resultado, desnecessário
        } else {
            listAdj[positionList(startingNode)].add(new AdjacencyElement(finishingNode));
            listAdj[positionList(finishingNode)].add(new AdjacencyElement(startingNode));

            listInc[positionList(startingNode)].add(new IncidencyElement(finishingNode, edge));
            listInc[positionList(finishingNode)].add(new IncidencyElement(startingNode, edge));
        }
        System.out.println("Lista de Adjacência não direcionada: ");
        printList(listAdj);

        System.out.println("Lista de Incidência não direcionada: ");
        printList(listInc);
    }

}
