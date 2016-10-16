package Objetos.Armazenamento;

import java.util.ArrayList;

/**
 * Classe genérica para utilização no armazenamento das Listas de Adjacência e Incidência.
 * 
 * 
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso - Classe implementada por Maurício
 * @param <T>
 */
public class Lista<T> {

    ArrayList<T> lista = new ArrayList<>();

    public Lista() {
        
    }
    
    public void adiciona(T t) {
        lista.add(t);
    }
    
    public boolean isEmpty(){
        if (lista.isEmpty())
            return true;
        return false;
    }

    @Override
    public String toString() {
        String imprimir = "";
        for (int i = 0; i < lista.size(); i++){
            imprimir += lista.get(i) + " -> ";
        }
        imprimir += null;
        return imprimir;
    }

}