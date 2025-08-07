package com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.HexerciciosListas.exercicio01.test;

import com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.HexerciciosListas.exercicio01.dominio.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test01 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();


        List<Funcionario> funcionarioList = new ArrayList<>();
        Funcionario funcionario;

        for (int i = 0; i < n; i++){
            System.out.println("\nFuncionario #" + (i+1));
            System.out.print("id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            funcionario = new Funcionario(id,name,salario);
            funcionarioList.add(i, funcionario);

        }
        System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
        int id = sc.nextInt();
        System.out.print("informe a porcentagem: ");
        double porcentagem = sc.nextDouble();

        double result = funcionarioList.get(id).getSalario() ;




    }
}
