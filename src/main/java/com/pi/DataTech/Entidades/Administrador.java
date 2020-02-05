package com.pi.DataTech.Entidades;

import java.util.List;

public class Administrador extends Usuario{
	
	//Atributos
	
	public Integer administradorCheck;

	
	//Getters and Setters
	
	public Integer getAdministradorCheck() {
		return administradorCheck;
	}

	public void setAdministradorCheck(Integer administradorCheck) {
		this.administradorCheck = administradorCheck;
	}
	

	//Constructor sobrecargado
	public Administrador(String nombre, String apellido, Integer dni, Integer telefono, String contraseña, String email, String direccion, Integer CP) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono= telefono;
		this.contraseña = contraseña;
		this.email = email;
		this.direccion = direccion;
		this.cp= cp;
		
	}
	
	//Responsabilidades
	

}
