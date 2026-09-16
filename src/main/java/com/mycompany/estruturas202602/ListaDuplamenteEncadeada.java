
package com.mycompany.estruturas202602;

public class ListaDuplamenteEncadeada {

    private Nodo inicio, ultimo; 
    
    private class Nodo{
        Nodo prox;
        Nodo ant;
        Integer dado;
    }
    
    ListaDuplamenteEncadeada(){
        inicio = null;
        ultimo = null;
    }

    //adaptar insercao inicio
    void insereInicio(Integer n){
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
    
    void insereUltimo(Integer n){
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
    
    Integer removeUltimo(){
        if (inicio != null){
            Integer temp = ultimo.dado;
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
    
    Integer removeInicio(){
        //verificar se existe algum elemento
        if (inicio != null){
            Integer temp = inicio.dado;
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
    
    
 /*
    Integer removeNodo(Integer n){
        Nodo ant = null;
        Nodo temp = inicio;
                    
        while (temp != null && temp.dado != n){
            ant = temp;
            temp = temp.prox;
        }
        //não encontrou
        if (temp == null) return null;
        
        //encontrou na primeira posicao
        Integer retira = temp.dado;
       
        if (ant == null){
            if (inicio == ultimo)
                inicio = ultimo = null;
            else 
                inicio = inicio.prox;
        }
        else { 
            //encontrou no meio ou final
            ant.prox = temp.prox;
            if (ultimo == temp) //encontrou no final
                ultimo = ant;
        }
        return retira;
    }
    
    
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
