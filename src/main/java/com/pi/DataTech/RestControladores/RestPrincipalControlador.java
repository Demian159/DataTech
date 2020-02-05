package com.pi.DataTech.RestControladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi.DataTech.Entidades.Producto;

@RestController
public class RestPrincipalControlador {
	
	@GetMapping("/producto2")
	public Producto devolverProducto(){
		//producto Hardcodeado
		Producto prod = new Producto("CPU", "i7 9700k", "Intel", 16600.00, "fbsakhfbsa", "badkfda", "fsagsaga");
		return prod;
	}
	@GetMapping("/productos2")
	public List<Producto> devolverTodosProductos(){
		Producto prod = new Producto("CPU", "i7 9700k", "Intel", 16600.00, "fbsakhfbsa", "badkfda", "fsagsaga");
		Producto prod2 = new Producto("CPU", "i7 9700k", "Intel", 16600.00, "fbsakhfbsa", "badkfda", "fsagsaga");
		Producto prod3 = new Producto("CPU", "i7 9700k", "Intel", 16600.00, "fbsakhfbsa", "badkfda", "fsagsaga");
		List<Producto> listPro = new ArrayList<Producto>();
		listPro.add(prod);
		listPro.add(prod2);
		listPro.add(prod3);
		return listPro;
	}
	

}
