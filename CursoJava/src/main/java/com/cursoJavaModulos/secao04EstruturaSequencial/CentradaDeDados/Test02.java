package com.cursoJavaModulos.secao04EstruturaSequencial.CentradaDeDados;

import java.util.Scanner;

public class Test02 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); //utilizado para não quebrar a linha antes da hora quando se tem um int ou qualquer outro tipo proximo de NextLine;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
