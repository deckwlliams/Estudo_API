package br.com.derick.hello.services;

import br.com.derick.hello.model.Produto;

public interface ProdutoService {
	public Produto desconto(Produto prod, double percentual);
	

}
