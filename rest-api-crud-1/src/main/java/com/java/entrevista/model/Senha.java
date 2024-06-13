package com.java.entrevista.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Senha {
	
	public Senha() {
	}
	
	
	public Senha(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String conteudo;
	
	
	
	public Long getId() {
		return this.getId();
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getConteudo(){
		return this.conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
