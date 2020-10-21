package br.univille.agrotech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.agrotech.model.Funcionario;
import br.univille.agrotech.repository.FuncionarioRepository;
import br.univille.agrotech.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    @Override
    public void save(Funcionario funcionario) {
        repository.save(funcionario); 
    }

    @Override
    public void delete(Funcionario funcionario) {
        repository.delete(funcionario);

    }

    @Override
    public List<Funcionario> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }


    
}