package br.com.derick.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// tornei a classe controller em um rest controller 
// ou  seja, vai expor metodos e forma de URLs
@RestController
public class HelloController {

	@GetMapping("/hello")
  public String sayHello() {
	  return "Hello Word";
  }
}
