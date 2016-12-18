package CaracteristicasGrafo;

import Objetos.Armazenamento.Matrix;
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
     * @param graph Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo simples, caso contrário,
     * falso.
     */
    public boolean checkSimpleGraph(Graph graph) {
        Matrix mt = graph.getAdjMatrix();
        for (int i = 0; i < mt.getCountRows(); i++) {
            for (int j = 0; j < mt.getCountColumns(); j++) {
                if (mt.getMatrix()[i][j] > 1) {
                    // Existe aresta paralela, não é simples
                    log.put("IdentificationGraph", "checkSimpleGraph", 0, "Existe aresta paralela, não é simples] ::[FALSE");
                    return false;
                }
                if (i == j && mt.getMatrix()[i][j] > 0) {
                    // Existe laço, não é simples
                    log.put("IdentificationGraph", "checkSimpleGraph", 1, "Existe laço, não é simples] :: [FALSE");
                    return false;
                }
            }
        }
        log.put("IdentificationGraph", "checkSimpleGraph", 2, "É um grafo simples] :: [TRUE");
        return true;
    }

    /**
     * Verifica se um grafo é completo.
     *
     * @param graph Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo completo, caso contrário,
     * falso.
     */
    public boolean checkCompleteGraph(Graph graph) {
        Matrix mt = graph.getAdjMatrix();
        for (int i = 0; i < mt.getCountRows(); i++) {
            //j = i para fazer com que verifique somente a metade da matriz, 
            // pois um lado equivale também ao segundo na adjacência e completo
            for (int j = i; j < mt.getCountColumns(); j++) {
                if (i != j && mt.getMatrix()[i][j] != 1) {
                    // Existe algum nó que não é ligado ou que possui aresta paralela
                    log.put("IdentificationGraph", "checkCompleteGraph", 0, "Existe algum nó que não é ligado ou que possui aresta paralela] :: [FALSE");
                    return false;
                }
                if (i == j && mt.getMatrix()[i][j] > 0) {
                    // Existe um laço no próprio nó
                    log.put("IdentificationGraph", "checkCompleteGraph", 1, "Existe um laço no próprio nó] :: [FALSE");
                    return false;
                }
            }
        }
        log.put("IdentificationGraph", "checkCompleteGraph", 2, "É um grafo completo] :: [TRUE");
        return true;
    }

    /**
     * Verifica se um grafo é conexo.
     *
     * @param graph Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo conexo, caso contrário,
     * falso.
     */
    public boolean checkConnectedGraph(Graph graph) {
        int checkConnection = 0; // Checa se é conexo
        int it = 1;
        float ar = 0;
        Matrix mt = graph.getAdjMatrix();
        mt.printMatrix();
        
        // Verifica a existencia de algum nó isolado, pega linha por linha e faz
        // a leitura, se passou por todas as possibilidades de conexão e terminou 
        // com valor 1, existe um nó isolado e já pode parar a verificação, pois 
        // não há um caminho para aquele nó
        for (int i = 0; i < mt.getCountRows(); i++) {
            for (int j = 0; j < mt.getCountColumns(); j++) {
                // alterado o if abaixo pelo motivo de que no grafo conexo é 
                // permitido ter laço, então i == j é válido e também faz parte
                // da comparação
                //if (i != j && mt.getMatrix()[i][j] != 0) {
                if (mt.getMatrix()[i][j] != 0) {
                    // possui conexão e não está isolado, já pode parar aqui
                    checkConnection = 0;
                    break;
                } else {
                    // Não possui conexão, irá verificar se possui a conexão 
                    //com o próximo nó, se finalizar este for interno e terminar
                    // com 1, é porque o nó está isolado e então para-se o for
                    // externo no if logo abaixo, dentro do for externo
                    checkConnection = 1;
                }
            }
            if (checkConnection == 1) {
                break;
            }
        }
        
        //System.out.println("" + checkConnection + "");
        if(checkConnection == 0){
            for (int i = 0; i < mt.getCountRows(); i++) {
                for (int j = 0; j < mt.getCountColumns(); j++) {
                    if (i != j && mt.getMatrix()[i][j] > 0) {
                        ar++;
                    }
                }
            }
            ar = ar / 2;
            if (ar >= graph.countNode()-1) {
                checkConnection = 0;
            }
            else {
                checkConnection = 1;
            }
            //System.out.println("" + checkConnection + "");
        }
       
        if (checkConnection == 0) {
            int n = 0;
            int cont = 1;
            int nos = graph.countNode();

            int vetor[] = new int[graph.countNode()];

            for (int a = 0; a < graph.countNode(); a++) {
                vetor[a] = -1;
            }

            int vetorsomado = 0;
            vetor[vetorsomado] = 0;
            //System.out.println("" + vetor[vetorsomado] + "alow");
            vetorsomado++;

            for (int i = 0; i < mt.getCountRows(); i++) {
                cont = 1;
                for (int j = 0; j < mt.getCountColumns(); j++) {
                    if (j != i && mt.getMatrix()[i][j] > 0) {
                        cont = 1;
                        for (int f = 0; f < graph.countNode(); f++) {

                            if (vetor[f] == j && cont == 1) {
                                cont = 20;
                            }

                        }
                        for (int f = 0; f < graph.countNode(); f++) {
                            if (vetor[f] != j && cont == 1) {
                                vetor[vetorsomado] = j;
                                //System.out.println("" + vetor[vetorsomado] + "alowzim");
                                vetorsomado++;
                                break;
                            }
                        }
                    }
                }
            }

            int som = 0;
            for (int f = 0; f < graph.countNode(); f++) {
                if (vetor[f] != -1) {
                    som++;
                }
            }
            /*Verifica o numero de valores no Vetor*/
            if (som == graph.countNode()) {
                log.put("IdentificationGraph", "checkConnectedGraph", 0, "É um grafo conexo] :: [TRUE");
                return true;
            }
        }
        log.put("IdentificationGraph", "checkConnectedGraph", 1, "Não é conexo] :: [FALSE");
        return false;
    }

    /**
     * Verifica se um grafo é planar.
     *
     * @param graph Grafo - Entrada de um Grafo
     * @return boolean - Verdadiro caso seja um grafo planar, caso contrário,
     * falso.
     */
    public boolean checkPlanarGraph(Graph graph) {
        boolean result = false;
        
        int v = 0;
        Matrix mt = graph.getAdjMatrix();
        int proxlin = 0;
        int menorCiclo = 0;
        int idx = 0;
        int c = 0;
        int c2 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int bug=0;
        
        int arestas = graph.countEdge();
        int nos = graph.countNode();
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
        //System.out.println(""+ isolados + "");
        nos = nos - isolados;
        
        if(nos<=2){ //Esta Função Serve para ver se existem 2 nós ou menos.
            menorCiclo = -1;
            v=1;
        }
        
        //System.out.println("" +mt.getCountColumns());
        if(mt.getCountColumns()==4 && mt.getCountRows()==4){
          if(checkCompleteGraph(graph)==true){
              menorCiclo = -1;
              v=1;
          }
          
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
                                    
                                    if (menorCiclo == graph.countNode() && coluna2 == idx) {
                                        break;
                                    }
                                    proxlin = c2;
                                    coluna1 = c2 - 1;
                                    break;
                                } else {
                                    counter2 += mt.getMatrix()[proxlin][coluna2];
                                    if (counter2 == 0
                                            && coluna2 == graph.countNode() - 1) {
                                        v = 1;
                                        break;
                                    }
                                }
                            }
                            if (menorCiclo == graph.countNode() && c2 == idx) {
                                break;
                            }
                            if (counter2 == 0 && c2 == graph.countNode() - 1) {
                                break;
                            }
                            bug++;
                            //System.out.println("" +bug + "aad");
                            if(bug > ((graph.countNode() * graph.countEdge())* graph.countNode())){
                                        
                               break;
                                    }
                        }
                    }
                    if (menorCiclo == graph.countNode() && c2 == idx) {
                        break;
                    }
                    if (counter2 == 0 && c2 == graph.countNode() - 1) {
                        break;
                    }
                    if(bug > ((graph.countNode() * graph.countEdge())* graph.countNode())){
                                        
                               break;
                                    }
                }
                if (menorCiclo == graph.countNode() && c2 == idx) {
                    break;
                }

                if (counter2 == 0 && c2 == graph.countNode() - 1) {
                    break;
                }
                if(bug > ((graph.countNode() * graph.countEdge())* graph.countNode())){
                                        
                               break;
                                    }
            }
        }
        //System.out.println("" + menorCiclo + "");
        
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
            log.put("IdentificationGraph", "checkPlanarGraph", 0, "O grafo não é planar] :: [FALSE");
            return false;
        } else {
            log.put("IdentificationGraph", "checkPlanarGraph", 1, "O grafo é planar] :: [TRUE");
            return true;
        }
    }
}