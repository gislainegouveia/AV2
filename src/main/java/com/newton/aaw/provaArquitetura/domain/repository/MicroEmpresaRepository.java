package com.newton.aaw.provaArquitetura.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newton.aaw.provaArquitetura.domain.entity.MicroEmpresa;


public interface MicroEmpresaRepository extends MongoRepository <MicroEmpresa, String>{

}
