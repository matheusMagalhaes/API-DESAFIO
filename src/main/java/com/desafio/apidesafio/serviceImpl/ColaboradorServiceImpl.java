package com.desafio.apidesafio.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.desafio.apidesafio.model.Colaborador;
import com.desafio.apidesafio.model.dto.ColaboradorDTO;
import com.desafio.apidesafio.repository.ColaboradorRepository;
import com.desafio.apidesafio.service.ColaboradorService;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;
import jakarta.persistence.criteria.CriteriaBuilder.In;
import jakarta.servlet.ServletException;
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
		String cpf = colaboradorDTO.getCpf();
		if (!this.validaCpf(cpf)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CPF Invalido!");
		} else {
			Colaborador colaborador = this.modelMapper.map(colaboradorDTO, Colaborador.class);
			return this.colaboradorRepository.save(colaborador);
		}
	}

	@Override
	public void deleteById(Integer id) {
		this.colaboradorRepository.deleteById(id);
	}

	public Boolean validaCpf(String cpf) {
		CPFValidator cpfValidator = new CPFValidator();
		List<ValidationMessage> errorMsg = cpfValidator.invalidMessagesFor(cpf);
		if (errorMsg.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

}
