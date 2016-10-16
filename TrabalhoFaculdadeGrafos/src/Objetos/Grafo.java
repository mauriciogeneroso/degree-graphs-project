package Objetos;

import Objetos.Armazenamento.ListaInc;
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
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso - Classe implementada por Maurício
 */
public class Grafo {

    // Matrizes
    private Matriz matrizAdj;
    private Matriz matrizInc;

    // Listas
    //private ListaInc[] listaAdj;
    private ListaInc[] listaInc;

    // Nós e arestas
    private String[] nos;
    private String[] arestas;

    public Grafo() {
        matrizAdj = new MatrizAdj();
        matrizInc = new MatrizInc();

        //listaAdj = null;
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

//    public ListaInc[] getListaAdj() {
//        return listaAdj;
//    }
    
    public ListaInc[] getListaInc() {
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
    
    public String getNoPosicao(int posicao){
        return nos[posicao];
    }
    
    public String getArestaPosicao(int posicao){
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
        mt.iniciarMatriz(qntLinhas, qntColunas);
    }

    public void iniciarListas() {
        //listaAdj = new ListaAdj[this.quantidadeNos()];
        
        listaInc = new ListaInc[quantidadeNos()];
        for (int i = 0; i < quantidadeNos(); i++) {
            listaInc[i] = new ListaInc(nos[i]);
        }
    }

    public void destruirGrafo() {
        nos = null;
        arestas = null;
        matrizAdj = null;
        matrizInc = null;
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
    
    private void imprimirListaInc(){
        // Este método iŕá chamar o toString() da classe "Lista" para cada posição do array(listaInc[i]).
        // O toString() da classe Lista irá imprimir cada elemento presente em tal posição do vetor, ou seja, a outra lista(chamando o toString de cada elemento);
        System.out.println("Lista de Incidência: ");
        for (int i = 0; i < quantidadeNos(); i++){
            System.out.println(nos[i] + " -> " + listaInc[i]);
        }
    }
    
    private int posicaoLista(String no){
        for (int i = 0; i < quantidadeNos(); i++){
            if (nos[i].equals(no)){
                return i;
            }
        }
        System.out.println("OCORREU UM ERRO");
        return -1;
    }
    
    public void alterarListaGrafoNaoDirecionado(String noInicial, String noFinal, String aresta) {
        //adj
        
        listaInc[posicaoLista(noInicial)].adiciona(noFinal, aresta);
        listaInc[posicaoLista(noFinal)].adiciona(noInicial, aresta);
        imprimirListaInc();
    }
    
    public void alterarListaGrafoDirecionado(String noInicial, String noFinal, String aresta) {
        //adj
        
        listaInc[posicaoLista(noInicial)].adiciona(noFinal, aresta);
        imprimirListaInc();
    }
}

