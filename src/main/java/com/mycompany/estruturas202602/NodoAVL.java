package com.mycompany.estruturas202602;

public class NodoAVL {
    
    private NodoAVL esq;
    private Integer valor;
    private NodoAVL dir;
        
    NodoAVL(){}
    
    NodoAVL(Integer n, NodoAVL e, NodoAVL d){
        this.valor = n; 
        this.esq = e;
        this.dir = d;
    }

    int max(int a, int b){
        if (a > b) return a;
        else return b;
    }
    
    int altura(NodoAVL atual){
    
        if (atual == null) 
            return -1;
        else 
            return 1 + 
                   max(altura(atual.esq), altura(atual.dir));    
    }
    
    NodoAVL rotacaoEsquerda(NodoAVL atual){
        NodoAVL aux = atual.dir;
        atual.dir = aux.esq;
        aux.esq = atual;
        return aux;
    }
    
    NodoAVL rotacaoDireita(NodoAVL atual){
    
    
    
    }
    
    
    void imprimePosOrdem(NodoAVL atual){
        if (atual !=null){
            System.out.print("<");
            imprimePosOrdem(atual.esq);
            imprimePosOrdem(atual.dir);
            System.out.print(atual.valor);
            System.out.print(">");
        }
    }

    
    void imprimeSimetrica(NodoAVL atual){
        if (atual != null){
            System.out.print("<");
            imprimeSimetrica(atual.esq);
            System.out.print(atual.valor);
            imprimeSimetrica(atual.dir);
            System.out.print(">");
        }
    }

    void imprimePreOrdem(NodoAVL atual){
        if (atual != null){
            System.out.print("<");
            System.out.print(atual.valor);
            imprimePreOrdem(atual.esq);
            imprimePreOrdem(atual.dir);
            System.out.print(">");
        }
    }
    NodoAVL remove(NodoAVL nodo, int v){
        if (nodo == null) 
            return null;
        else if (v < nodo.valor) 
                nodo.esq = remove(nodo.esq, v);
        else if (v > nodo.valor) 
                nodo.dir = remove(nodo.dir, v);
        else {//encontrou
            if (nodo.esq == null & nodo.dir == null)//sem filhos
                return null;
            if (nodo.esq == null) return nodo.dir;
            if (nodo.dir == null) return nodo.esq;
           
            NodoAVL temp = nodo.esq;
            while (temp.dir != null)
                temp = temp.dir;
            nodo.valor = temp.valor;
            temp.valor = v;
            nodo.esq = remove(nodo.esq, v);
        }
        return nodo;
    }
    
    
    
    NodoAVL insere(NodoAVL atual, int valor){
    
        if (atual == null) 
            atual = new NodoAVL(valor, null, null);
        else
            if (valor < atual.valor)
                atual.esq = insere(atual.esq, valor);
            else
                atual.dir = insere(atual.dir, valor);
        return atual;

    }
    
    
    int somatorio(NodoAVL nodo){
        if (nodo == null) return 0;
        else return nodo.valor + 
             somatorio(nodo.esq) + 
             somatorio(nodo.dir);
    }
    
    
    int quantidade(NodoAVL nodo){
        if (nodo == null) return 0;
        else return 1 + 
             quantidade(nodo.esq) +
             quantidade(nodo.dir);
    
    }
    
    boolean busca(NodoAVL nodo, int v){
        if (nodo == null) return false;
        else 
            if (nodo.valor == v) return true;
            else 
                return busca(nodo.esq, v) || 
                       busca(nodo.dir, v);
    }
    
}
