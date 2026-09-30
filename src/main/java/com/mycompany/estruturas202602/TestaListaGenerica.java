package com.mycompany.estruturas202602;

public class TestaListaGenerica {
    
    public static void main(String[] args){
    
        ListaDuplamenteEncadeadaGen<Character> lista = 
                new ListaDuplamenteEncadeadaGen<Character>();
        
        lista.insereInicio('+');
        lista.insereInicio('*');
        lista.insereInicio('/');
        lista.imprimeLista();
        
        lista.insereUltimo('!');
        lista.imprimeLista();
        
        lista.removeNodo('*');
        
        lista.imprimeLista();

        
       /* ListaVetoresGenerico<Integer> lista = 
                new ListaVetoresGenerico<Integer>(10);
        
        lista.insereFinal(10);
        lista.insereFinal(20);
        lista.insereFinal(30);
        lista.imprime();
        
        ListaVetoresGenerico<String> palavras = 
                new ListaVetoresGenerico<String>(5);
        
        palavras.insereFinal("casa");
        palavras.insereFinal("aula");
        palavras.insereFinal("divertida");
        palavras.imprime();
        
      */
       
    
    }
    
}
