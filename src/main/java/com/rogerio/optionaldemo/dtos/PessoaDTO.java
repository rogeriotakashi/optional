package com.rogerio.optionaldemo.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class PessoaDTO {

    private long id;
    private String nome;
    private long idade;
    private String tipoPessoa;
}
