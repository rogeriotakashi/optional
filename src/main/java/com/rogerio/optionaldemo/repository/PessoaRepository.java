package com.rogerio.optionaldemo.repository;

import com.rogerio.optionaldemo.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Optional<Pessoa> findById(long id);

    Optional<Pessoa> findByNomeAndIdade(String nome, long idade);

}
