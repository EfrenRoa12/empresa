package com.mx.CrudEmpresaA.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class Empresa {
	/*
	 CREATE TABLE EMPRESA( 
		 ID NUMBER PRIMARY KEY, 
		 NOMBRE NVARCHAR2(25), 
		 DIRECCION NVARCHAR2(25), 
		 COD_POSTAL NUMBER, 
		 TIPO NVARCHAR2(25)
	);
	 */
		@Id
		@Column
		int id;
		@Column
		String nombre;
		@Column
		String direccion;
		@Column
		String cod_postal;
		@Column
		String tipo;
		
		
		
		public Empresa() {

		}

		public Empresa(int id) {
			this.id = id;
		}

		public Empresa(int id, String nombre, String direccion, String cod_postal, String tipo) {
			this.id = id;
			this.nombre = nombre;
			this.direccion = direccion;
			this.cod_postal = cod_postal;
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return "Empresa [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", cod_postal="
					+ cod_postal + ", tipo=" + tipo + "]\\n";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getCod_postal() {
			return cod_postal;
		}

		public void setCod_postal(String cod_postal) {
			this.cod_postal = cod_postal;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
}
