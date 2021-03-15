package com.rogerio.optionaldemo.examples;


import com.rogerio.optionaldemo.dtos.PessoaDTO;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterExample {

    public static void main(String[] args) {

        List<PessoaDTO> pessoaDTOS = Arrays.asList(
                new PessoaDTO(1L, "rogerio", 25, "F"),
                new PessoaDTO(2L, "bruno", 22, "F"),
                new PessoaDTO(3L, "pedro", 19, "F"),
                new PessoaDTO(4L, "leonardo", 40, "J")
        );

        pessoaDTOS.forEach(System.out::println);

        // Lets filter leonardo
        Optional<PessoaDTO> pessoaDTO = pessoaDTOS.stream()
                                                    .filter(pessoa -> pessoa.getNome().equals("leonardo"))
                                                    .findAny();

        // Poderia usar o PessoaUtils
        boolean isPessoaFisica = pessoaDTO.filter(pessoa -> pessoa.getTipoPessoa().equals("F")).isPresent();
        boolean isPessoaJuridica = pessoaDTO.filter(pessoa -> pessoa.getTipoPessoa().equals("J")).isPresent();

        System.out.println("-------- Filtros --------");
        System.out.println(pessoaDTO);
        System.out.println("Is Pessoa Fisica: "+ isPessoaFisica);
        System.out.println("Is Pessoa Juridica: "+ isPessoaJuridica);

    }
}
