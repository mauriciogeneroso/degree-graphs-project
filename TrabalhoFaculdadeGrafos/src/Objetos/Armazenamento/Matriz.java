package Objetos.Armazenamento;

/**
 * Matriz para armazenar os grafos, nesta classe está implementado caracteristicas e métodos comuns das matrizes de Adjacência e Incidência, 
 * porém as alterações das informações são implementadas nas subclasses que herdam de "Matriz", pois cada tipo de armazenamento do Grafo 
 * requer uma forma diferente de estar alterando a Matriz.
 * 
 * Estudantes de Ciência da Computação - 4 fase.
 *  
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso - Classe implementada por Maurício
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
        System.out.println(this); // Iŕa chamar o toString();
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

    @Override
    public String toString() {
        String imprimir = "";
        for (int[] mt : matriz) {
            for (int j = 0; j < mt.length; j++) {
                imprimir += mt[j] + " ";
            }
            imprimir += "\n";
        }
        return imprimir;
    }
    
}