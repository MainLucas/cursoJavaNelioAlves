package com.cursoJavaModulos.secao05EstruturaCondicional.BestruturaCondicional.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){
/*

        Fazer um programa para ler um número inteiro,
        e depois dizer se este número é impar ou par.

*/
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("\nExercicio 01");

        System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é impar ou par.");

        System.out.println("Digite um número: ");

        a = sc.nextInt();

        double resultado = a % 2;
        if (resultado != 0){
            System.out.println("Impar");
        }
        else {
            System.out.println("Par");
        }





    }
}
