package com.cursoJavaModulos.secao08IntroducaoPOO.AcriandoClasse.test;

import com.cursoJavaModulos.secao08IntroducaoPOO.AcriandoClasse.dominio.ATriangulo;

import java.util.Locale;
import java.util.Scanner;

public class ATest01 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ATriangulo x = new ATriangulo();
        ATriangulo y = new ATriangulo();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.b = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p *(p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p *(p - y.a) * (p - y.b) * (p - y.c));

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
