
package com.mycompany.estruturas202602;

public class TestaListaVetores {
    
    public static void main(String[] args){
    
        ListaVetores lista = new ListaVetores(5);
        
        lista.insereFinal(80);
        lista.insereFinal(95);
        lista.insereFinal(200);
        lista.insereFinal(66);
        lista.insereFinal(99);
        lista.insereFinal(77);
        
        lista.imprime();
        System.out.println();
        System.out.println("removeu -> " + lista.removeFinal());
        System.out.println("removeu -> " + lista.removeFinal());
        System.out.println("removeu -> " + lista.removeFinal());
        System.out.println("removeu -> " + lista.removeFinal());
        System.out.println("removeu -> " + lista.removeFinal());
        System.out.println("removeu -> " + lista.removeFinal());
        
        lista.imprime();
        
    
    
    }
    
    
}
