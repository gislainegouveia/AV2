package com.newton.aaw.provaArquitetura.domain.entity;

import java.time.LocalDateTime;

import com.newton.aaw.provaArquitetura.api.MicroEmpresaDto;

/*import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.newton.aaw.hr.api.EmployeeDto;
import com.newton.aaw.hr.domain.entity.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor*/
public class MicroEmpresa {

	//@Id
	private String id;
	private String nome;
	private String cnpj;
	private String email;
	private LocalDateTime dataDeCadastro;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	
	
	
	public MicroEmpresa(MicroEmpresaDto e) {
		this.id = e.getId();
		this.nome = e.getNome();
		this.cnpj = e.getCnpj();
		this.email = e.getEmail();
		this.dataDeCadastro = e.getDataDeCadastro();
		
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




	public void setNome(String nome2) {
		// TODO Auto-generated method stub
		
	}




	public void setCnpj(String cnpj2) {
		// TODO Auto-generated method stub
		
	}




	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}




	public void setDataDeCadastro(LocalDateTime dataDeCadastro2) {
		// TODO Auto-generated method stub
		
	}




	public void setModifiedAt(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}





}