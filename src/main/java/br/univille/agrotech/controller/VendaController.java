package br.univille.agrotech.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.agrotech.model.Venda;
import br.univille.agrotech.model.Funcionario;
import br.univille.agrotech.model.Cliente;
import br.univille.agrotech.model.Produto;
import br.univille.agrotech.repository.VendaRepository;
import br.univille.agrotech.repository.FuncionarioRepository;
import br.univille.agrotech.repository.ClienteRepository;
import br.univille.agrotech.repository.ProdutoRepository;

@Controller
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaRepository vendaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
   
    @GetMapping("")
    public ModelAndView index() {
        List<Venda> listaVenda = this.vendaRepository.findAll();
       
        return new ModelAndView("venda/index","listaVenda",listaVenda);
    }

    @GetMapping("/nova")
    public ModelAndView createForm(@ModelAttribute Venda venda) {
        List<Funcionario> listaFuncionario = this.funcionarioRepository.findAll();
        List<Cliente> listaCliente = this.clienteRepository.findAll();
        List<Produto> listaProduto = this.produtoRepository.findAll();
       
        HashMap<String, Object> dados = new HashMap<String, Object>();
        dados.put("listaFuncionario", listaFuncionario);
        dados.put("listaCliente", listaCliente);
        dados.put("listaProduto", listaProduto);
       
        return new ModelAndView("venda/form",dados);
    }
    
}
