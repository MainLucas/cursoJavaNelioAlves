package com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.DexerciciosVetores.exercicio01.test;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.Scanner;

public class NegativosTest01 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Números negativos");
        for (int i = 0; i < n; i++){
            int x = vect[i];
            if (x < 0)
                System.out.println(x);
        }
    }
}
