package com.cursoJavaModulos.secao08IntroducaoPOO.Gexercicio.test;

import com.cursoJavaModulos.secao08IntroducaoPOO.Gexercicio.dominio.CurrencyConverter;
import com.cursoJavaModulos.secao08IntroducaoPOO.Gexercicio.dominio.Dollar;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Dollar dollar = new Dollar();

        System.out.print("What is the dollar price? ");
        dollar.valor = sc.nextDouble();

        System.out.print("How Many dollars will be bought? ");
        double quantidadeDollarConverter = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f",  CurrencyConverter.converter(quantidadeDollarConverter,dollar.valor));

    }
}
