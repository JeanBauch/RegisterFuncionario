package com.example.funcionariospring.service;

import java.util.List;

import com.example.funcionariospring.entity.Funcionario;
import com.example.funcionariospring.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository fr;

    public List<Funcionario> getFuncionario() {
        return fr.findAll();
    }

    public boolean addFunc(Funcionario func)
    {
        boolean error = false;
        for(Funcionario f: fr.findAll())
        {
            if(f.getId() == 0)
            {
                if(f.getNome().equals(null))
                {
                    if(f.getCpf().equals(null))
                    {
                        if(f.getCargo().equals(null))
                        {
                            if(f.getSalario() == 0)
                            {
                                error = true;
                            }
                        }
                    }
                }
            }
        }
        if(!error)
        {
            fr.save(func);
            return false;
        } 
        return true;
    }
}