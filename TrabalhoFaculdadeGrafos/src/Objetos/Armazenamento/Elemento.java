package Objetos.Armazenamento;

/**
 *
 * @author pigo
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
