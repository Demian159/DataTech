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
	@Column
	protected String tipo;
	@Column
	protected String nombre;
	@Column
	protected String marca;
	@Column
	protected Double precio;
	@Column
	protected String modelo;
	@Column
	protected String img;
	@Column
	protected String desc;
	@Column
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
	//Constructor Vacio requerido por JPA
	public Producto() {}	
	//Constructor Sobrecargado
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
