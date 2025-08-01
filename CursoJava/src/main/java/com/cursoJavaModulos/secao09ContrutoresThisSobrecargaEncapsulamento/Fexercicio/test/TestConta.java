package com.cursoJavaModulos.secao09ContrutoresThisSobrecargaEncapsulamento.Fexercicio.test;

import com.cursoJavaModulos.secao09ContrutoresThisSobrecargaEncapsulamento.Fexercicio.dominio.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class TestConta {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double valorConta;

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite o titular da conta: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.println("Há um deposito inicial (s/n)? ");
        String opcao = sc.nextLine();

        if (opcao.equals("s")){
            System.out.println("digite o valor do deposito inicial: ");
            valorConta = sc.nextDouble();
        }
        else {
            valorConta = 0;
        }

        ContaBancaria conta = new ContaBancaria(numeroConta,nomeTitular, valorConta);

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta.toString());

        System.out.println();
        System.out.print("Digite um valor de depósito: ");
        double valorDeposito = sc.nextDouble();

        conta.depositandoValor(valorDeposito);

        System.out.println();
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta.toString());

        System.out.println();
        System.out.print("Digite um valor de saque: ");
        double valorSaque = sc.nextDouble();
        System.out.println();

        conta.sacandoValor(valorSaque);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta.toString());

    }
}
