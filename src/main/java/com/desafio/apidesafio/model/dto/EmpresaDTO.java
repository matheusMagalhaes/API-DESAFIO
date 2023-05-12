package com.desafio.apidesafio.model.dto;

import com.desafio.apidesafio.model.Endereco;

import lombok.Data;

@Data
public class EmpresaDTO {
	private Integer id;

	private String nome;

	private String cnpj;

	private String email;

	private String telefone;

	private Endereco endereco;
}
