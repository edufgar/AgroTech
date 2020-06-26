package br.univille.agrotech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.agrotech.model.Fornecedor;
import br.univille.agrotech.repository.FornecedorRepository;
import br.univille.agrotech.service.FornecedorService;

@Service
public class FornecedorServiceImpl implements FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    @Override
    public void save(Fornecedor fornecedor) {
        repository.save(fornecedor); 
    }

    @Override
    public void delete(Fornecedor fornecedor) {
        repository.delete(fornecedor);

    }

    @Override
    public List<Fornecedor> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }


    
}