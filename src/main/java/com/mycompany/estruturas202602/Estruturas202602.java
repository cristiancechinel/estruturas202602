/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturas202602;

/**
 *
 * @author cechinel
 */
public class Estruturas202602 {

    public static int SomaDigitos(int n){
    
        if (n / 10 == 0)
            return n;
        else
            return n %10 + SomaDigitos(n / 10);
    
    }
    
    
    public static void main(String[] args) {
        System.out.println(SomaDigitos(582));
    }
}
