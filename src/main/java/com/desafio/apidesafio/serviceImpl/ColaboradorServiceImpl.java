package com.desafio.apidesafio.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.apidesafio.model.Colaborador;
import com.desafio.apidesafio.model.dto.ColaboradorDTO;
import com.desafio.apidesafio.repository.ColaboradorRepository;
import com.desafio.apidesafio.service.ColaboradorService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ColaboradorServiceImpl implements ColaboradorService {

	@Autowired
	private ColaboradorRepository colaboradorRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<Colaborador> buscatTodosColaboradores() {
		return this.colaboradorRepository.findAll();
	}

	@Override
	public List<ColaboradorDTO> buscarPorIdEmpresa(Integer idEmpresa) {
		return this.colaboradorRepository.buscarPorIdEmpresa(idEmpresa).stream().map(ColaboradorDTO::new)
				.collect(Collectors.toList());
	}

	@Override
	public Colaborador salvarColaborador(ColaboradorDTO colaboradorDTO) {
		Colaborador colaborador = this.modelMapper.map(colaboradorDTO, Colaborador.class);
		return this.colaboradorRepository.save(colaborador);

	}

	@Override
	public void deleteById(Integer id) {
		this.colaboradorRepository.deleteById(id);
	}

}
