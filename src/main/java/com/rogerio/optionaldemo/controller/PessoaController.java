package com.rogerio.optionaldemo.controller;

import com.rogerio.optionaldemo.business.PessoaBusiness;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaBusiness pessoaBusiness;

    @GetMapping("/pessoa")
    public void buscarPessoa(){

    }
}
