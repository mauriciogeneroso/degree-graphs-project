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
 * @param <T> Parametrização da lista
 * @since 15/10/2016
 *
 * @version 1.7
 */
public class Lista<T> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    ArrayList<T> lista = new ArrayList<>();

    /**
     * Construtor
     */
    public Lista() {

    }

    /**
     * Adiciona na lista
     *
     * @param t T - Valor a ser inserido
     */
    public void adiciona(T t) {
        lista.add(t);
    }

    /**
     * Verifica se a lista está vazia
     *
     * @return boolean - Verdadeiro se esitver vazio, caso contrário falso.
     */
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    /**
     * Retorna o Objeto em String
     *
     * @return String - Conteúdo do objeto para String.
     */
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
