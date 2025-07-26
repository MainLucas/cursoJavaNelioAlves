package com.cursoJavaModulos.secao07TopicosBasicos.CfuncoesInteressantesString;

public class Test02 {
    public static void main(String[] args){
        String s = "Potato Apple lemon";
        String[] vectores = s.split(" ");

        System.out.println(vectores[0]);
        System.out.println(vectores[1]);
        System.out.println(vectores[2]);
    }
}
