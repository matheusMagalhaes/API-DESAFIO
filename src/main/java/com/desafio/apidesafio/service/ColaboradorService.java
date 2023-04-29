package com.desafio.apidesafio.service;

import java.util.List;

import com.desafio.apidesafio.model.Colaborador;
import com.desafio.apidesafio.model.dto.ColaboradorDTO;

public interface ColaboradorService {

	List<Colaborador> buscatTodosColaboradores();

	List<ColaboradorDTO> buscarPorIdEmpresa(Integer idEmpresa);

	Colaborador salvarColaborador(ColaboradorDTO Colaborador);
}
