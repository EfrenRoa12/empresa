package com.mx.CrudEmpresaA.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudEmpresaA.dominio.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, Integer>{

}
