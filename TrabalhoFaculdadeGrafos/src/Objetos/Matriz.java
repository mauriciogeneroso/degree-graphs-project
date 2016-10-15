/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 * Estudantes de Ciência da Computação - 4 fase.
 *  
 * @Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 */
public abstract class Matriz {

    int[][] matriz;
    int linhas;
    int colunas;

    public int[][] getMatriz() {
        return matriz;
    }

    public int getLinhas() {
        return linhas;
    }

    private void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    private void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public void limparMatriz() {
        for (int[] mt : matriz) {
            for (int j = 0; j < mt.length; j++) {
                mt[j] = 0;
            }
        }
    }

    public void imprimirMatriz() {
        for (int[] mt : matriz) {
            for (int j = 0; j < mt.length; j++) {
                System.out.print(mt[j] + " ");
            }
            System.out.println("");
        }
    }

    public void iniciarMatriz(int linhas, int colunas) {
        /// Cuidar, a classe possui dois atributos com o mesmo nome linhas e colunas
        this.setLinhas(linhas);
        this.setColunas(colunas);
        matriz = new int[this.linhas][this.colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                matriz[i][j] = 0;
            }
        }
    }
}