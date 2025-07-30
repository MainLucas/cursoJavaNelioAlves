package com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio03.test;

import com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio03.dominio.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("name: ");
        aluno.name = sc.nextLine();
        System.out.print("Nota do Primeiro Trimestre: ");
        aluno.notaPrimeiroTrimestre = sc.nextDouble();
        System.out.print("Nota do Segundo Trimestre: ");
        aluno.notaSegundoTrimestre = sc.nextDouble();
        System.out.print("Nota do Terceiro Trimestre: ");
        aluno.notaTerceiroTrimestre = sc.nextDouble();

        System.out.println("Final Grade = " + aluno.finalGrade());
        aluno.approval();
    }
}
