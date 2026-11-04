
package com.mycompany.estruturas202602;

public class TestaGrafo {

    public static void main(String[] args){
    
    
        Grafo g = new Grafo(5);
        
        g.insereAresta(0, 1);
        g.insereAresta(1, 2);
        g.insereAresta(2, 3);
        g.insereAresta(2, 4);
        g.insereAresta(3, 4);
        
        g.imprime();
        
        System.out.println("Aresta entre 3 e 4 : " + g.ehAdjacente(3, 4));
    
    
    }

    
}
