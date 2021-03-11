package com.rogerio.optionaldemo.repository;

import com.rogerio.optionaldemo.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    Conta findByIdPessoa(long idPessoa);
}
