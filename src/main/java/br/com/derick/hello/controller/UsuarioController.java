package br.com.derick.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.derick.hello.model.Usuario;

@RestController
public class UsuarioController {
	
	@PostMapping("/login")
	public ResponseEntity<Usuario>login(@RequestBody Usuario dados) {
		System.out.print("Recebido:"+ dados.getEmail()+"/"+dados.getSenha());
		if(dados.getEmail().equals("derick@gmail.com")) {
			if(dados.getSenha().equals("derick06")) {
				Usuario resposta = new Usuario();
				resposta.setId(12);
				resposta.setEmail("derick@gmail.com.br");
				resposta.setNome("Derick");
				resposta.setSenha("1111");
				return ResponseEntity.ok(resposta);
			}
			return ResponseEntity.status(401).build();
		}
		
		return ResponseEntity.notFound().build();// ResponseEntity.status(404).build();
		}
	


}
