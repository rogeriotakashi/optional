package com.rogerio.optionaldemo.business;

import com.rogerio.optionaldemo.entity.Conta;
import com.rogerio.optionaldemo.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContaBusiness {

    private final ContaRepository contaRepository;

    public List<Conta> findAll() {
        return contaRepository.findAll();
    }

    public Conta findByIdPessoa(long idPessoa) {
        return contaRepository.findByIdPessoa(idPessoa);
    }

    public void save(Conta contaNova) {
        contaRepository.save(contaNova);
    }

}
