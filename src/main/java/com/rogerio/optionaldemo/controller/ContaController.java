package com.rogerio.optionaldemo.controller;

import com.rogerio.optionaldemo.entity.Conta;
import com.rogerio.optionaldemo.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ContaController {

    private final ContaService contaService;

    @GetMapping("/conta/new")
    public void createConta(@RequestParam(name = "nome") String nome, @RequestParam(name = "idade") long idade){
        contaService.createContaByIdPessoa(nome, idade);
    }

    @GetMapping("/conta")
    public List<Conta> findAll(){
        return contaService.findAll();
    }

}
