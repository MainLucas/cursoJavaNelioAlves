package com.cursoJavaModulos.secao08IntroducaoPOO.FmembrosEstaticos.test;

import com.cursoJavaModulos.secao08IntroducaoPOO.FmembrosEstaticos.dominio.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class TestCalculator {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        System.out.println("Enter radius");

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI value: %.5f%n", Calculator.PI);
    }
}
