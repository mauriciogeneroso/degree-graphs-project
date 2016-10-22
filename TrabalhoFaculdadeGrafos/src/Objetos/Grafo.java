package Objetos;

import Objetos.Armazenamento.ElementoAdj;
import Objetos.Armazenamento.ElementoInc;
import Objetos.Armazenamento.Lista;
import Objetos.Armazenamento.MatrizInc;
import Objetos.Armazenamento.MatrizAdj;
import Objetos.Armazenamento.Matriz;
import java.io.Serializable;

/**
 * Classe para armazenar a Matriz e lista de Adjacência e Incidência. O
 * armazenamento direcionado ou não direcionado é feito de acordo com a opção
 * que o usuário seleciona na criação do grafo. Se selecionar direcionado a
 * matriz será criada com caracteristicas de direcionada, e assim por diante
 * para todos os demais casos.
 *
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso - Classe implementada por Maurício
 */
public class Grafo implements Serializable {

    // Matrizes
    private Matriz matrizAdj;
    private Matriz matrizInc;

    // Listas
    private Lista<ElementoAdj>[] listaAdj;
    private Lista<ElementoInc>[] listaInc;

    // Nós e arestas
    private String[] nos;
    private String[] arestas;

    public Grafo() {
        matrizAdj = null;
        matrizInc = null;

        listaAdj = null;
        listaInc = null;

        nos = null;
        arestas = null;
    }

    public Matriz getMatrizAdj() {
        return matrizAdj;
    }

    public Matriz getMatrizInc() {
        return matrizInc;
    }

    public Lista<ElementoAdj>[] getListaAdj() {
        return listaAdj;
    }

    public Lista<ElementoInc>[] getListaInc() {
        return listaInc;
    }

    public String[] getNos() {
        return nos;
    }

    public void setNos(String[] nos) {
        this.nos = nos;
    }

    public String[] getArestas() {
        return arestas;
    }

    public void setArestas(String[] arestas) {
        this.arestas = arestas;
    }

    public String getNoPosicao(int posicao) {
        return nos[posicao];
    }

    public String getArestaPosicao(int posicao) {
        return arestas[posicao];
    }

    public int quantidadeNos() {
        return nos.length;
    }

    public boolean noIsEmpty() {
        return nos == null;
    }

    public int quantidadeArestas() {
        return arestas.length;
    }

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

    public void destruirGrafo() {
        nos = null;
        arestas = null;
        matrizAdj = null;
        matrizInc = null;
        listaAdj = null;
        listaInc = null;
    }

    public void alterarMatrizGrafoNaoDirecionado(Matriz mt, int noInicial, int noFinal, int aresta) {
        if (mt instanceof MatrizAdj) {
            ((MatrizAdj) mt).alterarMatrizGrafoNaoDirecionado(noInicial, noFinal);
        } else if (mt instanceof MatrizInc) {
            ((MatrizInc) mt).alterarMatrizGrafoNaoDirecionado(noInicial, noFinal, aresta);
        }
    }

    public void alterarMatrizGrafoDirecionado(Matriz mt, int noInicial, int noFinal, int aresta) {
        if (mt instanceof MatrizAdj) {
            ((MatrizAdj) mt).alterarMatrizGrafoDirecionado(noInicial, noFinal);
        } else if (mt instanceof MatrizInc) {
            ((MatrizInc) mt).alterarMatrizGrafoDirecionado(noInicial, noFinal, aresta);
        }
    }

    public void imprimirLista(Lista[] lt) {
        // Este método iŕá chamar o toString() da classe "Lista" para cada posição do array(listaInc[i]).
        // O toString() da classe Lista irá imprimir cada elemento presente em tal posição do vetor, ou seja, a outra lista(chamando o toString de cada elemento);
        for (int i = 0; i < quantidadeNos(); i++) {
            System.out.println(nos[i] + " -> " + lt[i]);
        }
        //System.out.println("\n");
    }

    private int posicaoLista(String no) {
        for (int i = 0; i < quantidadeNos(); i++) {
            if (nos[i].equals(no)) {
                return i;
            }
        }
        System.out.println("OCORREU UM ERRO");
        return -1;
    }

    public void alterarListaGrafoNaoDirecionado(String noInicial, String noFinal, String aresta) {
        if (noInicial == noFinal) {
            listaAdj[posicaoLista(noInicial)].adiciona(new ElementoAdj(noFinal));
        } else {
            listaAdj[posicaoLista(noInicial)].adiciona(new ElementoAdj(noFinal));
            listaAdj[posicaoLista(noFinal)].adiciona(new ElementoAdj(noInicial));
        }
        System.out.println("Lista de Adjacência não direcionada: ");
        imprimirLista(listaAdj);
        // ----------------------------
        if (noInicial == noFinal) {
            listaInc[posicaoLista(noInicial)].adiciona(new ElementoInc(noFinal, aresta));
        } else {
            listaInc[posicaoLista(noInicial)].adiciona(new ElementoInc(noFinal, aresta));
            listaInc[posicaoLista(noFinal)].adiciona(new ElementoInc(noInicial, aresta));
        }
        System.out.println("Lista de Incidência não direcionada: ");
        imprimirLista(listaInc);
    }

    public void alterarListaGrafoDirecionado(String noInicial, String noFinal, String aresta) {
        listaAdj[posicaoLista(noInicial)].adiciona(new ElementoAdj(noFinal));
        System.out.println("Lista de Adjacência direcionada: ");
        imprimirLista(listaAdj);

        // ----------------------------
        listaInc[posicaoLista(noInicial)].adiciona(new ElementoInc(noFinal, aresta));
        System.out.println("Lista de Incidência direcionada: ");
        imprimirLista(listaInc);
    }
}
