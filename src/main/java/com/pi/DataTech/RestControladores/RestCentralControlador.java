package com.pi.DataTech.RestControladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pi.DataTech.Entidades.Producto;
import com.pi.DataTech.Servicios.IProductoServicio;

@RestController
public class RestCentralControlador {
//	@Autowired
//	IProductoServicio iProductoServicio;
//	
//	@GetMapping("buscarTodosAdministracion")
//	public void buscarTodosAdministracion(Model model) {
//		List<Producto> listaProductos = iProductoServicio.buscarTodosLosProductos();
//		model.addAttribute("listarTodo", listaProductos);
//	}
//	@PostMapping("buscarVariosProductos")
//	public String buscarVariosProductos(@RequestBody String nombre, Model model){
//		List<Producto> listaProductos = iProductoServicio.buscarProductos(nombre);
//		if(listaProductos != null) {
//			model.addAttribute("sinResultados", false);
//			model.addAttribute("listaEncontrada", listaProductos);
//			return "administracion";
//		} else {
//			model.addAttribute("sinResultados", true);
//			return "administracion";
//		}
//	}
	
//	@GetMapping("/producto2")
//	public Producto devolverProducto(){
//		//producto Hardcodeado
//		Producto prod = new Producto("CPU", "i7 9700k", "Intel", 16600.00, "fbsakhfbsa", "badkfda", "fsagsaga");
//		return prod;
//	}
//	@GetMapping("/productos2")
//	public List<Producto> devolverTodosProductos(){
//		Producto prod = new Producto("CPU", "i7 9700k", "Intel", 16600.00, "fbsakhfbsa", "badkfda", "fsagsaga");
//		Producto prod2 = new Producto("CPU", "i7 9700k", "Intel", 16600.00, "fbsakhfbsa", "badkfda", "fsagsaga");
//		Producto prod3 = new Producto("CPU", "i7 9700k", "Intel", 16600.00, "fbsakhfbsa", "badkfda", "fsagsaga");
//		List<Producto> listPro = new ArrayList<Producto>();
//		listPro.add(prod);
//		listPro.add(prod2);
//		listPro.add(prod3);
//		return listPro;
//	}
	

}
