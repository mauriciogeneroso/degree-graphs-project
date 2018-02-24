package com.graphs.objects.storage;

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
public class AdjacencyMatrix extends Matrix {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     *
     * @param rows - Linhas.
     * @param columns - Colunas.
     */
    public AdjacencyMatrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    /**
     * Altera a Matriz de Adjacência(para Grafo Não Direcionado) de acordo com
     * os nós informados
     *
     * @param startingNode - primeiro nó da adjacência
     * @param finishingNode - segundo nó da adjacência
     */
    public void changeMatrixGraphNotDirected(int startingNode, int finishingNode) {
        if (startingNode == finishingNode) {
            // Se houver laço só irá armazenar uma vez
            matrix[startingNode][finishingNode] += 1;
        } else {
            matrix[startingNode][finishingNode] += 1;
            matrix[finishingNode][startingNode] += 1;
        }
        //System.out.println("Matriz de adjacência: ");
        //this.printMatrix();
    }

}
