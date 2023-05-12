package com.desafio.apidesafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.apidesafio.model.Cargo;
import com.desafio.apidesafio.service.CargoService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/cargo/")
@AllArgsConstructor
@NoArgsConstructor
public class CargoController {

	@Autowired
	private CargoService cargoService;

	@GetMapping("buscar")
	public List<Cargo> buscarCargos() {
		return this.cargoService.buscarCargos();
	}

}
