package com.cursoJavaModulos.secao06EstruturaRepetitiva.BestruturaFor.tests;

import java.util.Scanner;

public class Test01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

//        //incrimento
//        int x = sc.nextInt();
//        int soma = 0;
//
//        for (int i = 0; i < x; i++){
//            int valor = sc.nextInt();
//            soma += valor;
//        }
//        System.out.println(soma);

        //decremento.
        System.out.println("Digite um valor para y");
        int y = sc.nextInt();
        int somaY = 0;

        for (int j = y; j >= 0; j--){
            System.out.println("Digite um valor aleatorio para somar");
            int valor02 = sc.nextInt();
            System.out.println(j + ", " + valor02);
            somaY += valor02;
        }
    }
}
