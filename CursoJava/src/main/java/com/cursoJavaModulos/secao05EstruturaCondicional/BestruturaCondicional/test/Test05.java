package com.cursoJavaModulos.secao05EstruturaCondicional.BestruturaCondicional.test;

import java.util.Scanner;

public class Test05 {
    public static void main (String[] args){
        //Operador ternário

        //Exemplo sem utilizar.

        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto;
        double desconto02;

        if (preco < 20.0){
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.05;
        }
        System.out.println(desconto);
        sc.close();

        //utilizando operador ternário
        desconto02 = (preco < 20) ? preco * 0.1 : preco * 0.05;
    }

}
