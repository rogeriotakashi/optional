package com.rogerio.optionaldemo.controller;

import com.rogerio.optionaldemo.business.PessoaBusiness;
import com.rogerio.optionaldemo.dtos.PessoaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaBusiness pessoaBusiness;

    @GetMapping("/")
    public List<PessoaDTO> findAll(){
        return pessoaBusiness.findAll();
    }

    @GetMapping("/pessoa")
    public PessoaDTO findById(@RequestParam(name = "id") long id){
        return pessoaBusiness.findById(id);
    }
}
