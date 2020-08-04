package br.univille.agrotech.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codProduto;
    @Column(length = 1000)
    private String descricao;
    private float valorUnitario;
    private String unidade;
    
    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
    private Agricultor agricultor;

    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
    private Fornecedor fornecedor;

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}