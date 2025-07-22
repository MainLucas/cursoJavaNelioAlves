package com.cursoJavaModulos.secao05EstruturaCondicional.BestruturaCondicional.test;

import java.util.Scanner;

public class Test01 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("\nEu digo bom dia, boa tarde ou boa noite?");

        System.out.println("\nQue horas são?");

        hora = sc.nextInt();

        if (hora < 12 && hora >= 4){
            System.out.println("Então eu digo bom dia!");
        }
        else if (hora <19) {
            System.out.println("Então eu digo boa tarde");
        }
        else {
            System.out.println("Então eu digo boa noite");
        }

        sc.close();

    }
}
