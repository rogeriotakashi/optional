package com.rogerio.optionaldemo.repository;

import com.rogerio.optionaldemo.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Pessoa findById(long id);

    Pessoa findByNomeAndIdade(String nome, long idade);

}
