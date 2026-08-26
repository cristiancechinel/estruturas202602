
package com.mycompany.estruturas202602;

public class ListaEncadeada {

    private Nodo inicio; 
    
    private class Nodo{
        Nodo prox;
        Integer dado;
    }
    
    ListaEncadeada(){
        inicio = null;
    }

    void insere(Integer n){
        Nodo novo = new Nodo();
        novo.dado = n;
        novo.prox = inicio;
        inicio = novo;
    }
    
    Integer remove(){
        if (inicio != null){
            Integer temp = inicio.dado;
            inicio = inicio.prox;
            return temp;
            
        }
        return null;
    }

    
}
