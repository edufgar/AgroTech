package br.univille.agrotech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.agrotech.model.Fornecedor;

@Service
public interface FornecedorService {

    void save(Fornecedor fornecedor);
    void delete(Fornecedor fornecedor);
    List<Fornecedor> getAll();
    
}