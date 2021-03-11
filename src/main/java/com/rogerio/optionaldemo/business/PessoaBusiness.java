package com.rogerio.optionaldemo.business;

import com.rogerio.optionaldemo.dtos.PessoaDTO;
import com.rogerio.optionaldemo.entity.Pessoa;
import com.rogerio.optionaldemo.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class PessoaBusiness {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public List<PessoaDTO> findAll() {
        List<Pessoa> pessoas = pessoaRepository.findAll();

        return pessoas.stream()
                .map(this::toPessoaDTO)
                .collect(toList());
    }

    public PessoaDTO findById(long id) {
        Pessoa pessoa = pessoaRepository.findById(id);

        if (pessoa == null) {
            pessoa = createPessoaDefault();
        }

        return toPessoaDTO(pessoa);
    }

    public String findByNomeAndIdade(String nome, long idade) {
        Pessoa pessoa = pessoaRepository.findByNomeAndIdade(nome, idade);

        if (pessoa == null) {
            throw new NoSuchElementException();
        }

        return pessoa.getNome().toUpperCase();
    }

    private Pessoa createPessoaDefault() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nome Default");
        pessoa.setIdade(20L);
        pessoa.setTipoPessoa(1L);

        return pessoaRepository.save(pessoa);
    }

    private PessoaDTO toPessoaDTO(Pessoa pessoa){
        return modelMapper.map(pessoa, PessoaDTO.class);
    }
}
