package com.desafio.apidesafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.apidesafio.model.Colaborador;
import com.desafio.apidesafio.model.dto.ColaboradorDTO;
import com.desafio.apidesafio.service.ColaboradorService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/colaborador/")
@AllArgsConstructor
@NoArgsConstructor
public class ColaboradorController {

	@Autowired
	private ColaboradorService colaboradorService;

	@GetMapping("buscar")
	public List<Colaborador> buscarTodoColaboradores() {
		return this.colaboradorService.buscatTodosColaboradores();
	}

	@GetMapping("buscar-por-empresa/{idEmpresa}")
	public List<ColaboradorDTO> buscarPorIdEmpresa(@PathVariable("idEmpresa") Integer idEmpresa) {
		return this.colaboradorService.buscarPorIdEmpresa(idEmpresa);
	}

	@PostMapping("salvar")
	public ResponseEntity<Colaborador> salvarColaborador(@RequestBody ColaboradorDTO colaboradorDTO) {
		return ResponseEntity.ok(this.colaboradorService.salvarColaborador(colaboradorDTO));
	}

	@DeleteMapping("deletar/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		this.colaboradorService.deleteById(id);
	}

}
