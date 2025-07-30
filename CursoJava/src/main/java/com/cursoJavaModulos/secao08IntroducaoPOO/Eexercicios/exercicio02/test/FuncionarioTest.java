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
        funcionario.name = sc.nextLine();

        System.out.print("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println("Employee: " + funcionario.toString() + funcionario.netSalary());
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);
        System.out.println("Updated data: " + funcionario.toString() + funcionario.grossSalary);








    }
}
