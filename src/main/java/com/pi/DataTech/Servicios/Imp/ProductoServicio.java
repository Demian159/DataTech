package com.pi.DataTech.Servicios.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pi.DataTech.Entidades.Producto;
import com.pi.DataTech.Repositorios.IProductoRepositorio;
import com.pi.DataTech.Servicios.IProductoServicio;

@Service
public class ProductoServicio implements IProductoServicio{
	//Inyectar repositorio
	@Autowired
	private IProductoRepositorio iProductoRepositorio;	
	//Responsabilidades
	@Override
	public List<Producto> buscarTodosLosProductos() {
		List<Producto> productos = (List<Producto>) iProductoRepositorio.findAll();
		return productos;
	}
	@Override
	public Producto buscarProducto(Long id) {
		Optional<Producto> productoEncontrado= iProductoRepositorio.findById(id);
//		if (productoEncontrado.isPresent()) {
//			throw new Exception("pelicula no disponible");
//		}
		return productoEncontrado.get();
	}
	@Override
	public List<Producto> buscarProductos(String nombre) {
		List<Producto> listaProductos = iProductoRepositorio.encontrarProductosPorNombres(nombre);
		return listaProductos;
	}
	@Override
	public boolean agregarProducto(Producto producto) {
		if (checkNombreDisponible(producto)) {
			iProductoRepositorio.save(producto);
			return true;
		}else {
			return false;
		}		
	}
	@Override
	public boolean editarProducto(Producto producto) {
		iProductoRepositorio.save(producto);
		return true;
	}
	@Override
	public void eliminarProducto(Long id) {
		Producto productoABorrar = iProductoRepositorio.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalido Id:" + id));
		iProductoRepositorio.delete(productoABorrar);		
	}
	private boolean checkNombreDisponible(Producto producto){
		Producto productoEncontrado = iProductoRepositorio.encontrarProductoPorNombre(producto.getNombre()); 
		if (productoEncontrado != null) {
			return false;
		}
		return true;
	}
	private boolean checkEdicionCorrecta(Producto productoMod){
		Producto productoOrig = iProductoRepositorio.findById(productoMod.getId()).get();
		String a = productoMod.getNombre();
		String b = productoOrig.getNombre();
		boolean resultado = (a.equals(b)) ? true: false;
		return resultado;
	}
}
