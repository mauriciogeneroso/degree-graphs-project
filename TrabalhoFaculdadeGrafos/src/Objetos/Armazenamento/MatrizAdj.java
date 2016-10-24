package Objetos.Armazenamento;

/**
 * Classe que representa e herda de "Matriz"; É implementado nesta subclasse
 * como é alterado os dados de um grafo em Matriz de Adjacência.
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
public class MatrizAdj extends Matriz implements java.io.Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * Altera a Matriz de Adjacência(para Grafo Não Direcionado) de acordo com
     * os nós informados
     *
     * @param noInicial - primeiro nó da adjacência
     * @param noFinal - segundo nó da adjacência
     */
    public void alterarMatrizGrafoNaoDirecionado(int noInicial, int noFinal) {
        if (noInicial == noFinal) {
            // Se houver laço só irá armazenar uma vez
            matriz[noInicial][noFinal] += 1;
        } else {
            matriz[noInicial][noFinal] += 1;
            matriz[noFinal][noInicial] += 1;
        }
        System.out.println("Matriz de adjacência - Grafo não direcionado: ");
        this.imprimirMatriz();
    }

}
