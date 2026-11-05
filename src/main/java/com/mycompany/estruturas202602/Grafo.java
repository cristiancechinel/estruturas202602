package com.mycompany.estruturas202602;


public class Grafo {
    private int V;
    private int mat[][];
    
    Grafo(int nv){
        if (nv >= 1) 
            this.V = nv;
        else 
            this.V = 1;
    
        mat = new int[V][V];
        
    }
    
    int getV(){
        return this.V;
        
    }
    
    void insereAresta(int nv1, int nv2){
        if (nv1 >= 0 && nv1 <this.V && nv2 >=0 && nv2 < this.V){
            this.mat[nv1][nv2] = 1;
            this.mat[nv2][nv1] = 1;
        }
    
    }
    
    boolean ehAdjacente(int nv1, int nv2){
        if (nv1 >= 0 && nv1 <this.V && nv2 >=0 && nv2 < this.V)
            if (mat[nv1][nv2] == 1) 
                return true;
        
        return false;
    }
    
    void imprime(){
        for (int i = 0; i < this.V; i++){
            for (int j = 0; j < this.V; j++){
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
