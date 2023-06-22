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
	@Query(value = "SELECT A.cpf AS cpf, A.nome AS nome, A.email AS email, A.telefone AS telefone, E.RUA AS rua, B.nome AS nomeEmpresa, A.cargo AS cargo FROM colaborador AS A JOIN empresa AS B ON A.ID_EMPRESA = B.ID JOIN ENDERECO AS E ON A.ENDERECO_ID = E.ID WHERE  A.ID_EMPRESA = :idEmpresa", nativeQuery = true)
	List<ColaboradorInterfaceDTO> buscarPorIdEmpresa(@Param("idEmpresa") Integer idEmpresa);

}