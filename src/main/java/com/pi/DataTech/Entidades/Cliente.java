package com.pi.DataTech.Entidades;

public class Cliente extends Usuario{
	
	
	
	//Constructor sobrecargado
	
	public Cliente(String nombre, String apellido, Integer dni, Integer telefono, String contraseña, String email, String direccion, Integer CP) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono= telefono;
		this.contraseña = contraseña;
		this.email = email;
		this.direccion = direccion;
		this.cp= cp;
		
	}

}
