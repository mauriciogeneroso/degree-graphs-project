package Objetos.Armazenamento;

/**
 *  Esta classe é um complemento para ser usada na Lista de Incidência onde armazena o nó e a aresta da adjacência..
 * 
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso - Classe implementada por Maurício
*/
public class Elemento {

    private String no;
    private String aresta;
    private Elemento proximo;
    
    public Elemento(String no){
        this.no = no;
    }
    
    public Elemento(String no, String aresta){
        this.no = no;
        this.aresta = aresta;
    }

    public Elemento getProximo() {
        return proximo;
    }
    
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "{" + "No = " + no + ", Aresta = " + aresta + '}';
    }
    
}
