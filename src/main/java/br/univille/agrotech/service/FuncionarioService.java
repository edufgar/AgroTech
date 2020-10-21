package br.univille.agrotech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.agrotech.model.Funcionario;

@Service
public interface FuncionarioService {

    void save(Funcionario funcionario);
    void delete(Funcionario funcionario);
    List<Funcionario> getAll();
    
}