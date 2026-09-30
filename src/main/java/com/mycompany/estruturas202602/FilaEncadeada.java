package com.mycompany.estruturas202602;

public class FilaEncadeada {
    private ListaDuplamenteEncadeada lista;
    
    FilaEncadeada(){
        lista = new ListaDuplamenteEncadeada();
    }
    
    void insereFinal(int valor){
        lista.insereUltimo(valor);
    }
    
    Integer removeInicio(){
        return lista.removeInicio();
    }
    
    void imprimeFila(){
        lista.imprimeLista();
    }
}
