package com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio02.dominio;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return 2.00;
    }
    public void increaseSalary(double percentage){

    }
    public String toString(){
        return name
                + ", $ "
                + "test";
    }
}
