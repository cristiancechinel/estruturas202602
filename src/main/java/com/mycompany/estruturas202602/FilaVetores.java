package com.mycompany.estruturas202602;

public class FilaVetores {
    private Integer[] dados;
    private int qt, ini;
    
    FilaVetores(int tam){
        dados = new Integer[tam];
        qt = 0; ini = 0;
    }
    
    void imprime2(){
       for (int i = 0; i < qt; i++){
            int pos = (ini + i)% dados.length;
            System.out.print(dados[pos] + "->");
        }
            
    }
    void imprime(){
    
        int i = ini;
        int j = 0;
        while (j < qt){
            System.out.print(dados[i] + "->");
            i = (i + 1) % dados.length;
            j++;
        }
    
    }
    
    Integer remove(){
        if (qt > 0){
            Integer valor = dados[ini];
            ini = (ini + 1) % dados.length;
            qt--;
            return valor;
        }
        return null;
    }
    
    void insere(int valor){
        if (qt < dados.length){
            int posfinal = (ini + qt) % dados.length;
            dados[posfinal] = valor;
            qt++;
        }
    }
    
}
