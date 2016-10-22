package CaracteristicasGrafo;

import Objetos.Armazenamento.Matriz;
import Objetos.Grafo;

/**
 * Essa classe implementa todas as funções de identificações de um grafo.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 19/10/2016
 * @version 1.2
 * @version 1.3
 */
public class Identificacao {

    private static final long serialVersionUID = 1L;

    /**
     * Verifica se um grafo é simples
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo simples, caso contrário,
     * falso.
     */
    public boolean VerifGrafoSimples(Grafo grafo) {
        Matriz mt = grafo.getMatrizAdj();
        for (int i = 0; i < mt.getLinhas(); i++) {
            for (int j = 0; j < mt.getColunas(); j++) {
                if (mt.getMatriz()[i][j] > 1) {
                    // Existe aresta paralela, não é simples
                    return false;
                }
                if (i == j && mt.getMatriz()[i][j] > 0) {
                    // Existe laço, não é simples
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Verifica se um grafo é planar
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo planar, caso contrário,
     * falso.
     */
    public boolean VerifGrafoPlanar(Grafo grafo) {
        // Fazer a validação e retornar false se não for planar
        Matriz mt = grafo.getMatrizAdj();
        int nos = grafo.quantidadeNos();
        int aresta = grafo.quantidadeArestas();
        return true;
    }

    /**
     * Verifica se um grafo é completo
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo completo, caso contrário,
     * falso.
     */
    public boolean VerifGrafoCompleto(Grafo grafo) {
        Matriz mt = grafo.getMatrizAdj();
        for (int i = 0; i < mt.getLinhas(); i++) {
            for (int j = 0; j < mt.getColunas(); j++) {
                if (i != j && mt.getMatriz()[i][j] != 1) {
                    // Existe algum nó que não é ligado ou que possui aresta paralela
                    return false;
                }
                if (i == j && mt.getMatriz()[i][j] > 0) {
                    // Existe um laço no próprio nó
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Verifica se um grafo é conexo
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo conexo, caso contrário,
     * falso.
     */
    public boolean VerifGrafoConexo(Grafo grafo) {
        // Fazer a validação e retornar false se não for conexo
        int v = 0;
        int soma = 0;
        int it = 1;
        Matriz mt = grafo.getMatrizAdj();

        mt.imprimirMatriz();

        for (int i = 0; i < mt.getLinhas(); i++) {
            for (int j = 0; j < mt.getColunas(); j++) {
                if (!(i == j || mt.getMatriz()[i][j] > 0)) {
                    v = 1;
                    break;
                }
            }
        }
        if (v == 0) {
            int n = 0;
            int cont = 1;
            int nos = grafo.quantidadeNos();

            int vetor[] = new int[grafo.quantidadeNos()];
            for (int a = 0; a < grafo.quantidadeNos(); a++) {
                vetor[a] = -1;
            }
            int vetorsomado = 0;
            vetor[vetorsomado] = 0;
            vetorsomado++;
            for (int i = 0; i < mt.getLinhas(); i++) {
                for (int j = 0; j < mt.getColunas(); j++) {

                    if (j != i && mt.getMatriz()[i][j] > 0 && cont == 1) {
                        cont = 20;
                        n = j;
                        System.out.println("" + n + "alow");
                        break;
                    }
                }
            }

            vetor[vetorsomado] = n;
            System.out.println("" + vetor[vetorsomado] + "");

            do {
                vetorsomado++;
                cont = 1;

                for (int i = n; i < mt.getLinhas(); i++) {
                    for (int j = 0; j < mt.getColunas(); j++) {
                        if (i != j && mt.getMatriz()[i][j] > 0) {
                            for (int f = 0; f < grafo.quantidadeNos(); f++) {
                                if (vetor[f] == j && cont == 1) {
                                    cont = 20;
                                }
                            }
                            if (cont == 1) {
                                n = j;

                            }
                        }

                    }

                }
                vetor[vetorsomado] = n;
                it++;

            } while (it <= nos);
        }

        if (v == 1) {
            System.out.println("O Grafo não é Conexo");
        } else {
            System.out.println("O Grafo é Conexo");
        }
        return true;
    }
}