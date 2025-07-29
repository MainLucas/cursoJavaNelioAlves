package com.cursoJavaModulos.secao08IntroducaoPOO.Eexercicios.exercicio01.dominio;

public class Retangulo {
    public double width;
    public double height;

    public double area(double width, double height){
        return width * height;
    }

    public double perimeter(double width, double height){
        return 2* (width + height);
    }
    public double diagonal(double width, double height){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height,2));

    }
}
