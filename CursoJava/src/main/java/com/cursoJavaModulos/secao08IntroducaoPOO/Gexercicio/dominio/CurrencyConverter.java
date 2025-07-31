package com.cursoJavaModulos.secao08IntroducaoPOO.Gexercicio.dominio;

public class CurrencyConverter {
    public static final double IOF = 0.06;


    public static double converter(double quantidadeDollar, double dollaValor){
        double x = (quantidadeDollar * dollaValor);
        return x * IOF + x;
    }
}
