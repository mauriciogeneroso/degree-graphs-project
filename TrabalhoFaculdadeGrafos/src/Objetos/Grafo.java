package Objetos;

import Objetos.Armazenamento.ElementoAdj;
import Objetos.Armazenamento.ElementoInc;
import Objetos.Armazenamento.Lista;
import Objetos.Armazenamento.MatrizInc;
import Objetos.Armazenamento.MatrizAdj;
import Objetos.Armazenamento.Matriz;

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
public class Grafo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    // Matrizes
    private Matriz matrizAdj;
    private Matriz matrizInc;

    // Listas
    private Lista<ElementoAdj>[] listaAdj;
    private Lista<ElementoInc>[] listaInc;

    // Nós e arestas
    private String[] nos;
    private String[] arestas;

    /**
     * Construtor.
     */
    public Grafo() {
        matrizAdj = null;
        matrizInc = null;

        listaAdj = null;
        listaInc = null;

        nos = null;
        arestas = null;
    }

    /**
     * Retorna mariz de adjacencia.
     *
     * @return Matriz de adjacencia
     */
    public Matriz getMatrizAdj() {
        return matrizAdj;
    }

    /**
     * Retorna mariz de incidência.
     *
     * @return Matriz de incidência
     */
    public Matriz getMatrizInc() {
        return matrizInc;
    }

    /**
     * Lista de adjacencia.
     *
     * @return Lista de elementos da lista de adjacencia
     */
    public Lista<ElementoAdj>[] getListaAdj() {
        return listaAdj;
    }

    /**
     * Lista de incidência.
     *
     * @return Lista de elementos da lista de incidência
     */
    public Lista<ElementoInc>[] getListaInc() {
        return listaInc;
    }

    /**
     * Retorna Nós.
     *
     * @return String[] de nós
     */
    public String[] getNos() {
        return nos;
    }

    /**
     * Atribui Nós.
     *
     * @param nos String[] - Array de strings para setar nós
     */
    public void setNos(String[] nos) {
        this.nos = nos;
    }

    /**
     * Retorna arestas.
     *
     * @return String[] de arestas
     */
    public String[] getArestas() {
        return arestas;
    }

    /**
     * Atrubui arestas.
     *
     * @param nos String[] - Array de strings para setar arestas
     */
    public void setArestas(String[] arestas) {
        this.arestas = arestas;
    }

    /**
     * Retorna nó da posição.
     *
     * @param posicao int - Posição do nó solicitado
     * @return String - Nome do nó na posição
     */
    public String getNoPosicao(int posicao) {
        return nos[posicao];
    }

    /**
     * Retorna aresta da posição.
     *
     * @param posicao int - Posição da aresta solicitado
     * @return String - Nome da aresta na posição
     */
    public String getArestaPosicao(int posicao) {
        return arestas[posicao];
    }

    /**
     * Retorna a quantidade de nós.
     *
     * @return int - Quantidade de nó
     */
    public int quantidadeNos() {
        return nos.length;
    }

    /**
     * Nó é vazio.
     *
     * @return boolean - Verdadeiro se estiver vazio, caso contrário falso
     */
    public boolean noIsEmpty() {
        return nos == null;
    }

    /**
     * Retorna a quantidade de arestas.
     *
     * @return int - Quantidade de arestas
     */
    public int quantidadeArestas() {
        return arestas.length;
    }

    /**
     * Inicia a matriz.
     *
     * @param mt Matriz - A matriz que será iniciada
     * @param qntLinhas int - Quantidade de linhas
     * @param qntColunas int - Quantidade de colunas
     */
    public void iniciarMatriz(Matriz mt, int qntLinhas, int qntColunas) {
        if (mt instanceof MatrizAdj) {
            mt = new MatrizAdj();
            mt.iniciarMatriz(qntLinhas, qntColunas);
            matrizAdj = mt;
        } else if (mt instanceof MatrizInc) {
            mt = new MatrizInc();
            mt.iniciarMatriz(qntLinhas, qntColunas);
            matrizInc = mt;
        }
    }

    /**
     * Inicia as listas.
     */
    public void iniciarListas() {
        listaAdj = new Lista[quantidadeNos()];
        for (int i = 0; i < quantidadeNos(); i++) {
            listaAdj[i] = new Lista<>();
        }

        listaInc = new Lista[quantidadeNos()];
        for (int i = 0; i < quantidadeNos(); i++) {
            listaInc[i] = new Lista<>();
        }
    }

    /**
     * Destroi o grafo.
     */
    public void destruirGrafo() {
        nos = null;
        arestas = null;
        matrizAdj = null;
        matrizInc = null;
        listaAdj = null;
        listaInc = null;
    }

    /**
     * Altera a matriz do grafo não direcionado.
     *
     * @param mt Matriz - Matriz a ser alterada
     * @param noInicial int - Nó inicial
     * @param noFinal int - Nó final
     * @param aresta int - Aresta
     */
    public void alterarMatrizGrafoNaoDirecionado(Matriz mt, int noInicial, int noFinal, int aresta) {
        if (mt instanceof MatrizAdj) {
            ((MatrizAdj) mt).alterarMatrizGrafoNaoDirecionado(noInicial, noFinal);
        } else if (mt instanceof MatrizInc) {
            ((MatrizInc) mt).alterarMatrizGrafoNaoDirecionado(noInicial, noFinal, aresta);
        }
    }

    /**
     * Altera a matriz do grafo direcionado.
     *
     * @param mt Matriz - Matriz a ser alterada
     * @param noInicial int - Nó inicial
     * @param noFinal int - Nó final
     * @param aresta int - Aresta
     */
    public void alterarMatrizGrafoDirecionado(Matriz mt, int noInicial, int noFinal, int aresta) {
        if (mt instanceof MatrizAdj) {
            ((MatrizAdj) mt).alterarMatrizGrafoDirecionado(noInicial, noFinal);
        } else if (mt instanceof MatrizInc) {
            ((MatrizInc) mt).alterarMatrizGrafoDirecionado(noInicial, noFinal, aresta);
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
    public void imprimirLista(Lista[] lt) {
        for (int i = 0; i < quantidadeNos(); i++) {
            System.out.println(nos[i] + " -> " + lt[i]);
        }
    }

    /**
     * Captura posição de um nó em uma lista
     *
     * @param no String - nó a ser pesquisado
     * @return posição do nó solicitado
     */
    private int posicaoLista(String no) {
        for (int i = 0; i < quantidadeNos(); i++) {
            if (nos[i].equals(no)) {
                return i;
            }
        }
        System.out.println("OCORREU UM ERRO");
        return -1;
    }

    /**
     * Altera a lista do grafo não direcionado.
     *
     * @param noInicial int - Nó inicial
     * @param noFinal int - Nó final
     * @param aresta int - Aresta
     */

    public void alterarListaGrafoNaoDirecionado(String noInicial, String noFinal, String aresta) {
        if (noInicial.equals(noFinal)) {
            listaAdj[posicaoLista(noInicial)].adiciona(new ElementoAdj(noFinal));

            listaInc[posicaoLista(noInicial)].adiciona(new ElementoInc(noFinal, aresta)); //uni os dois para não ter 2 ifs com mesmo resultado, desnecessário
        } else {
            listaAdj[posicaoLista(noInicial)].adiciona(new ElementoAdj(noFinal));
            listaAdj[posicaoLista(noFinal)].adiciona(new ElementoAdj(noInicial));

            listaInc[posicaoLista(noInicial)].adiciona(new ElementoInc(noFinal, aresta));
            listaInc[posicaoLista(noFinal)].adiciona(new ElementoInc(noInicial, aresta));
        }
        System.out.println("Lista de Adjacência não direcionada: ");
        imprimirLista(listaAdj);

        System.out.println("Lista de Incidência não direcionada: ");
        imprimirLista(listaInc);
    }

    /**
     * Altera a matriz do grafo direcionado.
     *
     *
     * @param noInicial int - Nó inicial
     * @param noFinal int - Nó final
     * @param aresta int - Aresta
     */
    public void alterarListaGrafoDirecionado(String noInicial, String noFinal, String aresta) {
        listaAdj[posicaoLista(noInicial)].adiciona(new ElementoAdj(noFinal));
        System.out.println("Lista de Adjacência direcionada: ");
        imprimirLista(listaAdj);

        listaInc[posicaoLista(noInicial)].adiciona(new ElementoInc(noFinal, aresta));
        System.out.println("Lista de Incidência direcionada: ");
        imprimirLista(listaInc);
    }
}
