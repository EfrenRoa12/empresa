package com.mx.CrudEmpresaA.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpresaA.dao.EmpresaRepository;
import com.mx.CrudEmpresaA.dominio.Empresa;

@Service
public class EmpresaServImpl implements EmpresaServ{

	@Autowired
	EmpresaRepository empresaDao;

	
	public void guardar(Empresa empresa) {
		empresaDao.save(empresa);
		
	}

	@Override
	public void eliminar(Empresa empresa) {
		empresaDao.delete(empresa);
		
	}

	@Override
	public void editar(Empresa empresa) {
		empresaDao.save(empresa);
	}

	@Override
	public Empresa buscar(Empresa empresa) {
		
		return empresaDao.findById(empresa.getId()).orElse(null);
	}

	@Override
	public List<Empresa> listar() {

		return (List<Empresa>) empresaDao.findAll();
	}
	
	

}
