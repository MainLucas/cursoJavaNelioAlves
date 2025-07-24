package com.cursoJavaModulos.secao06EstruturaRepetitiva.AestruturaWhile.tests;

import java.util.Scanner;

public class Test01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0){

            soma += x;
            System.out.println("Digite novamente: ");
            x = sc.nextInt();

        }
        System.out.printf("O valor de x é: %d", soma);
        sc.close();
    }
}
