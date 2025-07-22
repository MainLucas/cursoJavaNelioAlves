package com.cursoJavaModulos.secao05EstruturaCondicional.BestruturaCondicional.test;

import java.util.Scanner;

public class Test03 {
    public static void main (String[] args){
        //Estrutura Switch-case
        //Sem utilizar switch-case

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia = null;

        if (x == 1){
            dia = "domingo";
        }
        else if (x == 2) {
            System.out.println("Segunda");
        }
        else if (x == 3) {
            System.out.println("Terça");
        }
        else if (x == 4) {
            System.out.println("Quarta");
        }
        else if (x == 5) {
            System.out.println("Quinta");
        }
        else if (x == 6) {
            System.out.println("Sexta");
        }
        else if (x == 7) {
            System.out.println("Sábado");
        }
        else {
            dia = "Valor invalido";
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();

    }
}
