package Objetos.Armazenamento;

/**
 * Esta classe é um complemento para ser usada na Lista de Adjacência onde
 * armazena o nó da adjacência.
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
public class AdjacencyElement implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String node;

    /**
     * Elemento Adjacente.
     *
     * @param no String - Nome do nó
     */
    public AdjacencyElement(String no) {
        this.node = no;
    }

    /**
     * Retorna o Objeto em String.
     *
     * @return String - Conteúdo do objeto para String
     */
    @Override
    public String toString() {
        return "{" + "No = " + node + '}';
    }
}
