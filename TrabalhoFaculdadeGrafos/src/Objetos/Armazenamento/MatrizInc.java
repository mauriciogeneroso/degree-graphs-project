package Objetos.Armazenamento;

/**
 * Classe que representa e herda de "Matriz"; É implementado nesta subclasse
 * como é alterado os dados de um grafo em Matriz de Incidência.
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
public class MatrizInc extends Matriz implements java.io.Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * Altera a Matriz de Incidência (para Grafo Não Direcionado) de acordo com
     * os nós informados
     *
     * @param noInicial - primeiro nó da adjacência
     * @param noFinal - segundo nó da adjacência
     * @param aresta - Aresta que está ligando os dois nós
     */
    public void alterarMatrizGrafoNaoDirecionado(int noInicial, int noFinal, int aresta) {
        if (noInicial == noFinal) {
            // Se houver laço só irá armazenar uma vez
            matriz[noInicial][aresta] += 1;
        } else {
            matriz[noInicial][aresta] += 1;
            matriz[noFinal][aresta] += 1;
        }
        System.out.println("Matriz de Incidência - Grafo não direcionada: ");
        this.imprimirMatriz();
    }

}
