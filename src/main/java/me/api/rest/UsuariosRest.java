package me.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.api.dao.UsuariosDAO;
import me.api.model.Usuarios;

@RestController
@RequestMapping("/usuarios")//ruta uri
public class UsuariosRest {
	
	//Anotacion @Autowired para inyeccion de dependecia. Inyectar el dao y acceder a todos los metodos
	@Autowired
	private UsuariosDAO usuariosDAO;
	
	//@GetMapping("path")--- Anotacion para el mtodo HTTP ==> GET
	@GetMapping("/listarTodos")
	public List<Usuarios> listarTodos(){
		return usuariosDAO.findAll();//.findAll() -- Trae todo los registros de la base de datos
	}
	
	//@PostMapping("path") --- Anotacion para el metodo HTTP ==> POST
	@PostMapping("/guardarUsuario")
	public void guardarUsuarios(@RequestBody Usuarios usuarios) {//--@RequestBody ==> Convierte el objeto java en JSON para hacer la insercion
		usuariosDAO.save(usuarios);//.save() -- Guarda el objeto en la base de datos
	}
	
	//@DeleteMapping("path") --- Anotacion para el metodo HTTP ==> DELETE
	@DeleteMapping("/eliminarUsuario/{id}")//--Path cambia y agrega el {id}
	public void eliminarUsuario(@PathVariable Integer id) {//--@PathVariable Integer id: Obtenemos el id para poder eliminar
		usuariosDAO.deleteById(id);//.deleteById()-- Eliminamos por id un objeto de base
	}
	//@PutMapping("path") --- Anotacion para el metodo HTTP ===> PUT
	@PutMapping("actualizarUsuario")
	public void actualizarUsuario(@RequestBody Usuarios usuarios) {//--@RequestBody ==> Convierte el objeto java en JSON para hacer la insercion
		usuariosDAO.save(usuarios);//.save() -- actualizar el objeto en base a su id que se le envia
	}
}
