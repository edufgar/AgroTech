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

import br.univille.agrotech.model.Fornecedor;
import br.univille.agrotech.service.FornecedorService;

@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService service;

    @GetMapping("")
    public ModelAndView index(){
        List<Fornecedor> listaFornecedores = service.getAll();
        return new ModelAndView("fornecedor/index","listafornecedores",listaFornecedores);
    }

    @GetMapping("/novo")
    public ModelAndView novo(@ModelAttribute Fornecedor fornecedor){
        return new ModelAndView("fornecedor/form");
    }

    @PostMapping(params = "form")
    public ModelAndView save(Fornecedor fornecedor){
        service.save(fornecedor);;
        return new ModelAndView("redirect:/fornecedor");
    }

    @GetMapping(value = "/alterar/{id}")
    public ModelAndView edit(@PathVariable("id") Fornecedor fornecedor){
        return new ModelAndView("fornecedor/form","fornecedor",fornecedor);
    }

    @GetMapping(value = "/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Fornecedor fornecedor){
        service.delete(fornecedor);
        return new ModelAndView("redirect:/fornecedor");
    }
    
}