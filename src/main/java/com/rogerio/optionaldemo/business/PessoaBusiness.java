package com.rogerio.optionaldemo.business;

import com.rogerio.optionaldemo.dtos.PessoaDTO;
import com.rogerio.optionaldemo.entity.Pessoa;
import com.rogerio.optionaldemo.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PessoaBusiness {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public List<PessoaDTO> findAll() {
        List<Pessoa> pessoas = pessoaRepository.findAll();

        return pessoas.stream()
                .map(this::toPessoaDTO)
                .collect(Collectors.toList());
    }

    private PessoaDTO toPessoaDTO(Pessoa pessoa){
        return modelMapper.map(pessoa, PessoaDTO.class);
    }
}
