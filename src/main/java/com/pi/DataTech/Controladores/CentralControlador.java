package com.pi.DataTech.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.pi.DataTech.Entidades.Producto;
import com.pi.DataTech.Servicios.IProductoServicio;


@Controller
public class CentralControlador {
	
	//Inyeccion de dependencias
	@Autowired
	IProductoServicio iProductoServicio;
	
	//Mapeos
	
	@GetMapping ("/")
	public String imprimirIndex(Model model) {
		model.addAttribute("titulo", "Página Principal");
		List<Producto> listaProductos = iProductoServicio.buscarTodosLosProductos();
		model.addAttribute("listarTodo", listaProductos);
		return "index";
	}
	@GetMapping ("/carrito")
	public String imprimirCarrito(Model model) {
		model.addAttribute("titulo", "Carrito");
		return "carrito";
	}
	@GetMapping ("/catalogo")
	public String imprimirCatalogo(Model model) {
		model.addAttribute("titulo", "Catálogo");
		List<Producto> listaProductos = iProductoServicio.buscarTodosLosProductos();
		model.addAttribute("listarTodo", listaProductos);
		return "catalogo";
	}
	@GetMapping ("/contacto")
	public String imprimirContacto(Model model) {
		return "contacto";
	}
	@GetMapping ("/FAQ")
	public String imprimirFAQ(Model model) {
		model.addAttribute("titulo", "FAQ");
		return "FAQ";
	}
	@GetMapping ("/login")
	public String imprimirLogin(Model model) {
		model.addAttribute("titulo", "Login");
		return "login";
	}
	@GetMapping("/producto")
    public String imprimirProducto(@RequestParam("id") long id, Model model) {
		model.addAttribute("titulo", "Producto");
		Producto producto = iProductoServicio.buscarProducto(id);
		model.addAttribute("producto",producto );
        return "producto";
    }
	@GetMapping ("/registro")
	public String imprimirRegistro(Model model) {
		model.addAttribute("titulo", "Registro");
		return "registro";
	}
	@GetMapping ("/usuario")
	public String imprimirUsuario(Model model) {
		model.addAttribute("titulo", "Usuario");
		return "usuario";
	}
	@GetMapping ("/admin")
	public String imprimirAdmin(Model model) {
		model.addAttribute("titulo", "Administración");
//		model.addAttribute("producto", new Producto());
		List<Producto> listaProductos = iProductoServicio.buscarTodosLosProductos();
		model.addAttribute("listarTodo", listaProductos);
		return "administracion";
	}
	@GetMapping("/agregarProducto")
	public String imprimirAgregarProducto(Model model) {
		model.addAttribute("titulo", "Agregar Producto");
		model.addAttribute("producto",new Producto());
		return "agregarProducto";
	}
	@GetMapping("/agregarProducto1")
	public String imprimirAgregarProducto1(Model model) {
		model.addAttribute("titulo", "Agregar Producto");
		model.addAttribute("producto",new Producto());
		String alerta = "Se guardo correctamente tu producto.";
		model.addAttribute("alerta", alerta);
		return "agregarProducto";
	}
	@GetMapping("/agregarProducto2")
	public String imprimirAgregarProducto2(Model model) {
		model.addAttribute("titulo", "Agregar Producto");
		model.addAttribute("producto",new Producto());
		String alerta = "Ya existe un producto del mismo nombre.";
		model.addAttribute("alerta", alerta);
		return "agregarProducto";
	}
	@PostMapping("/agregoProducto") // Map ONLY POST Requests
	public RedirectView agregoProducto(@ModelAttribute Producto producto, BindingResult result, Model model) {
		boolean isOk = iProductoServicio.agregarProducto(producto);
		if (isOk) {
			return new RedirectView("/agregarProducto1");
		}else {
			return new RedirectView("/agregarProducto2");
		}
		
	}
	@GetMapping("/editar")
    public String editarProducto(@RequestParam("id") long id, Model model) {
		model.addAttribute("titulo", "Editar Producto");
		Producto productoEditar = iProductoServicio.buscarProducto(id);
		model.addAttribute("producto", productoEditar);
        return "editarProducto";
    }
	@PostMapping("/editarProducto") // Map ONLY POST Requests
	public String editarProducto(@ModelAttribute Producto producto, BindingResult result, Model model) {
		boolean isOk = iProductoServicio.editarProducto(producto);
		String alerta = "";
		if (isOk) {
			alerta = "Se editó correctamente tu producto.";
		}else {
			alerta = "No puedes cambiar el nombre.";
		}
		model.addAttribute("alerta", alerta);
		return "editarProducto";
	}
	@GetMapping("/delete")
    public RedirectView borrarProducto(@RequestParam("id") long id, Model model) {
		iProductoServicio.eliminarProducto(id);;
        return new RedirectView("/admin");
    }
//	@GetMapping("/buscarTodosAdministracion")
//	public void buscarTodosAdministracion(Model model) {
//		List<Producto> listaProductos = iProductoServicio.buscarTodosLosProductos();
//		model.addAttribute("listarTodo", listaProductos);
//	}
//	@PostMapping("/buscar")
//	public String buscarVariosProductos(@ModelAttribute Producto producto, Model model){
//		List<Producto> listaProductos = iProductoServicio.buscarProductos(producto.getNombre());
//		System.out.println(listaProductos);
//		if(listaProductos != null) {
//			model.addAttribute("sinResultados", false);
//			model.addAttribute("listaEncontrada", listaProductos);
//		} else {
//			model.addAttribute("sinResultados", true);
//		}
//		return "administracion";
//	}
}
