package com.pi.DataTech.Entidades;

public class Usuario {
	
	//Atributos
	
	protected Long id_cliente;
	
	protected String nombre;
	
	protected String apellido;
	
	protected Integer dni;
	
	protected Integer telefono;
	
	protected String contraseña;
	
	protected String email;
	
	protected Double cartera;
	
	protected String direccion;
	
	protected Integer cp;
	
	

	
	// Getters and Setters
	

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getCartera() {
		return cartera;
	}

	public void setCartera(Double cartera) {
		this.cartera = cartera;
	}
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}


}
