package com.cursoJavaModulos.secao09ContrutoresThisSobrecargaEncapsulamento.Fexercicio.dominio;

public class ContaBancaria {
    private  int numeroConta;
    private  String nomeTitular;
    private  double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double valorInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = valorInicial;
    }

    public String toString(){
        return "Conta: "
                + numeroConta
                + ", Títular: "
                + nomeTitular
                + ", Saldo: R$"
                + String.format("%.2f",saldo);
    }

    public void depositandoValor(double valorDepositado){
        saldo += valorDepositado;

    }
    public void sacandoValor(double valorSaque){
        saldo = saldo - valorSaque - 5;
    }

    public int getNumeroConta() {
        return numeroConta;

    }

    public String getNomeTitular() {
        return nomeTitular;

    }

    public double getValorInicial() {
        return saldo;

    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;

    }

    public void setValorInicial(double valorInicial) {
        this.saldo = valorInicial;

    }
}
