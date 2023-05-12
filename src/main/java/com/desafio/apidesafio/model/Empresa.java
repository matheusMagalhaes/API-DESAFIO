package com.desafio.apidesafio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EMPRESA")
@Data
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_EMPRESA")
	private Integer id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CNPJ")
	private String cnpj;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "TELEFONE")
	private String telefone;

	@ManyToOne
	@JoinColumn(name = "ENDERCO_ID", referencedColumnName = "ID")
	private Endereco endereco;

}
