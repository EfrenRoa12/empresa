package com.mx.CrudEmpresaA.Servicios;

import java.util.List;

import com.mx.CrudEmpresaA.dominio.Empresa;

public interface EmpresaServ {
	
	public void guardar(Empresa empresa);

	public void eliminar(Empresa empresa);

	public void editar(Empresa empresa);
	
	public Empresa buscar(Empresa empresa);

	public List<Empresa> listar();
	
}
