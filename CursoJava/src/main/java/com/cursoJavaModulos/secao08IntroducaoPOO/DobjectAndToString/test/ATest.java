package com.cursoJavaModulos.secao08IntroducaoPOO.DobjectAndToString.test;

import com.cursoJavaModulos.secao08IntroducaoPOO.DobjectAndToString.dominio.AProduct;

import java.util.Locale;
import java.util.Scanner;

public class ATest {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AProduct product  = new AProduct();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int x = sc.nextInt();
        product.addProducts(x);
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int y = sc.nextInt();
        product.removeProducts(y);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
