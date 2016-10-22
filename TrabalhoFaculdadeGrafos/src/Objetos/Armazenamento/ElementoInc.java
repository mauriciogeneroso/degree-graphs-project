package Objetos.Armazenamento;

import java.io.Serializable;
import javax.sql.rowset.serial.SerialArray;

/**
 * Esta classe é um complemento para ser usada na Lista de Incidência onde
 * armazena o nó e a aresta da adjacência..
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso - Classe implementada por Maurício
 */
public class ElementoInc implements Serializable {

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
