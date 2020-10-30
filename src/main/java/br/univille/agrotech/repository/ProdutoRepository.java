package br.univille.agrotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.agrotech.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
