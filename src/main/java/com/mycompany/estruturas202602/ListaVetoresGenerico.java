package com.mycompany.estruturas202602;

public class ListaVetoresGenerico<Item> {
    
    private Item dados[];//vetor de dados
    private int qt; //quantidade
    
    ListaVetoresGenerico(int tam){
        dados = (Item[]) new Object[tam];
    }
    
    
    private void redimensiona(int max){
        Item temp[] = (Item[]) new Object[max];
       
        for (int i = 0; i < qt; i++)
            temp[i] = dados[i];
        
        dados = temp; 
    }
    
    Item removePosicao(int i){
        if ((i >= 0) && (i < this.qt)){
            Item item = dados[i];
            for (int j = i+1; j < qt; j++)
                dados[j-1] = dados[j];
            
            if (qt > 0 && qt == dados.length/4)
                redimensiona(dados.length/2);
            return item;
        }
        else
            return null; 
    }
    Item removeFinal(){
        if (qt > 0){
            Item temp = dados[qt-1];
            qt--;
           
            if (qt > 0 && qt == dados.length/4)
                redimensiona(dados.length/2);
            
            return temp;
        }
        return null; 
    }
    
    void insereFinal(Item n){
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
