package com.desafio.apidesafio.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "COLABORADOR")
public class Colaborador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_COLABORADOR")
	private Integer id;

	@Column(name = "CPF")
	private String cpf;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "ENDERECO")
	private String endereco;

	@ManyToOne
	@JoinColumn(name = "CODIGO_EMPRESA", referencedColumnName = "CODIGO_EMPRESA")
	private Empresa empresa;

	@ManyToOne
	@JoinColumn(name = "CARGO_ID", referencedColumnName = "ID")
	private Cargo cargo;

}
