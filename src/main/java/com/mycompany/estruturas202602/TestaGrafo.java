
package com.mycompany.estruturas202602;

public class TestaGrafo {

    public static void main(String[] args){
        String[] cidades = {"Porto Alegre", "Florianópolis", "Curitiba",
                            "São Paulo", "Belo Horizonte", "Rio de Janeiro", 
                            "Salvador", "Brasília", "Cuiabá", "Fortaleza", "Manaus"};
        
        int [][] rotas = {{0,1},{0,3},{1,2},{2,5},{3,4},{2,3},{5,6},{5,8},{4,7},
                          {4,8}, {8,10}, {7,9}, {3,6}, {6,9}, {9,10}};
                      
        Grafo g = new Grafo(cidades.length);
        
        for (int i = 0; i < rotas.length; i++){
            int origem = rotas[i][0];
            int destino =rotas[i][1];
            g.insereAresta(origem, destino);
        }
        
        BuscaLargura bl = new BuscaLargura(g);
        bl.busca(0);
        bl.caminho(5, cidades);
        
        
/*        g.insereAresta(0, 1);
        g.insereAresta(0, 3);
        g.insereAresta(1, 2);
        g.insereAresta(2, 3);
        g.insereAresta(2, 4);
        
        g.imprime();
        
        BuscaLargura bl = new BuscaLargura(g);
        bl.busca(4);
        
        bl.imprime();
        
        bl.caminho(0);

        //g.insereAresta(3, 4);
        
       // g.imprime();
        
        //System.out.println("Aresta entre 3 e 4 : " + g.ehAdjacente(3, 4));
*/    
    
    }

    
}
