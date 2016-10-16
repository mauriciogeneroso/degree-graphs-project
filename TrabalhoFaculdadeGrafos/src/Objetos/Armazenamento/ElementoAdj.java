package Objetos.Armazenamento;

/**
 *  Esta classe é um complemento para ser usada na Lista de Adjacência onde armazena o nó da adjacência.
 * 
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso - Classe implementada por Maurício
*/
public class ElementoAdj {
    
    private String no;
    
    public ElementoAdj(String no){
        this.no = no;
    }

    @Override
    public String toString() {
        return "{" + "No = " + no + '}';
    }
}
