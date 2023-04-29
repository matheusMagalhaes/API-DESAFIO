package com.desafio.apidesafio.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.apidesafio.model.Empresa;
import com.desafio.apidesafio.repository.EmpresaRepository;
import com.desafio.apidesafio.service.EmpresaService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public List<Empresa> buscarEmpresas() {
		return this.empresaRepository.findAll();
	}

	@Override
	public Empresa salvarEmpresa(Empresa empresa) {
		return this.empresaRepository.saveAndFlush(empresa);
	}

}
