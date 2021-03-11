package com.rogerio.optionaldemo.dtos;

import lombok.Data;


@Data
public class PessoaDTO {

    private long id;
    private String nome;
    private long idade;
    private String tipoPessoa;
}
