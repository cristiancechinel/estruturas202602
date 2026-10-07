
package com.mycompany.estruturas202602;

public class TestaNodoArvore {
    
    public static void main(String[] args){
    
        NodoArvore a = new NodoArvore(80, null, null);
       // a = a.insere(a, 80);
        a = a.insere(a, 70);
        a = a.insere(a, 65);
        a = a.insere(a, 75);
        a = a.insere(a, 95);
        a = a.insere(a, 100);
        
        a.imprimePreOrdem(a);
        System.out.println();
        a.imprimeSimetrica(a);
        
        //NodoArvore d = new NodoArvore(8, null, null);
       // NodoArvore e = new NodoArvore(14, null, null);
       // NodoArvore f = new NodoArvore(25, null, null);
        
        //NodoArvore b = new NodoArvore(13, d, e);
        //NodoArvore c = new NodoArvore(20, null, f);
        
      //  NodoArvore a = new NodoArvore(15, b, c);
        
       // System.out.println("existe: " + a.busca(a,33));
        
       // System.out.println("qt: " + a.quantidade(a));
        // desenvolver método para calcular qt de elementos
        
        
    
    }
    
}
