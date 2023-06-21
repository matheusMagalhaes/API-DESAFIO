
package com.desafio.apidesafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.desafio.apidesafio.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

	@Query(value = "SELECT * FROM EMPRESA WHERE EMPRESA.ID = :id", nativeQuery = true)
	List<Empresa> buscarEmpresaPorId(@Param("id") Integer id);

}
