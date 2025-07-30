package com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio02.dominio;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        grossSalary += percentage/100 * grossSalary;

    }
    public String toString(){
        return name
                + ", $ ";
    }
}
