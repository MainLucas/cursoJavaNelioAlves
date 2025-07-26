package com.cursoJavaModulos.secao08IntroducaoPOO.CproblemaPOO.test;

import com.cursoJavaModulos.secao08IntroducaoPOO.CproblemaPOO.dominio.AProduct;

import java.util.Locale;
import java.util.Scanner;

public class ATest {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AProduct product = new AProduct();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.next();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.stock = sc.nextInt();

        product.getStock();

        System.out.print("Enter the number of products to be added from stock: ");
        int x = sc.nextInt();
        product.addTv(x);

        System.out.print("Enter the number of products to be removed from stock: ");
        int y = sc.nextInt();
        product.removeTv(y);

        sc.close();
    }
}
