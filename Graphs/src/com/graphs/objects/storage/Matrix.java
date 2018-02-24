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

    int[][] matrix;
    int rows;
    int columns;

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
        return rows;
    }

    /**
     * Atribui Linhas
     *
     * @param rows int - Valor para linhas
     */
    private void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * Retorna as colunas
     *
     * @return int - Colunas
     */
    public int getCountColumns() {
        return columns;
    }

    /**
     * Atribui Linhas
     *
     * @param columns int - Valor para colunas
     */
    private void setColumns(int columns) {
        this.columns = columns;
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
     * Retorna as linhas
     *
     * @param rows int - Linhas
     * @param columns int - Colunas
     */
    public void startMatrix(int rows, int columns) {
        /// Cuidar, a classe possui dois atributos com o mesmo nome linhas e colunas
        this.setRows(rows);
        this.setColumns(columns);
        matrix = new int[this.rows][this.columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                matrix[i][j] = 0;
            }
        }
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
