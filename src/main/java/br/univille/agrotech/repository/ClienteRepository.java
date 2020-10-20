package br.univille.agrotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.agrotech.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
    
}