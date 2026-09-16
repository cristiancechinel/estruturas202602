
package com.mycompany.estruturas202602;

public class TestaListaEncadeada {
    
    public static void main(String[] args){
    
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
       
        lista.insereInicio(15);
        lista.insereInicio(20);
        lista.insereInicio(25);
        
        
        
        lista.imprimeLista();
        
        lista.removeInicio();
        lista.removeUltimo();
        
        lista.imprimeLista();
       
    }
    
}
