package com.desafio.apidesafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.desafio.apidesafio.model.Colaborador;
import com.desafio.apidesafio.model.dto.ColaboradorDTO.ColaboradorInterfaceDTO;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
	@Query(value = "SELECT  A.CPF AS cpf,A.NOME AS nome, A.EMAIL AS email, A.TELEFONE AS telefone, A.ENDERECO AS endereco, B.NOME AS nomeEmpresa, A.CARGO AS cargo FROM COLABORADOR AS A  JOIN EMPRESA AS B ON A.CODIGO_EMPRESA  = B.CODIGO_EMPRESA WHERE A.CODIGO_EMPRESA =:idEmpresa", nativeQuery = true)
	List<ColaboradorInterfaceDTO> buscarPorIdEmpresa(@Param("idEmpresa") Integer idEmpresa);

}
