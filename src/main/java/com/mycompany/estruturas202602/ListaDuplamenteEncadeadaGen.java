
package com.mycompany.estruturas202602;

public class ListaDuplamenteEncadeadaGen<Item> {

    private Nodo inicio, ultimo; 
    
    private class Nodo{
        Nodo prox;
        Nodo ant;
        Item dado;
    }
    
    ListaDuplamenteEncadeadaGen(){
        inicio = null;
        ultimo = null;
    }

   void concatenaLista(ListaDuplamenteEncadeadaGen L2){
       
       if (L2.inicio != null){
           if (this.inicio == null){
               this.inicio = L2.inicio;
               this.ultimo = L2.ultimo;
           }
           else {
               this.ultimo.prox = L2.inicio;
               L2.inicio.ant = this.ultimo;
               this.ultimo = L2.ultimo;
           }
       }
   } 
    
   
    //adaptar insercao inicio
    void insereInicio(Item n){
        Nodo novo = new Nodo();
        novo.dado = n;
        
        novo.ant = null;
        novo.prox = inicio;
        
        if (inicio == null)
            ultimo = novo;
        else
            inicio.ant = novo;
        
        inicio = novo;
    }
    
    void insereUltimo(Item n){
        Nodo novo = new Nodo();
        novo.dado = n;
        
        novo.prox = null;
        novo.ant = ultimo;
        
        if (inicio == null)
            inicio = novo;
        else
            ultimo.prox = novo;
        
        ultimo = novo;
    
    }
    
   /* 
    void insereOrdenado(Integer n){
        Nodo ant = null;
        Nodo novo = new Nodo();
        novo.dado = n;
        Nodo temp = inicio;

        while (temp != null  && temp.dado < n){
            ant = temp;
            temp = temp.prox;
        }

        //inserção no inicio
        if (ant == null){
            novo.prox = inicio;
            inicio = novo;
        }
        else{
            novo.prox = ant.prox;
            ant.prox = novo;
        }
    }   
    
    */
    
    Item removeUltimo(){
        if (inicio != null){
            Item temp = ultimo.dado;
            if (inicio == ultimo)
                inicio = ultimo = null;
            else{
                ultimo = ultimo.ant;
                ultimo.prox = null;
            }
            return temp;
        
        }
        return null;
    }
    
    Item removeInicio(){
        //verificar se existe algum elemento
        if (inicio != null){
            Item temp = inicio.dado;
            if (inicio == ultimo)
                inicio = ultimo = null;
            else {
                inicio = inicio.prox;
                inicio.ant = null;
            }
            return temp;
       }
        return null;
    }
    
    Item removeNodo(Item n){
        //Nodo ant = null;
        Nodo temp = inicio;
        while (temp != null && !temp.dado.equals(n))
            temp = temp.prox;
        //não encontrou
        if (temp == null) return null;

        Item retira = temp.dado;
       
        if (temp == inicio) 
            inicio = inicio.prox;
        else
            temp.ant.prox = temp.prox;
        if (temp == ultimo)
            ultimo = ultimo.ant;
        else
            temp.prox.ant = temp.ant;
        return retira;
    }
    
    /*
    
    void imprimeListaRec(){
        System.out.println("impressão recursiva");
        imprimeRecursivo(inicio);
    }
    
    private void imprimeRecursivo(Nodo temp){
    
        if (temp != null){
            System.out.print(temp.dado +  " ->");
            imprimeRecursivo(temp.prox);
            //para imprimir lista ao contrario, inverter a ordem das linhas acima
        }
    }
    
    
    void imprimeLista02(){
        Nodo temp = inicio;
        while (temp != null){
            System.out.print(temp.dado + " -> ");
            temp = temp.prox;
        }
    }
    */
    
    void imprimeListaReversa(){
        System.out.println("impressão invertida");
    
        for (Nodo temp = ultimo; temp != null; temp = temp.ant)
            System.out.print(temp.dado + " -> ");
        System.out.println();
        
    
    }
    
    
    void imprimeLista(){
        System.out.println("impressão normal");
        
        for (Nodo temp = inicio; temp != null; temp = temp.prox)
            System.out.print(temp.dado + " -> ");
        System.out.println();
    
    }

    
}
