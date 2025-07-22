package com.cursoJava.modulo01.DfuncoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[] args) {

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio, areaCirculo;

        System.out.println("Vamos descobrir o valor da área deste círculo ");
        System.out.println("Digite o valor do raio: ");

        raio = sc.nextDouble();

        areaCirculo = 3.14159 * Math.pow(raio, 2);

        System.out.printf("O valor da area é: %.4f", areaCirculo);

    }
}
