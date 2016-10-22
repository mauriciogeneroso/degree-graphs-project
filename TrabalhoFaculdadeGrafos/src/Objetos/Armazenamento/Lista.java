package Objetos.Armazenamento;

import java.util.ArrayList;

/**
 * Classe genérica para utilização no armazenamento das Listas de Adjacência e
 * Incidência.
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
public class Lista<T> implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    ArrayList<T> lista = new ArrayList<>();

    public Lista() {

    }

    public void adiciona(T t) {
        lista.add(t);
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public String toString() {
        String imprimir = "";
        for (int i = 0; i < lista.size(); i++) {
            imprimir += lista.get(i) + " -> ";
        }
        imprimir += null;
        return imprimir;
    }

}
