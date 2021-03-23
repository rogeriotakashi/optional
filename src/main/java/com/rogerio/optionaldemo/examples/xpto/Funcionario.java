package com.rogerio.optionaldemo.examples.xpto;

import lombok.Data;

import java.io.Serializable;
import java.util.Optional;

@Data
public class Funcionario implements Serializable {

    private String nome;
    private String cpf;
    private Optional<String> telefone;
    private Optional<CNH> cnh;

    public Funcionario(String nome, String cpf, Optional<String> telefone, Optional<CNH> cnh) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Optional<String> getTelefone() {
        return telefone;
    }

    public Optional<CNH> getCnh() {
        return cnh;
    }

    public void setTelefone(Optional<String> telefone) {
        this.telefone = telefone;
    }

    public void setCnh(Optional<CNH> cnh) {
        this.cnh = cnh;
    }
}
