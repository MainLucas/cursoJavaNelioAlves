package com.cursoJavaModulos.secao12Enumeracao_Composicao.BComposicao.entities;

import com.cursoJavaModulos.secao12Enumeracao_Composicao.BComposicao.entities.enums.LevelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String name;
    private LevelTrabalhador level;
    private Double salarioBase;

    private Departamento departamento;
    private List<HorasContrato> contratos = new ArrayList<>();

    public Trabalhador(String name, LevelTrabalhador level, Double salarioBase, Departamento departamento) {
        this.name = name;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public void adicionarContrato(HorasContrato horasContrato) {
        contratos.add(horasContrato);
    }
    public void removerContrato(HorasContrato horasContrato) {
        contratos.remove(horasContrato);
    }
    public double income(int ano, int mes) {
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (HorasContrato x: contratos){
            cal.setTime(x.getData());
            int x_ano = cal.get(Calendar.YEAR);
            int x_mes = 1 + cal.get(Calendar.YEAR);
            if (ano == x_ano && mes == x_mes){
                sum += x.valorTotal();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LevelTrabalhador getLevel() {
        return level;
    }

    public void setLevel(LevelTrabalhador level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContrato> getContratos() {
        return contratos;
    }

}
