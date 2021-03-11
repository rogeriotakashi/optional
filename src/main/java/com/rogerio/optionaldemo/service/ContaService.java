package com.rogerio.optionaldemo.service;

import com.rogerio.optionaldemo.business.ContaBusiness;
import com.rogerio.optionaldemo.business.PessoaBusiness;
import com.rogerio.optionaldemo.dtos.PessoaDTO;
import com.rogerio.optionaldemo.entity.Conta;
import com.rogerio.optionaldemo.entity.Pessoa;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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

    public void createContaByIdPessoa(long idPessoa){
        PessoaDTO pessoa = pessoaBusiness.findById(idPessoa);

        if(pessoa != null){
            Conta conta = contaBusiness.findByIdPessoa(idPessoa);
            if(conta == null) {
                Conta contaNova = new Conta();
                contaNova.setAgencia(1L);
                contaNova.setNumConta("1234");
                contaNova.setIdPessoa(idPessoa);
                contaBusiness.save(contaNova);
            }
        }
    }

}
