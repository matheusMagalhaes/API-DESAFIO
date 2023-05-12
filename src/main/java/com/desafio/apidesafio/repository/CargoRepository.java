package com.desafio.apidesafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.apidesafio.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer>{

}
