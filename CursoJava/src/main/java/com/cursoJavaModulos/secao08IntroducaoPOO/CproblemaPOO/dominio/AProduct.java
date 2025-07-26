package com.cursoJavaModulos.secao08IntroducaoPOO.CproblemaPOO.dominio;

public class AProduct {
    public String name;
    public double price;
    public int stock;


    public void getStock(){
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f\n" , name, price, stock, totalValueinStock());
    }

    public int addTv (int x){
       stock += x;
       System.out.printf("Updated data: %s, %.2f, %d units, Total: $ %.2f\n", name, price, stock, totalValueinStock());
       return stock;
    }

    public int removeTv (int x){
        stock -= x;
        System.out.printf("Updated data: %s, %.2f, %d units, Total: $ %.2f\n", name, price, stock, totalValueinStock());
        return stock;
    }

    public double totalValueinStock(){
        return price * stock;
    }
}
