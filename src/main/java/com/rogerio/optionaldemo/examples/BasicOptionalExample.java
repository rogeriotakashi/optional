package com.rogerio.optionaldemo.examples;

import com.rogerio.optionaldemo.dtos.PessoaDTO;

import java.util.Optional;

public class BasicOptionalExample {

    public static void main(String[] args) {
        String texto = "texto";
        Optional<String> textoOpt = Optional.of("texto");

        System.out.println("String sem Optional: "+ texto);
        System.out.println("String com Optional: "+ textoOpt.get());

        // Optional.empty()
        Optional<PessoaDTO> empty = Optional.empty();
        System.out.println("Empty Optional: "+ empty);

        // .of()
        PessoaDTO pessoaDTO = new PessoaDTO();
        Optional<PessoaDTO> pessoaDTOOpt = Optional.of(pessoaDTO);

        System.out.println("PessoaDTO sem Optional: "+ pessoaDTO);
        System.out.println("PessoaDTO com Optional: "+ pessoaDTOOpt);

        // ofNullable
        Optional<PessoaDTO> nullOpt = Optional.ofNullable(null);
        System.out.println("Optional com ofNullable: "+ nullOpt);

        // get() lança NoSuchElementException!
//        Optional<PessoaDTO> nullOpt2 = Optional.ofNullable(null);
//        System.out.println("null com Optional 2 : "+ nullOpt2.get());

        // Anti-Pattern
//        Optional<PessoaDTO> nullOpt3 = null;
//        System.out.println("null com Optional 3: "+ nullOpt3.get());
    }
}
