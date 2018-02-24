package com.graphs.objects.storage;

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
public class IncidenceMatrix extends Matrix {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     *
     * @param rows - Linhas.
     * @param columns - Colunas.
     */
    public IncidenceMatrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    
    /**
     * Altera a Matriz de Incidência (para Grafo Não Direcionado) de acordo com
     * os nós informados
     *
     * @param startingNode - primeiro nó da adjacência
     * @param finishingNode - segundo nó da adjacência
     * @param edge - Aresta que está ligando os dois nós
     */
    public void alterarMatrizGrafoNaoDirecionado(int startingNode, int finishingNode, int edge) {
        if (startingNode == finishingNode) {
            // Se houver laço só irá armazenar uma vez
            matrix[startingNode][edge] += 1;
        } else {
            matrix[startingNode][edge] += 1;
            matrix[finishingNode][edge] += 1;
        }
        //System.out.println("Matriz de Incidência: ");
        //this.printMatrix();
    }

}
