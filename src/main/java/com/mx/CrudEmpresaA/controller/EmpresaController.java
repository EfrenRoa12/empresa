package com.mx.CrudEmpresaA.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpresaA.Servicios.EmpresaServ;
import com.mx.CrudEmpresaA.dominio.Empresa;

@RestController
@RequestMapping("EmpresaController")
@CrossOrigin
public class EmpresaController {
// 747hdKfkf*#[÷^$;$<x>jfjf84
	@Autowired
	EmpresaServ empresaServ;

	Logger logger = LoggerFactory.getLogger(EmpresaController.class);
	
	
	// http://localhost:9001/EmpresaController/listar
	@GetMapping("listar") // mostrar los registros de nuestra BD
	public List<Empresa> listar() {

		var lista = empresaServ.listar();
		/*
		 DEBUG: trazas de la aplicación en depuración
INFO: información
WARN: advertencia (posible fallo)
ERROR: error del sistema
FATAL: error bloqueante que puede tener efectos secundarios en el sistema (por ejemplo, 
no poder conectarnos a una base de datos generará probablemente un bloqueo de muchas funcionalidades del sistema)
		 */
		//UTILIZA LOG4J
		//PODEMOS HACER UNA CONDICIONAL DE IF PARA INFORME DE ERRORES
		logger.info("mensaje de info"+lista);
		logger.debug("mensaje de debug"+lista);
		logger.warn("mensaje de warn"+lista);
		logger.error("mensaje de error"+lista);
		//logger.fatal("mensaje de info"+lista);
		return lista;

	}// listar

	@PostMapping("buscar") // va a devorlver un resultado de la BD

	public Empresa buscar(@RequestBody Empresa empresa) {
		empresa = empresaServ.buscar(empresa);
		
		logger.info("mensaje de info"+empresa);
		logger.debug("mensaje de debug"+empresa);
		logger.warn("mensaje de warn"+empresa);
		logger.error("mensaje de error"+empresa);
		
		return empresa;

	}// buscar

	@PostMapping("guardar")
	public void guardar(@RequestBody Empresa empresa) {

		empresaServ.guardar(empresa);
		
		logger.info("mensaje de info"+empresa);
		logger.debug("mensaje de debug"+empresa);
		logger.warn("mensaje de warn"+empresa);
		logger.error("mensaje de error"+empresa);

	}// guardar

	@PostMapping("eliminar")
	public void eliminar(@RequestBody Empresa empresa) {

		empresaServ.eliminar(empresa);
		
		
		logger.info("mensaje de info"+empresa);
		logger.debug("mensaje de debug"+empresa);
		logger.warn("mensaje de warn"+empresa);
		logger.error("mensaje de error"+empresa);
		

	}// eliminar

	@PostMapping("editar")
	public void editar(@RequestBody Empresa empresa) {

		empresaServ.editar(empresa);
		
		
		logger.info("mensaje de info"+empresa);
		logger.debug("mensaje de debug"+empresa);
		logger.warn("mensaje de warn"+empresa);
		logger.error("mensaje de error"+empresa);

	}// editar
	
	
	
}
