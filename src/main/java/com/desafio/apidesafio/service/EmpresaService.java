package com.desafio.apidesafio.service;

import java.util.List;

import com.desafio.apidesafio.model.Empresa;

public interface EmpresaService {

	List<Empresa> buscarEmpresas();

	Empresa salvarEmpresa(Empresa empresa);
}
