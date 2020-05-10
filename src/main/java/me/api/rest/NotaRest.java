package me.api.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.api.model.Nota;
import me.api.repository.NotaRepository;


@RestController
@RequestMapping("v1/notas")
public class NotaRest {
	
	@Autowired
	private NotaRepository notaRepository;
	
	
	@GetMapping("/listarNotas")
	public List<Nota> listarNotas(){
		return notaRepository.findAll();
	}
	

}
