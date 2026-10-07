package com.mycompany.estruturas202602;

public class NodoArvore {
    
    private NodoArvore esq;
    private Integer valor;
    private NodoArvore dir;
        
    NodoArvore(){}
    
    NodoArvore(Integer n, NodoArvore e, NodoArvore d){
        this.valor = n; 
        this.esq = e;
        this.dir = d;
    }

    void imprimePosOrdem(NodoArvore atual){
        if (atual !=null){
            System.out.print("<");
            imprimePosOrdem(atual.esq);
            imprimePosOrdem(atual.dir);
            System.out.print(atual.valor);
            System.out.print(">");
        }
    }

    
    void imprimeSimetrica(NodoArvore atual){
        if (atual != null){
            System.out.print("<");
            imprimeSimetrica(atual.esq);
            System.out.print(atual.valor);
            imprimeSimetrica(atual.dir);
            System.out.print(">");
        }
    }

    void imprimePreOrdem(NodoArvore atual){
        if (atual != null){
            System.out.print("<");
            System.out.print(atual.valor);
            imprimePreOrdem(atual.esq);
            imprimePreOrdem(atual.dir);
            System.out.print(">");
        }
    }
    
    NodoArvore insere(NodoArvore atual, int valor){
    
        if (atual == null) 
            atual = new NodoArvore(valor, null, null);
        else
            if (valor < atual.valor)
                atual.esq = insere(atual.esq, valor);
            else
                atual.dir = insere(atual.dir, valor);
        return atual;

    }
    
    
    int somatorio(NodoArvore nodo){
        if (nodo == null) return 0;
        else return nodo.valor + 
             somatorio(nodo.esq) + 
             somatorio(nodo.dir);
    }
    
    
    int quantidade(NodoArvore nodo){
        if (nodo == null) return 0;
        else return 1 + 
             quantidade(nodo.esq) +
             quantidade(nodo.dir);
    
    }
    
    boolean busca(NodoArvore nodo, int v){
        if (nodo == null) return false;
        else 
            if (nodo.valor == v) return true;
            else 
                return busca(nodo.esq, v) || 
                       busca(nodo.dir, v);
    }
    
}
