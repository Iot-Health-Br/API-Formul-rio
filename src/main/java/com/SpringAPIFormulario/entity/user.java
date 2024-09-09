package com.SpringAPIFormulario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class user {

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private String nome="";
    private String cpf="";

    //Constructor
    public user(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Get and Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //To String
    @Override
    public String toString() {
        return "user [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
    }
}
