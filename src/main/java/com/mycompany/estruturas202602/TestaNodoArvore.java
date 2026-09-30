
package com.mycompany.estruturas202602;

public class TestaNodoArvore {
    
    public static void main(String[] args){
    
        
        NodoArvore d = new NodoArvore(8, null, null);
        NodoArvore e = new NodoArvore(14, null, null);
        NodoArvore f = new NodoArvore(25, null, null);
        
        NodoArvore b = new NodoArvore(13, d, e);
        NodoArvore c = new NodoArvore(20, null, f);
        
        NodoArvore a = new NodoArvore(15, b, c);
        
        System.out.println("existe: " + a.busca(a,33));
        
        System.out.println("qt: " + a.quantidade(a));
        // desenvolver método para calcular qt de elementos
        
        
    
    }
    
}
