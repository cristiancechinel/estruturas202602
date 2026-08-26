package com.mycompany.estruturas202602;

public class ListaVetores {
    
    private Integer dados[];//vetor de dados
    private int qt; //quantidade
    
    ListaVetores(int tam){
        dados = new Integer[tam];
    }
    
    
    void redimensiona(int max){
        Integer temp[] = new Integer[max];
       
        for (int i = 0; i < qt; i++)
            temp[i] = dados[i];
        
        dados = temp; 
    }
    
    Integer removePosicao(int i){
        if ((i >= 0) && (i < this.qt)){
            Integer item = dados[i];
            for (int j = i+1; j < qt; j++)
                dados[j-1] = dados[j];
            
            if (qt > 0 && qt == dados.length/4)
                redimensiona(dados.length/2);
            return item;
        }
        else
            return null; 
    }
    Integer removeFinal(){
        if (qt > 0){
            Integer temp = dados[qt-1];
            qt--;
           
            if (qt > 0 && qt == dados.length/4)
                redimensiona(dados.length/2);
            
            return temp;
        }
        return null; 
    }
    
    void insereFinal(int n){
        if (qt == dados.length)
            redimensiona(dados.length * 2);
            
        dados[qt] = n;
        qt++;
    
    }
    
    void imprime(){
        System.out.println("Tamanho = " + dados.length);
        for (int i = 0; i < qt; i++){
            System.out.print(dados[i] + "-");
        }
    }
    
}
