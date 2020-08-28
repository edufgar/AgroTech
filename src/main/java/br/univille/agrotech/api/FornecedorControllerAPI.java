package br.univille.agrotech.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.agrotech.model.Fornecedor;
import br.univille.agrotech.service.FornecedorService;

@RestController
@RequestMapping("/api/v1/fornecedores")
public class FornecedorControllerAPI {

    @Autowired
    private FornecedorService service;
    
    @GetMapping
    public ResponseEntity<List<Fornecedor>> getALL(){
        List<Fornecedor> lista = service.getAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> getById(@PathVariable("id") Fornecedor fornecedor){
        return new ResponseEntity<>(fornecedor, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Fornecedor> save (@RequestBody Fornecedor fornecedor){
        service.save(fornecedor);
        return new ResponseEntity<>(fornecedor, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedor> update (@PathVariable("id") Fornecedor fornecedorAntigo,
                                              @RequestBody Fornecedor fornecedorAtualizado){
        fornecedorAntigo.setNome(fornecedorAtualizado.getNome());
        fornecedorAntigo.setTelefone(fornecedorAtualizado.getTelefone());
        fornecedorAntigo.setEmail(fornecedorAtualizado.getEmail());
        service.save(fornecedorAntigo);
        return new ResponseEntity<>(fornecedorAntigo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Fornecedor> delete(@PathVariable("id") Fornecedor fornecedor){
        service.delete(fornecedor);
        return new ResponseEntity<>(fornecedor, HttpStatus.OK);
    }
    
}