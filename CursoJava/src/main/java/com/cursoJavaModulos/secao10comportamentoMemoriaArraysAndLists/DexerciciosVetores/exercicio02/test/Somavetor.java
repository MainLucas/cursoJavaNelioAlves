package com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.DexerciciosVetores.exercicio02.test;

import java.util.Locale;
import java.util.Scanner;

public class Somavetor {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double sum = 0;

        System.out.print("VALORES: ");
        for (int i = 0; i < n; i++){
            System.out.print(vet[i] + " ");
            sum += vet[i];
        }
        System.out.println();
        System.out.println("SOMA = " + sum);
        System.out.println("MEDIA = " + sum / n);
    }
}
