package com.pi.DataTech.Repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pi.DataTech.Entidades.Producto;

public interface IProductoRepositorio extends CrudRepository<Producto, Long>{
	
	@Query("select p from Producto p where p.titulo like %?1%")
	Producto findTituloIs2(String titulo);
	
}
