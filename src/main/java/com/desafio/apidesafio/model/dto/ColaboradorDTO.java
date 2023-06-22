package com.desafio.apidesafio.model.dto;

import com.desafio.apidesafio.model.Empresa;
import com.desafio.apidesafio.model.Endereco;

import lombok.Data;

@Data
public class ColaboradorDTO {

	private String cpf;

	private String nome;

	private String email;

	private String telefone;

	private Endereco endereco = new Endereco();

	private Empresa empresa = new Empresa();

	private String cargo;

	public ColaboradorDTO(ColaboradorInterfaceDTO x) {
		this.cpf = x.getCpf();
		this.nome = x.getNome();
		this.email = x.getEmail();
		this.telefone = x.getTelefone();
		this.endereco.setRua(x.getRua());
		this.cargo = x.getCargo();
		this.empresa.setNome(x.getNomeEmpresa());
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

		String getRua();

		String getCargo();
	}

}
