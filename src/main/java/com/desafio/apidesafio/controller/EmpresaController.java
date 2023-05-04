package com.desafio.apidesafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.apidesafio.model.Empresa;
import com.desafio.apidesafio.service.EmpresaService;

@RestController
@RequestMapping("/api/empresa/")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;

	@GetMapping("buscar")
	public List<Empresa> buscarEmpresas() {
		return empresaService.buscarEmpresas();
	}

	@PostMapping("salvar")
	public Empresa salvarEmpresa(@RequestBody Empresa empresa) {
		return empresaService.salvarEmpresa(empresa);
	}

	@DeleteMapping("deletar/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		this.empresaService.deleteById(id);
	}
	
}
