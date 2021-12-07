package com.newton.aaw.provaArquitetura.api;

import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;

import com.newton.aaw.provaArquitetura.domain.entity.MicroEmpresa;

//import org.springframework.data.annotation.Id;

public class MicroEmpresaDto {
	
	
	@Id
	private String id;
	
	private String nome;
	
	private String cnpj; 
	
	private String email;
	
	private LocalDateTime dataDeCadastro;
	
	//private int status;
	private LocalDateTime createdAt;
	
	private LocalDateTime modifiedAt;
	
	
	
	public MicroEmpresaDto(MicroEmpresa microEmpresa) {
		this.id = microEmpresa.getId();
		this.nome = microEmpresa.getNome();
		this.cnpj = microEmpresa.getCnpj();
		this.email = microEmpresa.getEmail();
		this.dataDeCadastro = microEmpresa.getDataDeCadastro();
	}



	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getCnpj() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}



	public LocalDateTime getDataDeCadastro() {
		// TODO Auto-generated method stub
		return null;
	}
}
	

