package com.desafio.apidesafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.apidesafio.model.Endereco;

@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Integer>{

}
