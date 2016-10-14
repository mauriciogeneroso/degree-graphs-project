/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author pigo
 */
public class Grafo {

    private int[][] matrizAdjNaoDir;
    private int[][] matrizIncNaoDir;
    private int[][] matrizAdjDir;
    private int[][] matrizIncDir;
    
    public Grafo(){
        matrizAdjNaoDir = null;
        matrizIncNaoDir = null;
        matrizAdjDir = null;
        matrizIncDir = null;
    }
    
    public int[][] getMatrizAdjNaoDir() {
        return matrizAdjNaoDir;
    }

    public void setMatrizAdjNaoDir(int[][] matrizAdjNaoDir) {
        this.matrizAdjNaoDir = matrizAdjNaoDir;
    }

    public int[][] getMatrizIncNaoDir() {
        return matrizIncNaoDir;
    }

    public void setMatrizIncNaoDir(int[][] matrizIncNaoDir) {
        this.matrizIncNaoDir = matrizIncNaoDir;
    }

    public int[][] getMatrizAdjDir() {
        return matrizAdjDir;
    }

    public void setMatrizAdjDir(int[][] matrizAdjDir) {
        this.matrizAdjDir = matrizAdjDir;
    }

    public int[][] getMatrizIncDir() {
        return matrizIncDir;
    }

    public void setMatrizIncDir(int[][] matrizIncDir) {
        this.matrizIncDir = matrizIncDir;
    }

}
