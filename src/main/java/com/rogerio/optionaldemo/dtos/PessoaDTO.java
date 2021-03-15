package com.rogerio.optionaldemo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {

    private long id;
    private String nome;
    private long idade;
    private String tipoPessoa;
}
