package com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.Cvetores.test;

import com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.Cvetores.dominio.ProductTest02;

import java.util.Locale;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos, para realizar a soma da média: ");
        int n = sc.nextInt();
        ProductTest02 vect[] = new ProductTest02[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Nome do produto: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new ProductTest02(name, price);
            System.out.println("Produto cadastrado: ");
        }
        double soma = 0;

        for (int i = 0; i < vect.length; i++){
            soma += vect[i].getPrice();
        }
        double media = soma / vect.length;

        System.out.printf("A média é: %.2f", media);

        sc.close();
    }
}
