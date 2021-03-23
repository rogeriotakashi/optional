package com.rogerio.optionaldemo.controller;

import com.rogerio.optionaldemo.examples.xpto.CNH;
import com.rogerio.optionaldemo.examples.xpto.Funcionario;
import com.rogerio.optionaldemo.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class FuncionarioController {

    private final ContaService contaService;

    @GetMapping("/funcionario")
    public Funcionario find(){
        Funcionario funcionario = new Funcionario("rogerio","123456789", Optional.empty(), Optional.empty());
//        funcionario.setTelefone(Optional.of("99999-9999"));
//        funcionario.setCnh(Optional.of(new CNH()));

        return funcionario;
    }

}
