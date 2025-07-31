package com.cursoJavaModulos.secao99.myproject.test;

import java.util.Locale;
import java.util.Scanner;

public class MenuPrincipal {
    int opcaoMenu;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        MenuPrincipal menuPrincipal = new MenuPrincipal();

        menuPrincipal.showMenu();

    }

    public int showMenu(){

        System.out.println("========Menu Principal=======");
        System.out.println("[1] - inserir venda");
        System.out.println("[2] - historico de vendas");
        System.out.println("[3] - Em Desenvolvimento");
        System.out.println("[4] - Em Desenvolvimento");
        System.out.println("[5] - Em Desenvolvimento");
        System.out.println("[0] - Encerrar\n");

        System.out.print("Digite uma opção: ");
        return opcaoMenu = sc.nextInt();
    }

}
