
package com.mycompany.estruturas202602;

public class BuscaLargura {
    private static final int BRANCO = 0;
    private static final int CINZA = 1;
    private static final int PRETO = 2;
    
    private Integer dist[];
    private Integer cor[];
    private Integer pai[];
    
    private Grafo g; 
    
    BuscaLargura(Grafo g){
        this.g = g;
        dist = new Integer[g.getV()];
        cor  = new Integer[g.getV()];
        pai  = new Integer[g.getV()];
        
        for (int i = 0; i < g.getV(); i++){
            dist[i] = 0;
            cor[i]  = BRANCO;
            pai[i]  = null;
        }
    }

    void imprime(){
        System.out.println("Cores");
        for (int i = 0; i < g.getV(); i++){
            System.out.print(cor[i] + " |");
        }
        System.out.println();
    }
    
    void busca(int origem){
        cor[origem] = CINZA;
        FilaEncadeada fila = new FilaEncadeada();
        fila.insereFinal(origem);
        while (!fila.vazia()){
            int u = fila.removeInicio();
            for (int v = 0; v < g.getV(); v++){
                if (g.ehAdjacente(u, v)){
                    if (cor[v] == BRANCO){
                        pai[v] = u;
                        dist[v] = dist[u] + 1;
                        cor[v] =  CINZA;
                        fila.insereFinal(v);
                    }
                }
            }
            cor[u] = PRETO;
        }
    }
}
