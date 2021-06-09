package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Titular {
        private  DocumentoID doc;
        private  String nome;
        private LocalDate ddn;
        private  String morada;
        private  String email;
        private int telef;

        public Titular(TipoDocumento tipoDoc, String nome, LocalDate ddn, String codigoDoc, int telef) {
                this.doc = new DocumentoID(codigoDoc, tipoDoc);
                this.nome = nome;
                this.ddn = ddn;
                this.telef = telef;
        }
        public Titular (DocumentoID doc, String nome, LocalDate ddn, String morada, String email, int telef ){
                this.doc = new DocumentoID(doc);
                this.nome = nome;
                this.ddn = ddn;
                this.telef = telef;
                this.morada = morada;
                this.email= email;
        }
        public Titular (DocumentoID doc,  String nome, LocalDate ddn, String email ){
                this.doc = new DocumentoID(doc);
                this.nome = nome;
                this.ddn = ddn;
                this.email= email;
        }

        public DocumentoID getDoc() {
                return doc;
        }

        public String getNome() {
                return nome;
        }

        public LocalDate getDdn() {
                return ddn;
        }

        public String getMorada() {
                return morada;
        }

        public String getEmail() {
                return email;
        }

        public int getTelef() {
                return telef;
        }

        public void setMorada(String morada) {
                this.morada = morada;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public void setTelef(int telef) {
                this.telef = telef;
        }
}
