package com.company;

import java.time.LocalDateTime;

public class EpassTerIdade extends EpassStandard{
    private LocalDateTime horaIni;

    public void setHoraIni(LocalDateTime horaIni) {
        this.horaIni = horaIni;
    }

    public LocalDateTime getHoraIni() {
        return horaIni;
    }
}
