package br.com.derick.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.derick.hello.model.Produto;
import br.com.derick.hello.services.ProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	ProdutoService ips;
	
	@GetMapping("/produto")
	public Produto recuperarProduto() {
		Produto prod;
		prod = new Produto();
		prod.setId(1);
		prod.setDescricao("Computador top de linha");
		prod.setPreco(2500);
		prod = ips.desconto(prod,10);
		return prod;
		
	}
	@PostMapping("/novoproduto")
	public String cadastrarNovo(@RequestBody Produto prod) {
		System.out.print("Recebido:" + prod.getId()+"/"+prod.getDescricao()+"/"+prod.getPreco());
		return "Deu certo";
	}

}
