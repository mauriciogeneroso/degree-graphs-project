package Objetos.Armazenamento;

/**
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 */
public class ListaInc {

    private Elemento primeiro;
    private Elemento ultimo;

    private int totalDeElementos;

    public ListaInc(String no) {
        Elemento ele = new Elemento(no);
        this.primeiro = ele;
        this.ultimo = ele;
    }

    public void adiciona(String no, String aresta) {
        Elemento novo = new Elemento(no, aresta);
        this.ultimo.setProximo(novo);
        this.ultimo = novo;
        this.totalDeElementos++;
    }

    @Override
    public String toString() {
        Elemento ele = this.primeiro;
        String imprimir = "";
        if (ele.getProximo() == null) {
            imprimir += null;
        } else{
            ele = ele.getProximo();
            while (ele != null) {
                imprimir += ele + " -> ";
                ele = ele.getProximo();
            }
        }
        return imprimir;
    }

}