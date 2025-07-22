package com.cursoJavaModulos.secao04EstruturaSequencial.DfuncoesMatematicas.tests;

import java.util.Locale;

public class Test02 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.abs(z);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println(B);

    }
}
