
package com.mycompany.estruturas202602;

public class ArvoreBinaria {
    private NodoArvore raiz;
    
    ArvoreBinaria(){
        this.raiz = null;
    }
    
    void remove(int v){
        if (raiz != null)
            raiz.remove(raiz, v);
        
    }
    
    void insere(int v){
        if (raiz == null)
            raiz = new NodoArvore(v, null, null);
        else
            raiz = raiz.insere(raiz, v);
    }
    
    void imprimePre(){
        System.out.println("Pré-Ordem:");
        if (raiz != null)
            raiz.imprimePreOrdem(raiz);
        System.out.println();
    }
    
}
