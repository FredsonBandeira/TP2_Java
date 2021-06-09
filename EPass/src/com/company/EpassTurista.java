package com.company;

import java.io.Serializable;

public class EpassTurista implements Serializable {
        private Duracao duracao;

        public EpassTurista(Duracao duracao){
            this.duracao= duracao;
        }

        //correcao
    public EpassTurista(EpassTurista outro){
        this.outro= outro;
    }
}
