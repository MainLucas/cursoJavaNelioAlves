package com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.Glistas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    public static void main (String[] args){

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());
        for (String x: list){
            System.out.println(x);
        }
        System.out.println("---------------------------------------");

        list.remove(1);
        list.remove("Alex");

        //remover um elemento por predicado
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x: list){
            System.out.println(x);
        }

        //encontrar a posição de um elemento.
        System.out.println("---------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        //filtrar na lista apenas aqueles que começam com a Letra A
        System.out.println("---------------------------------------");
        List<String> result = list.stream().filter(y -> y.charAt(0) == 'A').collect(Collectors.toList());

        for (String x: result){
            System.out.println(x);
        }

        //Encontrar o primeiro elemento que começar com determinada letra/ se não encontrar retorna null
        System.out.println("---------------------------------------");
        System.out.println("Encontrar o primeiro elemento que vir com a letra J, se não encontrar retorna null");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }

}
