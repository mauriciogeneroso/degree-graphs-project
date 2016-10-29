package CaracteristicasGrafo;

import Objetos.Grafo;

   public final class DFSCycle {

    private boolean marked[] =  new boolean[100];
    private int s;
    private Grafo g;
    private boolean hasCycle;

    // s - starting node
    public DFSCycle(Grafo grafo, int s) {
        this.g = g;
        this.s = s;
        findCycle(grafo,s,s);
    }

    public boolean hasCycle() {
        return hasCycle;
    }

    public void findCycle(Grafo grafo, int v, int u) {
        marked[v] = true;
        
        int[][] getAdjacentNodes = grafo.getMatrizAdj().getMatriz();
        int[] nodes = null;
        for (int i = 0; i < grafo.quantidadeNos(); i++) {
            nodes[i] = getAdjacentNodes[v][i];
        }
        
        for (int w : nodes) {
            if(!marked[w]) {
                marked[w] = true;
                findCycle(grafo,w,v);
            } else if (v != u) {
                hasCycle = true;
                return;
            }
        }

    }  
}