package com.rogerio.optionaldemo.service;

import com.rogerio.optionaldemo.business.PessoaBusiness;
import com.rogerio.optionaldemo.dtos.PessoaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaBusiness pessoaBusiness;

    public List<PessoaDTO> findAll() {
        return pessoaBusiness.findAll();
    }

    public PessoaDTO findById(long id) {
        return pessoaBusiness.findById(id);
    }

    public PessoaDTO findByNomeAndIdade(String nome, long idade) {
        return pessoaBusiness.findByNomeAndIdade(nome,idade);
    }

}
