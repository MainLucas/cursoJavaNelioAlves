package com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.DexerciciosVetores.exercicio03.test;

import com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.DexerciciosVetores.exercicio03.dominio.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class AlturasTest {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas serão digitadas? ");
        int nroPessoasDigitadas = sc.nextInt();

        Pessoas[] vetPessoas = new Pessoas[nroPessoasDigitadas];

        double sum = 0;

        for (int i = 0; i < nroPessoasDigitadas; i++){
            System.out.println("Dados da " + (i+1) + " Pessoa");
            System.out.print("nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.println();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            vetPessoas[i].setNome(name);
            vetPessoas[i].setIdade(idade);
            vetPessoas[i].setAltura(altura);

            sum += vetPessoas[i].getAltura();
        }
        System.out.println("Altura Média: " + sum / 3);
    }
}
