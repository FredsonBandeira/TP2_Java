package com.company;

public class EpassFestival extends EpassSazonal{
        private Double saldoCartaoPgmt;
        private String nomeEvento;


        public EpassFestival(Double saldoCartaoPgmt, String nomeEvento){
            this.nomeEvento= nomeEvento;
            this.saldoCartaoPgmt = saldoCartaoPgmt;
        }
    public EpassFestival(String nomeEvento){
            this.nomeEvento =nomeEvento;
    }

    public Double getSaldoCartaoPgmt() {
        return saldoCartaoPgmt;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setSaldoCartaoPgmt(Double saldoCartaoPgmt) {
        this.saldoCartaoPgmt = saldoCartaoPgmt;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}
