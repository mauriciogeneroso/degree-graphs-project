package Principal;

/**
 *  Classe para armazenar a Matriz e lista de Adjacência e Incidência. O armazenamento direcionado ou não direcionado é feito de acordo
 *  com a opção que o usuário seleciona na criação do grafo. Se selecionar direcionado a matriz será criada com caracteristicas de
 *  direcionada, e assim por diante para todos os demais casos.
 * 
 * 
 * Estudantes de Ciência da Computação - 4 fase.
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 * 
 */
public class Grafo {
    
    // Matrizes
    private int[][] matrizAdj;
    private int[][] matrizInc;
    
    // Listas
    private Lista[] listaAdj;
    private Lista[] listaInc;
    
    // Nós e arestas
    private String[] nos;
    private String[] arestas;
    
    public Grafo(){
        matrizAdj = null;
        matrizInc = null;
    
        listaAdj = null;
        listaInc = null;
    
        nos = null;
        arestas = null;
    }

    public int[][] getMatrizAdj() {
        return matrizAdj;
    }

    public int[][] getMatrizInc() {
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
    
    public void limparMatriz(int[][] matriz){   
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    public void limparLista(Lista[] lista){
        for (int i = 0; i < lista.length; i++){
            lista[i] = null;
        }
    }
    
    public void imprimirMatriz(int[][] matriz){
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println("");
        }
    }
    
    public void imprimirLista(Lista[] lista){
        for (Lista li : lista){
            System.out.println(lista);
        }
    }
    
    public void capturarNos(String entradaNosUsuario, int qntNos){
        String[] nosTemp = new String[qntNos];
        
    }
    
    public int quantidadeNos(){
        return nos.length;
    }
    
    public boolean noIsEmpty(){
        return nos == null;
    }
    
    public int quantidadeArestas(){
        return arestas.length;
    }
    
}
