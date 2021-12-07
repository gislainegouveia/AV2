package com.newton.aaw.provaArquitetura.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newton.aaw.provaArquitetura.api.MicroEmpresaDto;
import com.newton.aaw.provaArquitetura.domain.entity.MicroEmpresa;
import com.newton.aaw.provaArquitetura.service.MicroEmpresaService;

@RestController
public class MicroEmpresaController {

	private final MicroEmpresaService microEmpresaService;
	private com.newton.aaw.provaArquitetura.service.MicroEmpresaService MicroEmpresaService;
	
	public MicroEmpresaController(MicroEmpresaService microEmpresaService) {
		this.microEmpresaService = new MicroEmpresaService();
		this.MicroEmpresaService = MicroEmpresaService;
	}
	
	@GetMapping("/users/{id}")
	public MicroEmpresaDto getById(@PathVariable String id) {
		return null;
		
	
	}
	
	@GetMapping("/users")
	public List<MicroEmpresaDto> getAll() {
		var MicroEmpresas = MicroEmpresaService.getAll();
		
		var MicroEmpresaDtos = new ArrayList<MicroEmpresaDto>();
		
		for (MicroEmpresa MicroEmpresa: MicroEmpresas) {
			MicroEmpresaDtos.add(new MicroEmpresaDto(MicroEmpresa));
		}
		
		return MicroEmpresaDtos;
	}
	
	@PostMapping("/users")
	public MicroEmpresaDto create(@RequestBody MicroEmpresaDto u) {
		var MicroEmpresa = new MicroEmpresa(u);
		
		MicroEmpresa = MicroEmpresaService.create(MicroEmpresa);
		
		return new MicroEmpresaDto(MicroEmpresa);
	}
	
	@PutMapping("/users/{id}")
	public MicroEmpresaDto update(@PathVariable String id, @RequestBody MicroEmpresaDto u) {
		var MicroEmpresa = new MicroEmpresa(u);

		MicroEmpresa = MicroEmpresaService.update(id, MicroEmpresa);
		
		return new MicroEmpresaDto(MicroEmpresa);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		MicroEmpresaService.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
