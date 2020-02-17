package com.pi.DataTech.Servicios.Imp;

import java.util.List;

import com.pi.DataTech.Entidades.Producto;
import com.pi.DataTech.Servicios.IProductoServicio;

public class ProductoServicio implements IProductoServicio{
	//Inyectar repositorio
	
	//Responsabilidades
	@Override
	public List<Producto> buscarTodosLosProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto buscarProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> buscarProductos(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eliminarProducto(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
