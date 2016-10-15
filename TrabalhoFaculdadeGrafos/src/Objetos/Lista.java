/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author pigo
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
