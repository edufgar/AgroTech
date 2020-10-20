package br.univille.agrotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.agrotech.model.Agricultor;

@Repository
public interface AgricultorRepository extends JpaRepository <Agricultor, Long> {
    
}