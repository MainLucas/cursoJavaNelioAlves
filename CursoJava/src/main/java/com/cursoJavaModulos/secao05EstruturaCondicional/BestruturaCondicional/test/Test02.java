package com.cursoJavaModulos.secao05EstruturaCondicional.BestruturaCondicional.test;

import java.util.Locale;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Operadores de atribuição cumulativa.

        //Exemplo sem atribuição cumulativa.

        int minutos = sc.nextInt();

        double conta = 50.0;

        if (conta > 100){
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.printf("O valor da conta = R$ %.2f%n", conta);

        // Exemplo com atribuição cumulativa

        int minutos02 = sc.nextInt();

        double conta02 = 50.0;

        if (conta02 > 100){
            conta02 += (minutos02 - 100) * 2.0; //atribuição cumulativa utilizada
        }

        System.out.printf("O valor da conta02 = R$ %.2f%n", conta);

        sc.close();
    }
}
