package com.mycompany.estruturas202602;

public class Recursividade {
   
    public static int potencia(int b, int e){
    
    
    
    
    
    }
    
    
    
    public static void imprimeCrescente(int n){
                
        if (n == 1) 
            System.out.println(n);
        else{
            imprimeCrescente(n-1);
            System.out.println(n);
        }
       
    }
   
    
    public static void imprimeDecrescente(int n){
    
        if (n == 1) 
            System.out.println(n);
        else {
            System.out.println(n);
            imprimeDecrescente(n-1);
        
        }
    }

   
    public static void main(String[] args){
        
        imprimeCrescente(10);
    
    }
    
}
