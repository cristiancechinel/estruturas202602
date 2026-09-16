
package com.mycompany.estruturas202602;

public class TestaListaEncadeada {
    
    public static void main(String[] args){
    
        ListaDuplamenteEncadeada L1 = new ListaDuplamenteEncadeada();
        ListaDuplamenteEncadeada L2 = new ListaDuplamenteEncadeada();

       // L1.insereInicio(20);
       // L1.insereInicio(30);
        L1.imprimeLista();
        
        L2.insereInicio(66);
        L2.insereInicio(99);
        L2.imprimeLista();
        
        L1.concatenaLista(L2);
        L1.imprimeLista();

       
    }
    
}
