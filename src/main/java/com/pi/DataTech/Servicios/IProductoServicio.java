package com.pi.DataTech.Servicios;

import java.util.List;

import com.pi.DataTech.Entidades.Producto;


public interface IProductoServicio {
	
	List<Producto> buscarTodosLosProductos();
	//Busca producto por id, recibe por parametro un id, devuelve un producto
	Producto buscarProducto(Long id);
	//Busca varios productos por titulo, recibe por parametro un titulo, devuelve una lista de productos
	List<Producto> buscarProductos(String nombre);
	//Agrega un producto a la BD, recibe por parametro un producto del Front, devuelve un booleano para su validación
	boolean agregarProducto(Producto producto);
	//Edita un producto en la BD, recibe por parametro un producto del seleccionado en el Front, devuelve un booleano para su validación
	boolean editarProducto(Producto producto);
	//Elimina un producto de la BD, recibe por parametro el id
	void eliminarProducto(Long id);
	//trae una lista de los productos segun su categoria
//	List<Producto> productosCategoria(Long id);
	

}
