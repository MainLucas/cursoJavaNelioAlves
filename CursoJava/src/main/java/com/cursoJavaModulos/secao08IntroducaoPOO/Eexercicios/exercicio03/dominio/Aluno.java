package com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio03.dominio;

public class Aluno {
    public String name;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;
    public double notaFinal;
    public boolean approved;

    public double finalGrade(){
        return notaFinal = notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }
    public void approval(){
        if (notaFinal >= 60){
            approved = true;
            System.out.println("PASS");
        }
        else {
            approved = false;
            System.out.println("FAILED");
            double missing = (notaFinal - 60) * -1;

            System.out.println("MISSING " + String.format("%.2f",missing) + " POINTS");
        }

    }

}
