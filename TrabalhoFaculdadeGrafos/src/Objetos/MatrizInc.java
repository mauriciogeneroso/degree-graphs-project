package Objetos;

/**
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 */
public class MatrizInc extends Matriz {
    
    public void alterarMatrizGrafoDirecionado(int noInicial, int noFinal, int aresta) {
        if (noInicial == noFinal){
            matriz[noInicial][aresta] += 1;
        } else {
            matriz[noInicial][aresta] += 1;
            matriz[noFinal][aresta] -= 1;
        }
        System.out.println("Matriz de incidência - Grafo direcionado: ");
        this.imprimirMatriz();
    }
    
    public void alterarMatrizGrafoNaoDirecionado(int noInicial, int noFinal, int aresta) {
        if (noInicial == noFinal){
            // Se houver laço só irá armazenar uma vez
            matriz[noInicial][aresta] += 1;
        } else {
            matriz[noInicial][aresta] += 1;
            matriz[noFinal][aresta] += 1;
        }
        System.out.println("Matriz de Incidência - Grafo não direcionada: ");
        this.imprimirMatriz();
    }
    
}