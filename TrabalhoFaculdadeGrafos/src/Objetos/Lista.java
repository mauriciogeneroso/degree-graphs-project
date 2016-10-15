package Objetos;

import java.util.ArrayList;

/**
 * @Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso 
 */
public class Lista {
    
    private ArrayList<String> lista = new ArrayList<>();

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    
    public void addElemento(String valor){
        lista.add(valor);
    }

    @Override
    public String toString() {
        return "Lista{" + "lista=" + lista + '}';
    }
}