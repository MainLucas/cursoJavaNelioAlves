package com.cursoJavaModulos.secao12Enumeracao_Composicao.BComposicao.program;

import com.cursoJavaModulos.secao12Enumeracao_Composicao.BComposicao.entities.Departamento;
import com.cursoJavaModulos.secao12Enumeracao_Composicao.BComposicao.entities.Trabalhador;
import com.cursoJavaModulos.secao12Enumeracao_Composicao.BComposicao.entities.enums.LevelTrabalhador;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Digite os dados do trabalhador: ");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Nome: ");
        String levelTrabalhador = sc.nextLine();
        System.out.println("Nome: ");
        Double salarioBase = sc.nextDouble();
        

        Trabalhador trabalhador = new Trabalhador(nome, LevelTrabalhador.valueOf(levelTrabalhador),salarioBase,new Departamento(nomeDepartamento));
    }
}
