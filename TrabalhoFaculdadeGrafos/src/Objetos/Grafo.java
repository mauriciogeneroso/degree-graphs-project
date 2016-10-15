package Objetos;

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
 * @Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 */
public class Grafo {

    // Matrizes
    private Matriz matrizAdj;
    private Matriz matrizInc;

    // Listas
    private Lista[] listaAdj;
    private Lista[] listaInc;

    // Nós e arestas
    private String[] nos;
    private String[] arestas;

    public Grafo() {
        matrizAdj = new MatrizAdj();
        matrizInc = new MatrizInc();

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

    public Lista[] getListaAdj() {
        return listaAdj;
    }

    public Lista[] getListaInc() {
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

    public int quantidadeNos() {
        return nos.length;
    }

    public boolean noIsEmpty() {
        return nos == null;
    }

    public int quantidadeArestas() {
        return arestas.length;
    }
    
    public void iniciarMatriz(Matriz mt, int qntLinhas, int qntColunas){
        mt.iniciarMatriz(qntLinhas, qntColunas);
    }
    
    public void destruirGrafo(){
        nos = null;
        arestas = null;
        matrizAdj = null;
        matrizInc = null;
    }
    
    public void alterarMatrizGrafoNaoDirecionado(Matriz mt, int noInicial, int noFinal, int aresta){
        if (mt instanceof MatrizAdj){
            ((MatrizAdj) mt).alterarMatrizGrafoNaoDirecionado(noInicial, noFinal);
        } else if (mt instanceof MatrizInc){
            ((MatrizInc) mt).alterarMatrizGrafoNaoDirecionado(noInicial, noFinal, aresta);
        }
    }
    
    public void alterarMatrizGrafoDirecionado(Matriz mt, int noInicial, int noFinal, int aresta){
        if (mt instanceof MatrizAdj){
            ((MatrizAdj) mt).alterarMatrizGrafoDirecionado(noInicial, noFinal);
        } else if (mt instanceof MatrizInc){
            ((MatrizInc) mt).alterarMatrizGrafoDirecionado(noInicial, noFinal, aresta);
        }
    }
    
}