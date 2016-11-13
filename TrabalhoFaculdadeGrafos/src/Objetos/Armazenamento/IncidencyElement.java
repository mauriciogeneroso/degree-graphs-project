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
 *
 * @since 15/10/2016
 * @version 1.7
 */
public class IncidencyElement implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String node;
    private String edge;

    /**
     * Retorna o Objeto em String.
     *
     * @param node String - Nome do n[o
     */
    public IncidencyElement(String node) {
        this.node = node;
    }

    /**
     * Retorna o Objeto em String.
     *
     * @param node String - Nome do n[o
     * @param edge String - Nome da aresta
     */
    public IncidencyElement(String node, String edge) {
        this.node = node;
        this.edge = edge;
    }

    /**
     * Retorna o Objeto em String
     *
     * @return String - Conteúdo do objeto para String.
     */
    @Override
    public String toString() {
        return "{" + "No = " + node + ", Aresta = " + edge + '}';
    }

}
