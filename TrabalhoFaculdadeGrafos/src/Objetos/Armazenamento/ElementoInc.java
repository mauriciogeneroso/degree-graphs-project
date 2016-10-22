package Objetos.Armazenamento;

/**
 * Esta classe é um complemento para ser usada na Lista de Incidência onde
 * armazena o nó e a aresta da adjacência..
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 * @since 15/10/2016
 * @version 1.7
 */
public class ElementoInc implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String no;
    private String aresta;

    public ElementoInc(String no) {
        this.no = no;
    }

    public ElementoInc(String no, String aresta) {
        this.no = no;
        this.aresta = aresta;
    }

    @Override
    public String toString() {
        return "{" + "No = " + no + ", Aresta = " + aresta + '}';
    }

}
