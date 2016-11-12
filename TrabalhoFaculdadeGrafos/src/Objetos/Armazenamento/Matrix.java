package Objetos.Armazenamento;

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
public abstract class Matrix implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    int[][] matriz;
    int linhas;
    int colunas;

    /**
     * Retorna a matriz
     *
     * @return int[][] - Matriz
     */
    public int[][] getMatriz() {
        return matriz;
    }

    /**
     * Retorna as linhas
     *
     * @return int - Linhas
     */
    public int getLinhas() {
        return linhas;
    }

    /**
     * Atribui Linhas
     *
     * @param linhas int - Valor para linhas
     */
    private void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    /**
     * Retorna as colunas
     *
     * @return int - Colunas
     */
    public int getColunas() {
        return colunas;
    }

    /**
     * Atribui Linhas
     *
     * @param colunas int - Valor para colunas
     */
    private void setColunas(int colunas) {
        this.colunas = colunas;
    }

    /**
     * Limpa a matriz
     */
    public void limparMatriz() {
        for (int[] mt : matriz) {
            for (int j = 0; j < mt.length; j++) {
                mt[j] = 0;
            }
        }
    }

    /**
     * Imprimi a matriz
     */
    public void imprimirMatriz() {
        System.out.print(this); // Iŕa chamar o toString();
    }

    /**
     * Retorna as linhas
     *
     * @param linhas int - Linhas
     * @param colunas int - Colunas
     */
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

    /**
     * Retorna o Objeto em String
     *
     * @return String - Conteúdo do objeto para String
     */
    @Override
    public String toString() {
        String imprimir = "";
        for (int[] mt : matriz) {
            for (int j = 0; j < mt.length; j++) {
                imprimir += mt[j] + "   ";
            }
            imprimir += "\n";
        }
        return imprimir;
    }

}
