package com.mycompany.estruturas202602;

public class ListaVetores {
    
    private Integer dados[];//vetor de dados
    private int qt; //quantidade
    
    ListaVetores(int tam){
        dados = new Integer[tam];
    }
    
    Integer removeFinal(){
        if (qt > 0){
            Integer temp = dados[qt-1];
            qt--;
            return temp;
        }
        return null; 
    }
    
    void insereFinal(int n){
        if (qt < dados.length){
            dados[qt] = n;
            qt++;
        }
    }
    
    void imprime(){
        for (int i = 0; i < qt; i++){
            System.out.print(dados[i] + "-");
        }
    }
    
}
