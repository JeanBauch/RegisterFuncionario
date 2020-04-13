package com.example.funcionariospring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", cpf=" + cpf + ", id=" + id + ", nome=" + nome + ", salario=" + salario
                + "]";
    }
}