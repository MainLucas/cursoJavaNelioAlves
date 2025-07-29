package com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio01.test;

import com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio01.dominio.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Test01 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("AREA = " + String.format("%.2f", retangulo.area(x,y)));
        System.out.println("PERIMETER = " + String.format("%.2f", retangulo.perimeter(x,y)));
        System.out.println("AREA = " + String.format("%.2f", retangulo.diagonal(x,y)));

    }
}
