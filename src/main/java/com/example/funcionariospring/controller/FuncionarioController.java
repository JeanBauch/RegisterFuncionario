package com.example.funcionariospring.controller;

import java.util.List;

import com.example.funcionariospring.entity.Funcionario;
import com.example.funcionariospring.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService fs;

    @GetMapping("/")
    public ModelAndView getFuncionarios() {
        ModelAndView mv = new ModelAndView("funcView");
        List <Funcionario> list = fs.getFuncionario();
        mv.addObject("funcionario", list);
        return mv;
    }

    @PostMapping("/")
    public ModelAndView registerFunc(@ModelAttribute Funcionario func)
    {
        ModelAndView mv = new ModelAndView("funcView");
        boolean error = fs.addFunc(func);
        if(error)
        {
            mv.addObject("error", error);
        }
        mv.addObject("funcionario", fs.getFuncionario());
        return mv;
    }


}