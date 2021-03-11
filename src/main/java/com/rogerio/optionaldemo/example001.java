package com.rogerio.optionaldemo;

import com.rogerio.optionaldemo.dtos.PessoaDTO;

import java.util.Optional;

public class example001 {

    public static void main(String[] args) {
        String texto = "texto";
        Optional<String> textoOpt = Optional.of("texto");

        System.out.println("String sem Optional: "+ texto);
        System.out.println("String com Optional: "+ textoOpt.get());

        PessoaDTO pessoaDTO = new PessoaDTO();
        Optional<PessoaDTO> pessoaDTOOpt = Optional.of(pessoaDTO);

        System.out.println("PessoaDTO sem Optional: "+ pessoaDTO);
        System.out.println("PessoaDTO com Optional: "+ pessoaDTOOpt);

        // Optional vazio
        Optional<PessoaDTO> nullOpt = Optional.ofNullable(null);
        System.out.println("null com Optional: "+ nullOpt);

        // get() lança NoSuchElementException!
//        Optional<PessoaDTO> nullOpt2 = Optional.ofNullable(null);
//        System.out.println("null com Optional 2 : "+ nullOpt2.get());

        // Maldade no coração
//        Optional<PessoaDTO> nullOpt3 = null;
//        System.out.println("null com Optional 3: "+ nullOpt3.get());
    }
}
