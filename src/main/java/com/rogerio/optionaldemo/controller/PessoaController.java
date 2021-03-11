package com.rogerio.optionaldemo.controller;

import com.rogerio.optionaldemo.dtos.PessoaDTO;
import com.rogerio.optionaldemo.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;

    @GetMapping("/")
    public List<PessoaDTO> findAll(){
        return pessoaService.findAll();
    }

    @GetMapping("/pessoa")
    public PessoaDTO searchById(@RequestParam(name = "id") long id){
        return pessoaService.findById(id);
    }

    @GetMapping("/pessoa-upppercase")
    public PessoaDTO searchByNameUpppercase(@RequestParam(name = "nome") String nome, @RequestParam(name = "idade") long idade){
        return pessoaService.findByNomeAndIdade(nome, idade);
    }
}
