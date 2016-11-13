package CaracteristicasGrafo;

import Objetos.Armazenamento.Matrix;
import Objetos.Armazenamento.AdjacencyMatrix;
import Objetos.Graph;

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
public class IdentificationGraph {

    private static final long serialVersionUID = 1L;
    private static final Util.Log log = new Util.Log();

    /**
     * Verifica se um grafo é simples.
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo simples, caso contrário,
     * falso.
     */
    public boolean VerifGrafoSimples(Graph grafo) {
        Matrix mt = grafo.getAdjMatrix();
        for (int i = 0; i < mt.getCountRows(); i++) {
            for (int j = 0; j < mt.getCountColumns(); j++) {
                if (mt.getMatrix()[i][j] > 1) {
                    // Existe aresta paralela, não é simples
                    log.put("Identificacao", "VerifGrafoSimples", 0, "Existe aresta paralela, não é simples] ::[FALSE");
                    return false;
                }
                if (i == j && mt.getMatrix()[i][j] > 0) {
                    // Existe laço, não é simples
                    log.put("Identificacao", "VerifGrafoSimples", 1, "Existe laço, não é simples] :: [FALSE");
                    return false;
                }
            }
        }
        log.put("Identificacao", "VerifGrafoSimples", 2, "É um grafo simples] :: [TRUE");
        return true;
    }

    /**
     * Verifica se um grafo é completo.
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo completo, caso contrário,
     * falso.
     */
    public boolean VerifGrafoCompleto(Graph grafo) {
        Matrix mt = grafo.getAdjMatrix();
        for (int i = 0; i < mt.getCountRows(); i++) {
            for (int j = 0; j < mt.getCountColumns(); j++) {
                if (i != j && mt.getMatrix()[i][j] != 1) {
                    // Existe algum nó que não é ligado ou que possui aresta paralela
                    log.put("Identificacao", "VerifGrafoCompleto", 0, "Existe algum nó que não é ligado ou que possui aresta paralela] :: [FALSE");
                    return false;
                }
                if (i == j && mt.getMatrix()[i][j] > 0) {
                    // Existe um laço no próprio nó
                    log.put("Identificacao", "VerifGrafoCompleto", 1, "Existe um laço no próprio nó] :: [FALSE");
                    return false;
                }
            }
        }
        log.put("Identificacao", "VerifGrafoCompleto", 2, "É um grafo completo] :: [TRUE");
        return true;
    }

    /**
     * Verifica se um grafo é conexo.
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo conexo, caso contrário,
     * falso.
     */
    public boolean VerifGrafoConexo(Graph grafo) {
        // Fazer a validação e retornar false se não for conexo
        int v = 0; //Verifica
        int it = 1;
        float ar = 0;
        Matrix mt = grafo.getAdjMatrix();

        mt.printMatrix();

        for (int i = 0; i < mt.getCountRows(); i++) {
            for (int j = 0; j < mt.getCountColumns(); j++) {
                if (i != j && mt.getMatrix()[i][j] != 0) {
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
        System.out.println("" + v + "");
       if(v==0){
        for (int i = 0; i < mt.getCountRows(); i++) {
            for (int j = 0; j < mt.getCountColumns(); j++) {
                if (i != j && mt.getMatrix()[i][j] > 0) {
                    ar++;
                }
            }
        }
        ar = ar / 2;
        if (ar >= grafo.countNode()-1) {
            v = 0;
        }
        else {
            v = 1;
        }
        System.out.println("" + v + "");
       }
       
        if (v == 0) {
            int n = 0;
            int cont = 1;
            int nos = grafo.countNode();

            int vetor[] = new int[grafo.countNode()];

            for (int a = 0; a < grafo.countNode(); a++) {
                vetor[a] = -1;
            }

            int vetorsomado = 0;
            vetor[vetorsomado] = 0;
            System.out.println("" + vetor[vetorsomado] + "alow");
            vetorsomado++;

            for (int i = 0; i < mt.getCountRows(); i++) {
                cont = 1;
                for (int j = 0; j < mt.getCountColumns(); j++) {
                    if (j != i && mt.getMatrix()[i][j] > 0) {
                        cont = 1;
                        for (int f = 0; f < grafo.countNode(); f++) {

                            if (vetor[f] == j && cont == 1) {
                                cont = 20;
                            }

                        }
                        for (int f = 0; f < grafo.countNode(); f++) {
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
            for (int f = 0; f < grafo.countNode(); f++) {
                if (vetor[f] != -1) {
                    som++;
                }
            }
            /*Verifica o numero de valores no Vetor*/
            if (som == grafo.countNode()) {
                log.put("Identificacao", "VerifGrafoConexo", 0, "É um grafo conexo] :: [TRUE");
                return true;
            }
        }
        log.put("Identificacao", "VerifGrafoConexo", 1, "Não é conexo] :: [FALSE");
        return false;
    }

    /**
     * Verifica se um grafo é planar.
     *
     * @param grafo Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo planar, caso contrário,
     * falso.
     */
    public boolean VerifGrafoPlanar(Graph grafo) {
        boolean result = false;
        
        int v = 0;
        Matrix mt = grafo.getAdjMatrix();
        int proxlin = 0;
        int menorCiclo = 0;
        int idx = 0;
        int c = 0;
        int c2 = 0;
        int counter1 = 0;
        int counter2 = 0;
        
        int arestas = grafo.countEdge();
        int nos = grafo.countNode();
        int isolados=0;
        int ver=0;
        /*Está Função Serve para Contar se Existem nós isolados*/
        for (int i = 0; i < mt.getCountRows(); i++) {
            for (int j = 0; j < mt.getCountColumns(); j++) {
                if (i != j && mt.getMatrix()[i][j] != 0) {
                    ver = 0;
                    break;
                } else {
                    ver = 1;
                 }

            }
            if (ver == 1) {
                isolados++;
            }
        }
        System.out.println(""+ isolados + "");
        nos = nos - isolados;
        
        if(nos<=2){ //Esta Função Serve para ver se existem 2 nós ou menos.
            menorCiclo = -1;
            v=1;
        }
      /*Função que Verifica se Existe Laço em um grafo*/
        if (v == 0) {
            for (int linha = 0; linha < mt.getCountRows(); linha++) {
                for (int coluna1 = 0; coluna1 < mt.getCountColumns(); coluna1++) {
                    if (mt.getMatrix()[linha][coluna1] == 1) {
                        proxlin = coluna1;
                        idx = coluna1 -= 1;
                        menorCiclo++;
                        while (proxlin < mt.getCountRows()) {
                            for (int coluna2 = 0; coluna2 < mt.getCountColumns(); coluna2++) {
                                if (coluna1 != coluna2 && proxlin != coluna2 && mt.getMatrix()[proxlin][coluna2] == 1) {
                                    menorCiclo++;
                                    c2 = coluna2;
                                    if (menorCiclo == grafo.countNode() && coluna2 == idx) {
                                        break;
                                    }
                                    proxlin = c2;
                                    coluna1 = c2 - 1;
                                    break;
                                } else {
                                    counter2 += mt.getMatrix()[proxlin][coluna2];
                                    if (counter2 == 0
                                            && coluna2 == grafo.countNode() - 1) {
                                        v = 1;
                                        break;
                                    }
                                }
                            }
                            if (menorCiclo == grafo.countNode() && c2 == idx) {
                                break;
                            }
                            if (counter2 == 0 && c2 == grafo.countNode() - 1) {
                                break;
                            }
                        }
                    }
                    if (menorCiclo == grafo.countNode() && c2 == idx) {
                        break;
                    }
                    if (counter2 == 0 && c2 == grafo.countNode() - 1) {
                        break;
                    }
                }
                if (menorCiclo == grafo.countNode() && c2 == idx) {
                    break;
                }

                if (counter2 == 0 && c2 == grafo.countNode() - 1) {
                    break;
                }
            }
        }
        System.out.println("" + menorCiclo + "");
        
        /*Logo Abaixo estão as Formulas*/
        if(menorCiclo==-1){
            v=0;
        }
        if(menorCiclo>=0 && menorCiclo <=3){
            int valor; //Valor Para Calcular e Armazenar resposta
            valor = (3*nos) - 6;
            if(arestas<=valor){
                v=0;
            }
            else{
                v=1;
            }
        }
        if(menorCiclo > 3){
            int valor; //Valor Para Calcular e Armazenar resposta
            valor = (2*nos) - 4;
            if(arestas<=valor){
                v=0;
            }
            else{
                v=1;
            }   
        }
        
        if (v == 1) {
            log.put("Identificacao", "VerifGrafoPlanar", 0, "O grafo não é planar] :: [FALSE");
            return false;
        } else {
            log.put("Identificacao", "VerifGrafoPlanar", 1, "O grafo é planar] :: [TRUE");
            return true;
        }
    }
}
