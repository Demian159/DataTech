package com.pi.DataTech.Servicios;

import java.util.List;

import com.pi.DataTech.Entidades.Producto;

public interface IProductoServicio {
	
	List<Producto> buscarTodosLosProductos();
	Producto buscarProducto(Long id);
	//Busca producto por id, recibe por parametro un id, devuelve un producto
	List<Producto> buscarProductos(String titulo);
	//Busca varios productos por titulo, recibe por parametro un titulo, devuelve una lista de productos
	boolean agregarProducto(Producto producto);
	//Agrega un producto a la BD, recibe por parametro un producto del Front, devuelve un booleano para su validación
	boolean editarProducto(Producto producto);
	//Edita un producto en la BD, recibe por parametro un producto del seleccionado en el Front, devuelve un booleano para su validación
	void eliminarProducto(Long id);
	//Elimina un producto de la BD, recibe por parametro el id

}
