package com.company;

import java.io.Serializable;
import java.time.LocalDate;

public class Ticket implements Serializable {
    private String nome;
    private int numero;
    private LocalDate data;


    public Ticket(String nome, int numero, LocalDate data){
        this.data= data;
        this.nome= nome;
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
