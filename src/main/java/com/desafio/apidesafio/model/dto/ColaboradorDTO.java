package com.desafio.apidesafio.model.dto;

import com.desafio.apidesafio.model.Empresa;

import lombok.Data;

@Data
public class ColaboradorDTO {

	private String cpf;

	private String nome;

	private String email;

	private String telefone;

	private String endereco;

	private Empresa empresa;

	private String nomeEmpresa;

	public ColaboradorDTO(ColaboradorInterfaceDTO interfaceDTO) {
		this.cpf = interfaceDTO.getCpf();
		this.nome = interfaceDTO.getNome();
		this.email = interfaceDTO.getEmail();
		this.telefone = interfaceDTO.getTelefone();
		this.endereco = interfaceDTO.getEndereco();
		this.nomeEmpresa = interfaceDTO.getNomeEmpresa();
	}

	public ColaboradorDTO() {
		super();
	}

	public interface ColaboradorInterfaceDTO {
		String getCpf();

		String getNome();

		String getEmail();

		String getTelefone();

		String getEndereco();

		String getNomeEmpresa();
	}

}
