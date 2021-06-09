package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Epass {
    private final int cod;
    private double saldo;
    private  double precoViagem ;
    private final LocalDateTime emissao ;
    private LocalDate DataCarrega;
    private LocalDate dataValida;
    private static int cod1;

    static {
        if(Integer.valueOf(cod1) == null)
            cod1 = 0;
    }

    public Epass(){
        this.cod= cod1 + 1;
        this.emissao = LocalDateTime.now();
        cod1++;
    }

    public Epass(double saldo, double precoViagem) {
        this.cod= cod1 +1;
        cod1++;
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.emissao = LocalDateTime.now();
    }

    public int getCod() {
        return cod;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public LocalDateTime getEmissao() {
        return emissao;
    }

    public LocalDate getDataCarrega() {
        return DataCarrega;
    }

    public LocalDate getDataValida() {
        return dataValida;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Epass{}";
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public void setDataCarrega(LocalDate dataCarrega) {
        DataCarrega = dataCarrega;
    }

    public void setDataValida(LocalDate dataValida) {
        this.dataValida = dataValida;
    }

}
