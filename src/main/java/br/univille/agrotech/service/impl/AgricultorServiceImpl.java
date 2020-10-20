package br.univille.agrotech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.agrotech.model.Agricultor;
import br.univille.agrotech.repository.AgricultorRepository;
import br.univille.agrotech.service.AgricultorService;

@Service
public class AgricultorServiceImpl implements AgricultorService {

    @Autowired
    private AgricultorRepository repository;

    @Override
    public void save(Agricultor agricultor) {
        repository.save(agricultor); 
    }

    @Override
    public void delete(Agricultor agricultor) {
        repository.delete(agricultor);

    }

    @Override
    public List<Agricultor> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }


    
}