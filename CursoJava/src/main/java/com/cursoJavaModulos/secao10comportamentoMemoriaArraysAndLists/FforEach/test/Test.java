package com.cursoJavaModulos.secao10comportamentoMemoriaArraysAndLists.FforEach.test;

public class Test {

    public static void main(String[] args){

        String[] vet = new String[] {"Maria","Bob","Alex"};

        for (int i = 0; i < vet.length; i++){
            System.out.println(vet[i]);
        }

        for (String obj : vet){
            System.out.println(obj);
        }
    }
}
