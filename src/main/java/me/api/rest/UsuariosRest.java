package me.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.api.model.Usuarios;
import me.api.repositories.UsuarioRepositoryBase;

@CrossOrigin("*")
@RestController
@RequestMapping("v1")
public class UsuariosRest {
	
	
	@Autowired
	private UsuarioRepositoryBase urb;
	
	@GetMapping("/contador")
	public void contador() {
		urb.contadorUsuarios();
	}
	
	@PostMapping("/insertar")
	public void insertar(@RequestBody Usuarios us) {
		urb.insertarUsuario(us);
	}
}
