package com.desafio.apidesafio.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.apidesafio.model.Cargo;
import com.desafio.apidesafio.repository.CargoRepository;
import com.desafio.apidesafio.service.CargoService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoRepository cargoRepo;

	@Override
	public List<Cargo> buscarCargos() {
		return this.cargoRepo.findAll();
	}

}
