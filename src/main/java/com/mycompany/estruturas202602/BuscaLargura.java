
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
        
        System.out.println("Distancia");
        for (int i = 0; i < g.getV(); i++){
            System.out.print(dist[i] + " |");
        }
        System.out.println();
        
        System.out.println("Pai");
        for (int i = 0; i < g.getV(); i++){
            System.out.print(pai[i] + " |");
        }
        System.out.println();
    }
    
    void caminho(int destino, String[] cidades){
        
        PilhaEncadeada p = new PilhaEncadeada();
        int aux = destino;
        p.empilha(destino);
        while (pai[aux] != null){
            p.empilha(pai[aux]);
            aux = pai[aux];
        }
        // desempilhar tudo e imprimir cada elemento
        
        while (!p.vazia()){
            int nv = p.desempilha();
            System.out.print(cidades[nv] + "->");
        }
        System.out.println();
    }
    
    void caminho(int destino){
    
        PilhaEncadeada p = new PilhaEncadeada();
        int aux = destino;
        p.empilha(destino);
        while (pai[aux] != null){
            p.empilha(pai[aux]);
            aux = pai[aux];
        }
        // desempilhar tudo e imprimir cada elemento
        
        while (!p.vazia())
            System.out.print(p.desempilha() + "->");
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
