
package com.mycompany.estruturas202602;

public class TestaListaEncadeada {
    
    public static void main(String[] args){
    
        ListaEncadeada lista = new ListaEncadeada();
        lista.insereOrdenado(153);
        lista.insereOrdenado(22);
        lista.insereOrdenado(50);
        lista.insereOrdenado(777);
        
        lista.imprimeLista();
    
        lista.removeNodo(50);
        
        lista.insereOrdenado(88);
        
        

    //  System.out.println("removeu "+ lista.remove());
      //  System.out.println("removeu "+ lista.remove());
      //  System.out.println("removeu "+ lista.remove());
      //  System.out.println("removeu "+ lista.remove());
      //  System.out.println("removeu "+ lista.remove());
    
      //  lista.imprimeListaRec();

     //   lista.insere(66);
        
        lista.imprimeLista();
    }
    
}
