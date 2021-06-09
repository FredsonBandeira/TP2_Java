package com.company;

import java.util.ArrayList;

public class EpassStudent extends EpassStandard{
    private int ano;
    private String escola;
    private ArrayList<Zonas> zonas;
    private int viagemfree;

    public EpasStudent(int ano, String escola){
        this.ano= ano;
        this.escola= escola;
    }
    //correção
    public EpassStudent(EpassStudent outro){
        this.outro= outro;
    }
    public int getAno() {
        return ano;
    }

    public ArrayList<Zonas> getZonas() {
        return zonas;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
