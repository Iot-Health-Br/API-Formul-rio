package com.SpringAPIFormulario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")
public class User {

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    // Nome do usuário
    @Column(nullable = false)
    private String nome="";

    // CPF do usuário
    @Column(nullable = false)
    private String cpf="";

        
    // Construtor padrão (sem argumentos)
    public User() {
    }

    //Constructor
    public User(Long id, String nome, String cpf) {
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

    @Override
    public String toString() {
        return "User [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
    }
}
