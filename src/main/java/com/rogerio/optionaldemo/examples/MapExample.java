package com.rogerio.optionaldemo.examples;


import com.rogerio.optionaldemo.dtos.PessoaDTO;
import java.util.Optional;

public class MapExample {

    public static void main(String[] args) {

        Optional<PessoaDTO> pessoaOpt = Optional.of(new PessoaDTO(1L, "rogerio", 25, "F"));
        System.out.println(pessoaOpt);

        PessoaDTO pessoaDTO = pessoaOpt.get();

        // Nome da pessoa em UpperCase
        String nomeUppercase = pessoaDTO.getNome().toUpperCase();
        System.out.println(nomeUppercase);

        // Nome da pessoal em Uppercase e caso seja nulo, quero que venha um "Valor Default"
//        if (pessoaDTO.getNome() != null){
//            nomeUppercase = pessoaDTO.getNome().toUpperCase();
//        } else {
//            nomeUppercase = "Valor Default";
//        }
//        System.out.println(nomeUppercase);
    }
}
