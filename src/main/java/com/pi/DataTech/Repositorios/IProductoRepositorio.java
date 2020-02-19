package com.pi.DataTech.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pi.DataTech.Entidades.Producto;

@Repository
public interface IProductoRepositorio extends CrudRepository<Producto, Long>{
	
	
	@Query("select p from Producto p where p.nombre = ?1")
	Producto encontrarProductoPorNombre(String nombre);
	@Query("select p from Producto p where p.nombre like %?1%")
	List<Producto> encontrarProductosPorNombres(String nombre);
	
}
