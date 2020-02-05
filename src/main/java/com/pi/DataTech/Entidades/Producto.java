package com.pi.DataTech.Entidades;

public class Producto {
	
	
	//Atributos

	protected Long id;

	protected String tipo;

	protected String nombre;

	protected String marca;

	protected Double precio;

	protected String modelo;

	protected String img;

	protected String desc;

	protected String fechaRegistro;
	
	
	//Getters and Setters
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	//Constructor
	public Producto(String tipo, String nombre, String marca, Double precio, String modelo, String img,
			String desc) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.img = img;
		this.desc = desc;
	}	

}
