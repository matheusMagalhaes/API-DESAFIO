package com.desafio.apidesafio.serviceImpl;

import java.util.ArrayList;
import java.util.List;

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
		return this.empresaRepository.save(empresa);
	}

	@Override
	public void deleteById(Integer id) {
		this.empresaRepository.deleteById(id);
	}

	@Override
	public void updateEmpresa(Empresa empresa) {
		List<Empresa> listaEmpresa = new ArrayList<>();
		listaEmpresa = this.empresaRepository.buscarEmpresaPorId(empresa.getId());
		for (Empresa emp : listaEmpresa) {
			if (empresa.getId() == emp.getId()) {
				emp.setNome(empresa.getNome());
				emp.setCnpj(empresa.getCnpj());
				emp.setEmail(empresa.getEmail());
				emp.setTelefone(empresa.getTelefone());
				emp.setEndereco(empresa.getEndereco());
				this.empresaRepository.save(emp);
			}
		}

	}

}
