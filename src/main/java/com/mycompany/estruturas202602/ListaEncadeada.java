
package com.mycompany.estruturas202602;

public class ListaEncadeada {

    private Nodo inicio; 
    
    private class Nodo{
        Nodo prox;
        Integer dado;
    }
    
    ListaEncadeada(){
        inicio = null;
    }

    void insere(Integer n){
        Nodo novo = new Nodo();
        novo.dado = n;
        novo.prox = inicio;
        inicio = novo;
    }
   
    Integer remove(){
        if (inicio != null){
            Integer temp = inicio.dado;
            inicio = inicio.prox;
            return temp;
       }
        return null;
    }
 
    Integer removeNodo(Integer n){
        Nodo ant = null;
        Nodo temp = inicio;
        //pergunta, é possível inverter a ordem das verificações? 
        //exemplo: 
        //        while (temp.dado!= null && temp!= null)
        
        //                     
        while (temp != null && temp.dado != n){
            ant = temp;
            temp = temp.prox;
        }
        //não encontrou
        if (temp == null) return null;
        
        //encontrou na primeira posicao
        if (ant == null){
            Integer retira = temp.dado;
            inicio = inicio.prox;
            return retira;
        }
        //encontrou no meio ou final
        Integer retira = temp.dado;
        ant.prox = temp.prox;
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
    
    void imprimeLista(){
        
        for (Nodo temp = inicio; temp != null; temp = temp.prox)
            System.out.print(temp.dado + " -> ");
        System.out.println();
    
    }

    
}
