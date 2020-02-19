package com.pi.DataTech.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	@Column(unique=true, nullable=false, length=30)
	protected String nombre;
	@Column
	protected String categoria;
	@Column
	protected String marca;
	@Column
	protected Double precio;
	@Column(length=50)
	protected String modelo;
	@Column
	protected String img;
	@Column(length=250)
	protected String descripcion;
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	//Constructor Vacio requerido por JPA
	public Producto() {}	
	//Constructor Sobrecargado
//	public Producto(Categoria categoria, String nombre, Marca marca, Double precio, String modelo, String img,
//			String descripcion) {
//		super();
//		this.categoria2 = categoria;
//		this.nombre = nombre;
//		this.marca2 = marca;
//		this.precio = precio;
//		this.modelo = modelo;
//		this.img = img;
//		this.descripcion = descripcion;
//	}
}
