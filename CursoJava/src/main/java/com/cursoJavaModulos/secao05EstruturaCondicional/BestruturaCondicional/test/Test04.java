package com.cursoJavaModulos.secao05EstruturaCondicional.BestruturaCondicional.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args){
        //Utilizando Estrutura switch-case

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia = null;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();


    }
}
