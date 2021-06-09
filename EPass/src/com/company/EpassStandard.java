package com.company;

import java.time.LocalDate;
import java.util.Stack;

public class EpassStandard extends Epass {
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chaveValida;
    private String chave;

    public String getChave() {
        return chave;
    }

    public EpassStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email ){
       super(codigoDoc,tipoDoc, ddn,nome,email);

    }
    public EpassStandard(DocumentoID doc, String nome, LocalDate ddn, String morada, String email, int telef){
           super(doc, nome, ddn,email, nome, morada, telef)
    }
    //por completar
    public EpassStandard(EpassStandard pass){
    }

    public Titular getTitular() {
        return titular;
    }

    public int getPontos() {
        return pontos;
    }

    public String getChaveValida() {
        return chaveValida;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
    // falta o setnome
}
