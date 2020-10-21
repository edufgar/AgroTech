package br.univille.agrotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.agrotech.model.Funcionario;
import br.univille.agrotech.service.FuncionarioService;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping("")
    public ModelAndView index(){
        List<Funcionario> listaFuncionarios = service.getAll();
        return new ModelAndView("funcionario/index","listafuncionarios",listaFuncionarios);
    }

    @GetMapping("/novo")
    public ModelAndView novo(@ModelAttribute Funcionario funcionario){
        return new ModelAndView("funcionario/form");
    }

    @PostMapping(params = "form")
    public ModelAndView save(Funcionario funcionario){
        service.save(funcionario);;
        return new ModelAndView("redirect:/funcionario");
    }

    @GetMapping(value = "/alterar/{id}")
    public ModelAndView edit(@PathVariable("id") Funcionario funcionario){
        return new ModelAndView("funcionario/form","funcionario",funcionario);
    }

    @GetMapping(value = "/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Funcionario funcionario){
        service.delete(funcionario);
        return new ModelAndView("redirect:/funcionario");
    }
    
}