package com.mycompany.estruturas202602;

public class BuscaProfundidade {
    private static final int BRANCO = 0;
    private static final int CINZA = 1;
    private static final int PRETO = 2;
    
    private Integer dist[];
    private Integer distFinal[];
    private Integer cor[];
    private Integer pai[];
    private int tempo = 0;
    
    private Grafo g; 
    
    BuscaProfundidade(Grafo g){
        
        this.g = g;
        dist = new Integer[g.getV()];
        distFinal = new Integer[g.getV()];
        cor = new Integer[g.getV()];
        pai = new Integer[g.getV()];
        
        for (int i = 0; i < g.getV(); i++){
            dist[i] = 0;
            cor[i]  = BRANCO;
            pai[i]  = null;
            distFinal[i] = 0;
        }
    }
    
    void DFS(){
        
        for (int i = 0; i < g.getV(); i++)
            if (cor[i] == BRANCO)
                DFS_visit(i);
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
        
        System.out.println("Distancia Final");
        for (int i = 0; i < g.getV(); i++){
            System.out.print(distFinal[i] + " |");
        }
        System.out.println();
        
        System.out.println("Pai");
        for (int i = 0; i < g.getV(); i++){
            System.out.print(pai[i] + " |");
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
    
    
    private void DFS_visit(int u){
        cor[u] = CINZA;
        tempo++;
        dist[u] = tempo;

        for (int v = 0; v < g.getV(); v++){
            if (g.ehAdjacente(v, u)){
                if (cor[v] == BRANCO){
                   // System.out.println("está em " + u + " entrou " + v);
                    pai[v] = u;
                    DFS_visit(v);
                }
            }
        }
        cor[u] = PRETO;
        tempo++;
        distFinal[u] = tempo;

    }
}
