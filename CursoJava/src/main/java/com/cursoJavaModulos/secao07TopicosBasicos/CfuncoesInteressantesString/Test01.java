package com.cursoJavaModulos.secao07TopicosBasicos.CfuncoesInteressantesString;

public class Test01 {
    public static void main(String[] args){

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim(); // remove o espaço do final.
        String s04 = original.substring(5); // Começa apartir de.
        String s05 = original.substring(5,9); // Vai permanecer somente entre 5 e 9
        String s06 = original.replace("a","x"); // troca o "A" por "X"
        String s07 = original.replace("abc", "xy"); // troca também um conjunto de letras ou palavras.
        int x = original.indexOf("bc"); // encontra a posição do primeiro bc
        int y = original.lastIndexOf("bc"); //encontra a posição do ultimo bc


        System.out.println("Original: " + original + "-");
        System.out.println("toLowerCase: " + s01 + "-");
        System.out.println("trim: " + s03 + "-");
        System.out.println("toUpperCase: " + s02+ "-");
        System.out.println("substring(2): " + s04 + "-");
        System.out.println("substring(5, 9): " + s05 + "-");
        System.out.println("replace ('a', 'x'): " + s06 + "-");
        System.out.println("replace ('abc', 'xy'): " + s06 + "-");
        System.out.println("index of 'bc': " + x);
        System.out.println("lastIndex of 'bc': " + y);
    }
}
