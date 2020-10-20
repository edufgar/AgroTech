package br.univille.agrotech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.agrotech.model.Cliente;

@Service
public interface ClienteService {

    void save(Cliente cliente);
    void delete(Cliente cliente);
    List<Cliente> getAll();
    
}