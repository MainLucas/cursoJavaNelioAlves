package com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio02.test;

import com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio02.dominio.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.println("Gross salary: ");
        double gross = sc.nextDouble();

        System.out.println("Tax: ");
        double tax = sc.nextDouble();


    }
}
