package com.mycompany.estruturas202602;

public class TestaPilha {
 
    public static void main(String[] args){
        
        PilhaVetores pilha = new PilhaVetores(5);
        pilha.empilha(7);
        pilha.empilha(9);
        pilha.empilha(12);
        pilha.empilha(13);
        
        pilha.imprime();
        
        System.out.println(pilha.desempilha());
        System.out.println(pilha.desempilha());
        System.out.println(pilha.desempilha());
        System.out.println(pilha.desempilha());
        System.out.println(pilha.desempilha());
    }
}
