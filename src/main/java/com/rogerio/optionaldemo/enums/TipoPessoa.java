package com.rogerio.optionaldemo.enums;

public enum TipoPessoa {

    FISICA(1),
    JURIDICA(2);

    private final long idTipoPessoa;

    TipoPessoa(long idTipoPessoa) {
        this.idTipoPessoa = idTipoPessoa;
    }
}
