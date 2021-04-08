package com.rogerio.optionaldemo.examples.xpto;

import lombok.Data;

import java.io.Serializable;
import java.util.Optional;

@Data
public class Funcionario implements Serializable {

    private String nome;
    private String cpf;
    private String telefone;
    private CNH cnh;

    public Funcionario(String nome, String cpf, String telefone, CNH cnh) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public Optional<String> getTelefone() {
        return Optional.ofNullable(telefone);
    }

    public Optional<CNH> getCnh() {
        return Optional.ofNullable(cnh);
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCnh(CNH cnh) {
        this.cnh = cnh;
    }
}
