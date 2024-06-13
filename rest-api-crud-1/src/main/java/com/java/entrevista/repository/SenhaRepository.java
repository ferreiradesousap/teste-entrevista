package com.java.entrevista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.entrevista.model.Senha;

public interface SenhaRepository extends JpaRepository<Senha, Long> {

}
