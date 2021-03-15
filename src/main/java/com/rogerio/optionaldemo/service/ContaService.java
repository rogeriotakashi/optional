package com.rogerio.optionaldemo.service;

import com.rogerio.optionaldemo.business.ContaBusiness;
import com.rogerio.optionaldemo.business.PessoaBusiness;
import com.rogerio.optionaldemo.dtos.PessoaDTO;
import com.rogerio.optionaldemo.entity.Conta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContaService {

    private final ContaBusiness contaBusiness;
    private final PessoaBusiness pessoaBusiness;

    public List<Conta> findAll() {
        return contaBusiness.findAll();
    }

    public void createContaByIdPessoa(String nome, long idade){
        PessoaDTO pessoa = pessoaBusiness.findByNomeAndIdadePreExistente(nome, idade);

        if(pessoa != null){
            Conta conta = contaBusiness.findByIdPessoa(pessoa.getId());
            if(conta == null) {
                Conta contaNova = new Conta();
                contaNova.setAgencia(1L);
                contaNova.setNumConta("1234");
                contaNova.setIdPessoa(5678L);
                contaBusiness.save(contaNova);
            }
        }
    }

}
