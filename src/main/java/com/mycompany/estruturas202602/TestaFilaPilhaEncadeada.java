
package com.mycompany.estruturas202602;

public class TestaFilaPilhaEncadeada {
    
    public static void main(String[] args){
    
        FilaEncadeada fila = new FilaEncadeada();
        
        fila.insereFinal(60);
        fila.insereFinal(80);
        fila.insereFinal(99);
        fila.insereFinal(666);
        
        fila.imprimeFila();
        
        System.out.println("removeu " + fila.removeInicio());
        System.out.println("removeu " + fila.removeInicio());
        fila.imprimeFila();
        
    
    }
    
}
