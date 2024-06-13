package com.java.entrevista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.entrevista.model.Senha;
import com.java.entrevista.repository.SenhaRepository;

@Service
public class SenhaService {
	
	@Autowired
	private SenhaRepository repository;
	
	
	public void salvarSenha(Senha senha) {
		try {
			String errosValidacao = validarSenha(senha);

			if (!errosValidacao.isBlank()) {
				throw new Exception(errosValidacao);
			}

			repository.save(senha);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public String validarSenha(Senha senha) {
		String mensagemErro = "";
		
		if(senha == null || senha.getConteudo().isBlank()) {
			mensagemErro = "Senha não informada. Informe no mínimo 10 caracteres.\n\n";
		}
		
		if(senha.getConteudo().length() < 10) {
			mensagemErro = "Senha inválida. Tamanho mínimo: 10 caracteres";
		}
		
		if(senha.getConteudo().length() > 30) {
			mensagemErro = "Senha inválida. O tamanho não pode exceder 30 caracteres";
		}		
		
		return mensagemErro;
	}

}
