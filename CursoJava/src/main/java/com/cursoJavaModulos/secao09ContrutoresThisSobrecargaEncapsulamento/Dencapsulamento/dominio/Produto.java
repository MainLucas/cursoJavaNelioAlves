package com.cursoJavaModulos.secao09ContrutoresThisSobrecargaEncapsulamento.Dencapsulamento.dominio;


public class Produto {

    private String name;
    private double price;
    private int quantity;

    public Produto(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
