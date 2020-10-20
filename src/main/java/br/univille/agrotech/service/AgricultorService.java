package br.univille.agrotech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.agrotech.model.Agricultor;

@Service
public interface AgricultorService {

    void save(Agricultor cliente);
    void delete(Agricultor cliente);
    List<Agricultor> getAll();
    
}