package com.company;

import java.io.Serializable;
import java.util.Objects;

public class DocumentoID  implements Serializable {
    private final String codigo ;
    private final TipoDocumento tipo;

    public String getCodigo() {
        return codigo;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public DocumentoID(String codigo, TipoDocumento tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }
    public  DocumentoID( DocumentoID doc){
        this.codigo = doc.codigo;
        this.tipo = doc.tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentoID that = (DocumentoID) o;
        return Objects.equals(codigo, that.codigo) && tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }
}
