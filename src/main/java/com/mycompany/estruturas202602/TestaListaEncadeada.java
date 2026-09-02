
package com.mycompany.estruturas202602;

public class TestaListaEncadeada {
    
    public static void main(String[] args){
    
        ListaEncadeada lista = new ListaEncadeada();
        lista.insere(13);
        lista.insere(22);
        lista.insere(50);
        lista.insere(77);
        
        lista.imprimeLista();
    
        lista.removeNodo(77);
        
        lista.insere(88);
        
        

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
