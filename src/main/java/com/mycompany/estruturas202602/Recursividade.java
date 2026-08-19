package com.mycompany.estruturas202602;

public class Recursividade {
   
    public static int potencia(int b, int e){
    
        if (e == 0)
            return 1;
        else 
            return b * potencia(b, e-1);
    
    
    
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
        
        //imprimeCrescente(10);
        
        System.out.println(potencia(3, 4));
    
    }
    
}
