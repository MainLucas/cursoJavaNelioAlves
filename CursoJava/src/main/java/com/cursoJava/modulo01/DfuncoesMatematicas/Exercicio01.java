package com.cursoJava.modulo01.DfuncoesMatematicas;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //exercicio 01;
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        int a,b,c;

        System.out.println("Digite um número: ");
        a = sc.nextInt();
        System.out.println("Digite outro número: ");
        b = sc.nextInt();
        c =  a + b;
        System.out.println("A soma é: " + c);

        System.out.println("Digite um número: ");
        a = sc.nextInt();
        System.out.println("Digite outro número: ");
        b = sc.nextInt();
        System.out.println("A soma é: " + c);
    }
}
