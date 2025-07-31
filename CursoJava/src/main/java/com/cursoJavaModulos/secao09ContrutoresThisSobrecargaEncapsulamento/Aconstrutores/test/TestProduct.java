package com.cursoJavaModulos.secao09ContrutoresThisSobrecargaEncapsulamento.Aconstrutores.test;

import com.cursoJavaModulos.secao09ContrutoresThisSobrecargaEncapsulamento.Aconstrutores.dominio.Product;

import java.util.Locale;
import java.util.Scanner;

public class TestProduct {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        //instanciado após chamar os valores.

        Product product = new Product(name,price,quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");

        quantity = sc.nextInt();

        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");

        quantity = sc.nextInt();

        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}
