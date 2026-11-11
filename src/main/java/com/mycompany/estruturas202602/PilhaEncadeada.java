
package com.mycompany.estruturas202602;

public class PilhaEncadeada {
    private ListaDuplamenteEncadeada lista;
    
    PilhaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }

    boolean vazia(){
        return lista.vazia();
    
    }
    void empilha(int valor){
        lista.insereUltimo(valor);
    }
    
    Integer desempilha(){
        return lista.removeUltimo();
    }
    
    void imprimePilha(){
        lista.imprimeLista();
    }
    
}
