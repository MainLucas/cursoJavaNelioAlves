package com.cursoJavaModulos.secao08IntroducaoPOO.BcriandoMetodo.test;



import com.cursoJavaModulos.secao08IntroducaoPOO.BcriandoMetodo.dominio.ATriangulo;

import java.util.Locale;
import java.util.Scanner;

public class ATest {
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


        double areaX = x.area();
        double areaY = y.area();

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
