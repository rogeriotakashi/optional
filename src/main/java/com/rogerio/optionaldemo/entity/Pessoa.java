package com.rogerio.optionaldemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PESSOA")
public class Pessoa {

    @Id
    private long id;

    private String nome;

    private long idade;

}
