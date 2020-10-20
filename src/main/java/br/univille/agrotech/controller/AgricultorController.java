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

import br.univille.agrotech.model.Agricultor;
import br.univille.agrotech.service.AgricultorService;

@Controller
@RequestMapping("/agricultor")
public class AgricultorController {

    @Autowired
    private AgricultorService service;

    @GetMapping("")
    public ModelAndView index(){
        List<Agricultor> listaAgricultores = service.getAll();
        return new ModelAndView("agricultor/index","listaagricultores",listaAgricultores);
    }

    @GetMapping("/novo")
    public ModelAndView novo(@ModelAttribute Agricultor agricultor){
        return new ModelAndView("agricultor/form");
    }

    @PostMapping(params = "form")
    public ModelAndView save(Agricultor agricultor){
        service.save(agricultor);;
        return new ModelAndView("redirect:/agricultor");
    }

    @GetMapping(value = "/alterar/{id}")
    public ModelAndView edit(@PathVariable("id") Agricultor agricultor){
        return new ModelAndView("agricultor/form","agricultor",agricultor);
    }

    @GetMapping(value = "/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Agricultor agricultor){
        service.delete(agricultor);
        return new ModelAndView("redirect:/agricultor");
    }
    
}