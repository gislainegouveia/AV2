package com.newton.aaw.provaArquitetura.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.newton.aaw.provaArquitetura.api.MicroEmpresaDto;
import com.newton.aaw.provaArquitetura.domain.entity.MicroEmpresa;
import com.newton.aaw.provaArquitetura.domain.repository.MicroEmpresaRepository;

@Service
public class MicroEmpresaService {

	public void MicroEmpresaService(MicroEmpresaRepository MicroEmpresaRepository) {
	}

	// C - CRUD
	public MicroEmpresa create(MicroEmpresa u) {

		CrudRepository<MicroEmpresa, String> MicroEmpresaRepository = null;
		MicroEmpresaRepository.save(u);
		
		return u;
	}
	
	// u - CRUD
	public MicroEmpresa update(String id, MicroEmpresa u) {

		// recuperar para validar se existe
		MicroEmpresa existing = get(id);

		// update
		existing.setNome(u.getNome());
		existing.setCnpj(u.getCnpj());
		existing.setEmail(u.getEmail());
		existing.setDataDeCadastro(u.getDataDeCadastro());
		
		
		
		existing.setModifiedAt(LocalDateTime.now());
		
		CrudRepository<MicroEmpresa, String> MicroEmpresaRepository;
		//MicroEmpresaRepository.save(existing);
		return existing;
	}
	
	// R - CRUD
	public MicroEmpresa get(String id) {
		
		CrudRepository<MicroEmpresa, String> MicroEmpresaRepository;
		//var MicroEmpresa = MicroEmpresaRepository.findById(id);
		return null;
		
		
		
		//return MicroEmpresa.get();
	}
	
	// R - CRUD
	public List<MicroEmpresa> getAll() {
		MongoRepository<MicroEmpresa, String> MicroEmpresaRepository = null;
		return MicroEmpresaRepository.findAll();
	}
	
	// D - CRUD
	public void delete(String id) {

		// recuperar para validar se existe
		get(id);
		
		CrudRepository<MicroEmpresa, String> MicroEmpresaRepository = null;
		MicroEmpresaRepository.deleteById(id);
	}
	
}
