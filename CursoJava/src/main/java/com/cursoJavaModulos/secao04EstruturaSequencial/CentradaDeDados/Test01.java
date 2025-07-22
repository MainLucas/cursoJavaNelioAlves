package com.cursoJavaModulos.secao04EstruturaSequencial.CentradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Test01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        //entrada de dados String
        String x;
        System.out.println("Entrada de dados String");
        x = sc.next();
        System.out.println("Resposta: " + x);

        // entrada de dados int
        int y;
        System.out.println("\nentrada de dados int");
        y = sc.nextInt();
        System.out.println("Voce digitou: " + y);

        //entrada de dados double
        double z;
        System.out.println("\nentrada de dados double");
        z = sc.nextDouble();
        System.out.printf("Você digitou: %.2f", z);

        //entrada de dados double - Locale
        double aLocale;
        Locale.setDefault(Locale.US);
        System.out.println("\nentrada de dados double - Locale");
        aLocale = sc.nextDouble();
        System.out.printf("resultado com Locale: %.2f", aLocale);
        sc.close();
    }
}

