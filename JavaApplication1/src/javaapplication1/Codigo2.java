/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Codigo2 {
    
    public static void main (String [] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out .println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        
        System.out .println("Digite o segundo número: ");
        int num2 = scan.nextInt();
        
        int Resultado = num1 + num2;
        System.out.println("A soma dos numeros digitados é: " + Resultado);
        
    }
} 