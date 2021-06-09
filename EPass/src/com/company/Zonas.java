package com.company;

import java.io.Serializable;

public class Zonas implements Serializable {
    private  int id;
    private String nome;
    public  Zonas (String nome){
        this.nome= nome;

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }
}
