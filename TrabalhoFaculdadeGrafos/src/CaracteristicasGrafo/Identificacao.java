package CaracteristicasGrafo;

import Objetos.Armazenamento.Matriz;
import Objetos.Armazenamento.MatrizAdj;
import Objetos.Grafo;

/**
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
*/

public class Identificacao {
   
    public int VerifGrafoSimples(Grafo grafo) {
        int v = 0;
        
        Matriz mt = (MatrizAdj) grafo.getMatrizAdj();
        
        mt.imprimirMatriz();
        
       
        
        return v;          
    }
    
    public int VerifGrafoPlanar() {
        int v = 0;
        
        return v;    
    }
    
    public int VerifGrafoCompleto() {
        int v = 0;
        
        return v;
    }
    
    public int VerifGrafoConexo() {
        int v = 0;
        
        return v;
    }
}