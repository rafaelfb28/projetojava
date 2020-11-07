package br.com.projetojava.erp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetojava.erp.vo.FiltroProdutoVO;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@GetMapping(path = "/olamundo")
	public ResponseEntity<String> helloWorld(@RequestParam(name = "nome") String nome,
			@RequestParam(name = "idade") Integer idade) {

		final String valor = "OI " + nome + " você possui " + idade + " anos";

		return ResponseEntity.status(HttpStatus.OK).body(valor);

	}			

	@PostMapping("/exemplo")
	public ResponseEntity<String> retornaProduto(@RequestBody FiltroProdutoVO filtro) {

		final String valor = "O produto " + filtro.
		
	}

}
