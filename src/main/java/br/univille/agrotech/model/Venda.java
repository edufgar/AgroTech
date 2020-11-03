package br.univille.agrotech.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dataVenda;

    private String status;
    private float valorvenda;

    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
    private Funcionario codFunc;
    @ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
    private Cliente cliente;
    @OneToMany(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "venda_id")
    private List<ItemVenda> listaItemVenda = new ArrayList<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Funcionario getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(final Funcionario codFunc) {
        this.codFunc = codFunc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   

    public List<ItemVenda> getListaItemVenda() {
        return listaItemVenda;
    }

    public void setListaItemVenda(List<ItemVenda> listaItemVenda) {
        this.listaItemVenda = listaItemVenda;
    }
    

public String getStatus() {
	return status;
}

public void setStatus(String status) {
    this.status = status;    
}

public float getValorvenda() {
	return valorvenda;
}

public void setValorvenda(float valorvenda) {
	this.valorvenda = valorvenda;
}


}