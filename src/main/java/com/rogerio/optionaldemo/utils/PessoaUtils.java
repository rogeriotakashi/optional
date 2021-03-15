package com.rogerio.optionaldemo.utils;

import com.rogerio.optionaldemo.dtos.PessoaDTO;

public class PessoaUtils {

    public static boolean isLeonardo(PessoaDTO pessoa){
        return "leonardo".equals(pessoa.getNome());
    }

    public static boolean isPessoaFisica(PessoaDTO pessoa){
        return "F".equals(pessoa.getTipoPessoa());
    }

    public static boolean isPessoaJuridica(PessoaDTO pessoa){
        return "J".equals(pessoa.getTipoPessoa());
    }
}
