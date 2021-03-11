package com.rogerio.optionaldemo.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PESSOA")
@Getter
public class Pessoa {

    @Id
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private long idade;

}
