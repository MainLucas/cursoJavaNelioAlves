package com.cursoJavaModulos.secao06EstruturaRepetitiva.CestruturaDoWhile.test;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c = 1;
        String opcaoUsuario = null;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();
            double formulaC = 9 * c / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", formulaC);
            System.out.print("Deseja repetir (s/n)? ");
            opcaoUsuario = sc.next();

        } while (opcaoUsuario == "n");
    }
}
