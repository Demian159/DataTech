package com.pi.DataTech.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CentralControlador {
	
	@GetMapping ("/")
	public String imprimirIndex(Model model) {
		return "index";
	}
	@GetMapping ("/carrito")
	public String imprimirCarrito(Model model) {
		return "carrito";
	}
	@GetMapping ("/catalogo")
	public String imprimirCatalogo(Model model) {
		return "catalogo";
	}
	@GetMapping ("/contacto")
	public String imprimirContacto(Model model) {
		return "contacto";
	}
	@GetMapping ("/FAQ")
	public String imprimirFAQ(Model model) {
		return "FAQ";
	}
	@GetMapping ("/login")
	public String imprimirLogin(Model model) {
		return "login";
	}
	@GetMapping ("/producto")
	public String imprimirProducto(Model model) {
		return "producto";
	}
	@GetMapping ("/registro")
	public String imprimirRegistro(Model model) {
		return "registro";
	}
	@GetMapping ("/usuario")
	public String imprimirUsuario(Model model) {
		return "usuario";
	}

}
