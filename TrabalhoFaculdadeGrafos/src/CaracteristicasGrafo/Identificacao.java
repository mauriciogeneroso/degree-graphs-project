package CaracteristicasGrafo;

import Objetos.Armazenamento.Matriz;
import Objetos.Grafo;
import java.awt.List;

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
     * Verifica se um grafo é simples.
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

    //JAVADOC
    public int profundidade(int matriz[][], int qtdN, int raiz, boolean visitados[][], int caminho) {

        for (int i = 0; i < qtdN; i++) {
            for (int j = 0; j < qtdN; j++) {
                if (matriz[raiz][i] != 0) {
                    if (visitados[i][j] == false) {
                        visitados[i][j] = true;
                        caminho += 1;
                        profundidade(matriz, qtdN, i, visitados, caminho);
                    }
                }
            }

        }
        return caminho;
    }

    /**
     * Verifica se um grafo é planar.
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo planar, caso contrário,
     * falso.
     */
    public boolean VerifGrafoPlanar(Grafo grafo) {
        int qtdN = grafo.quantidadeNos();
        int qtdA = grafo.quantidadeArestas();
        boolean visitados[][] = new boolean[grafo.getMatrizAdj().getLinhas()][grafo.getMatrizAdj().getColunas()];
        for (int i = 0; i < grafo.getMatrizAdj().getLinhas(); i++) {
            for (int j = 0; j < grafo.getMatrizAdj().getColunas(); j++) {
                visitados[i][j] = false;
            }
        }
        //int p[] = new int[qtdN];//peso
        int regioes = 2 - qtdN + qtdA;
        int menorCiclo = 0;
        //fazer dijkstra aqui atualizar valor de menorCiclo para resultado dijkstra djrodrigocamposkstra

        int raiz = 0;
        int caminho = 0;
        int matriz[][] = new int[grafo.getMatrizAdj().getLinhas()][grafo.getMatrizAdj().getColunas()];
        matriz = grafo.getMatrizAdj().getMatriz();
        caminho = profundidade(matriz, qtdN, raiz, visitados, caminho);

        System.err.println("CAMINHO>" + caminho);

        if (menorCiclo <= 3) {
            return qtdA <= ((3 * qtdN) - 6); //returna true se for <= solucao
        } else {
            return qtdA <= ((2 * qtdN) - 4); //returna true se for <= solucao
        }
//        // Fazer a validação e retornar false se não for planar
//        Matriz mt = grafo.getMatrizAdj();
//        int nos = grafo.quantidadeNos();
//        int aresta = grafo.quantidadeArestas();
//        int vetor[] = new int[grafo.quantidadeNos()];
//        int cont =1;
//        int vetorsomado=0;
//        int n=0;
//        int it=0;
//        int soma=0;
//        /* Verifica o Maior Ciclo */
//        do {
//                
//              
//
//                for (int i = n; i < mt.getLinhas();) {
//                    for (int j = 0; j < mt.getColunas(); j++) {
//                        if (i != j && mt.getMatriz()[i][j] > 0) {
//                            for (int f = 0; f < grafo.quantidadeNos(); f++) {
//                                if (vetor[f] == j && cont == 1) {
//                                    cont = 20;
//                                }
//                            }
//                            for (int f = 0; f < grafo.quantidadeNos(); f++){
//                            if(vetor[f] != j && cont!= 1){
//                                soma++;
//                                vetor[vetorsomado] = soma;
//                                }
//                            }
//                            
//                        }
//
//                    }
//
//                }
//                n++;
//                vetorsomado++;
//                soma=0;
//                cont=1;
//
//            } while (it <= nos*nos);
//        
//        
//        
//        return true;
    }

    /**
     * Verifica se um grafo é completo.
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
     * Verifica se um grafo é conexo.
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo conexo, caso contrário,
     * falso.
     */
    public boolean VerifGrafoConexo(Grafo grafo) {
        // Fazer a validação e retornar false se não for conexo
        int v = 0; //Verifica
        int it = 1;
        int ar = 0;
        Matriz mt = grafo.getMatrizAdj();

        mt.imprimirMatriz();

        for (int i = 0; i < mt.getLinhas(); i++) {
            for (int j = 0; j < mt.getColunas(); j++) {
                if (i != j && mt.getMatriz()[i][j] != 0) {
                    v = 0;
                    break;
                } else {
                    v = 1;
                }

            }
            if (v == 1) {
                break;
            }
        }

        for (int i = 0; i < mt.getLinhas(); i++) {
            for (int j = 0; j < mt.getColunas(); j++) {
                if (i != j && mt.getMatriz()[i][j] > 0) {
                    ar++;
                }
            }
        }
        ar = ar / 2;
        if (ar < grafo.quantidadeNos()) {
            v = 1;
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
            System.out.println("" + vetor[vetorsomado] + "alow");
            vetorsomado++;

            for (int i = 0; i < mt.getLinhas(); i++) {
                cont = 1;
                for (int j = 0; j < mt.getColunas(); j++) {
                    if (j != i && mt.getMatriz()[i][j] > 0) {
                        cont = 1;
                        for (int f = 0; f < grafo.quantidadeNos(); f++) {

                            if (vetor[f] == j && cont == 1) {
                                cont = 20;
                            }

                        }
                        for (int f = 0; f < grafo.quantidadeNos(); f++) {
                            if (vetor[f] != j && cont == 1) {
                                vetor[vetorsomado] = j;
                                System.out.println("" + vetor[vetorsomado] + "alowzim");
                                vetorsomado++;
                                break;
                            }
                        }

                    }

                }
            }

            int som = 0;
            for (int f = 0; f < grafo.quantidadeNos(); f++) {
                if (vetor[f] != -1) {
                    som++;
                }
            }
            /*Verifica o numero de valores no Vetor*/
            if (som == grafo.quantidadeNos()) {
                System.out.println("O Grafo é Conexo");
                return true;
            } else {
                System.out.println("O Grafo não é Conexo");
                return false;
            }
        }
        if (v == 1) {
            System.out.println("O Grafo não é Conexo");
            return false;
        }

        return false;
    }
}
