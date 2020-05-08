package me.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.api.model.Usuario;
import me.api.repository.UsuarioRepository;

@RestController
@RequestMapping("v1/usuarios")
public class UsuarioRest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/listarUsuarios")
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.listarUsuarios();
	}

}
