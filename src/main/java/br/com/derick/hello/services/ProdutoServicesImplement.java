package br.com.derick.hello.services;

import org.springframework.stereotype.Component;

import br.com.derick.hello.model.Produto;

@Component
public class ProdutoServicesImplement  implements ProdutoService{
	
	@Override
	public Produto desconto(Produto prod, double percentual) {
		double novoPreco = prod.getPreco() - prod.getPreco() * percentual / 100;
		prod.setPreco(novoPreco);
		return prod;
		
	}

}
