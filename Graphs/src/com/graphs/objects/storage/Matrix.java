package com.graphs.objects.storage;

import java.io.Serializable;

/**
 * Matriz para armazenar os grafos, nesta classe está implementado
 * caracteristicas e métodos comuns das matrizes de Adjacência e Incidência,
 * porém as alterações das informações são implementadas nas subclasses que
 * herdam de "Matriz", pois cada tipo de armazenamento do Grafo requer uma forma
 * diferente de estar alterando a Matriz.
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
public abstract class Matrix implements Serializable {

    private static final long serialVersionUID = 1L;

    protected int[][] matrix;

    /**
     * Retorna a matriz
     *
     * @return int[][] - Matriz
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * Retorna as linhas
     *
     * @return int - Linhas
     */
    public int getCountRows() {
        return matrix.length;
    }

    /**
     * Retorna as colunas
     *
     * @return int - Colunas
     */
    public int getCountColumns() {
        return matrix[0].length;
    }

    /**
     * Limpa a matriz
     */
    public void cleanMatriz() {
        for (int[] mt : matrix) {
            for (int j = 0; j < mt.length; j++) {
                mt[j] = 0;
            }
        }
    }

    /**
     * Imprimi a matriz
     */
    public void printMatrix() {
        System.out.print(this); // Iŕa chamar o toString();
    }
    

    /**
     * Retorna o Objeto em String
     *
     * @return String - Conteúdo do objeto para String
     */
    @Override
    public String toString() {
        String imprimir = "";
        for (int[] mt : matrix) {
            for (int j = 0; j < mt.length; j++) {
                imprimir += mt[j] + "   ";
            }
            imprimir += "\n";
        }
        return imprimir;
    }

}
