package com.cursoJavaModulos.secao07topicosBasicos.DsintaxeFuncoes;

public class Test01 {
    public static void main(String[] args){

        int higher = max(1,15,7);

        printHigher(higher);
    }

    public static int max(int a, int b, int c){
        int maiorValor;
        if (a > b && a > c){
            maiorValor = a;
        }
        else if (b > a && b > c) {
            maiorValor = b;
        }
        else {
            maiorValor = c;
        }
        return maiorValor;
    }
    public static void printHigher(int x){
        System.out.println("Maior valor é: " + x);
    }
}
