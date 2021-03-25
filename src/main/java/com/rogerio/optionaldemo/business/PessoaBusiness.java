package com.rogerio.optionaldemo.business;

import com.rogerio.optionaldemo.dtos.PessoaDTO;
import com.rogerio.optionaldemo.entity.Pessoa;
import com.rogerio.optionaldemo.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static java.util.stream.Collectors.toList;


@Service
@RequiredArgsConstructor
public class PessoaBusiness {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public List<PessoaDTO> findAll() {
        List<Pessoa> pessoaList = pessoaRepository.findAll();

        return pessoaList.stream()
                .map(this::toPessoaDTO)
                .collect(toList());
    }

    /**
     *  Fluxo não pode continuar caso não encontre a pessoa!
     */
    public PessoaDTO findById(long id) {
        Optional<Pessoa> pessoaOpt = pessoaRepository.findById(id);
        Pessoa pessoa = pessoaOpt.orElseThrow(NoSuchElementException::new);
        return toPessoaDTO(pessoa);
    }
    /**
     *  Fluxo pode continuar caso não encontre a pessoa! Gera um novo registro pessoa
     */
    public PessoaDTO findByNomeAndIdade(String nome, long idade) {
        Optional<Pessoa> pessoaOpt = pessoaRepository.findByNomeAndIdade(nome, idade);
        Pessoa pessoa = pessoaOpt.orElseGet(() -> createPessoaDefault(nome, idade));

        return toPessoaDTO(pessoa);
    }

    /**
     *  Fluxo pode continuar caso não encontre a pessoa! retorna nulo
     */
    public PessoaDTO findByNomeAndIdadePreExistente(String nome, long idade) {
        Optional<Pessoa> pessoaOpt = pessoaRepository.findByNomeAndIdade(nome, idade);
        return pessoaOpt
                .map(this::toPessoaDTO)
                .orElse(null);

    }

    private Pessoa createPessoaDefault(String nome, Long idade) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setTipoPessoa(1L);

        return pessoaRepository.save(pessoa);
    }

    private PessoaDTO toPessoaDTO(Pessoa pessoa){
        return modelMapper.map(pessoa, PessoaDTO.class);
    }

}
