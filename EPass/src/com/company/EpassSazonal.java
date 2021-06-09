package com.company;

public class EpassSazonal extends EpassStandard {
    private String chaveValida;


    public EpassSazonal(){

    }

    @Override
    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }

    @Override
    public String getChaveValida() {
        return chaveValida;
    }
}
