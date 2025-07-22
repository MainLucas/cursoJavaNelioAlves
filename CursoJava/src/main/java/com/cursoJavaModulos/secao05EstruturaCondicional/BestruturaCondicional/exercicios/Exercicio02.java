package com.cursoJavaModulos.secao05EstruturaCondicional.BestruturaCondicional.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args){
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número
        é negativo ou não.
        */
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("\nFazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");

        System.out.println("Digite um número: ");

        a = sc.nextInt();

        if (a < 0){
            System.out.println("é Negativo.");
        }
        else {
            System.out.println("é Positivo.");
        }

    }
}
