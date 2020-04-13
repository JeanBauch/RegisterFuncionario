package com.example.funcionariospring.repository;

import com.example.funcionariospring.entity.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario,  Integer> {

}