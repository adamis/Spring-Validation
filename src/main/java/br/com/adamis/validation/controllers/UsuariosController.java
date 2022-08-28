package br.com.adamis.validation.controllers;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adamis.validation.inputs.UsuariosInput;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	

	@PostMapping
	public ResponseEntity<UsuariosInput> criar(@RequestBody @Valid UsuariosInput usuarios, HttpServletResponse response) {
		return ResponseEntity.ok(usuarios);
	}
	
}
