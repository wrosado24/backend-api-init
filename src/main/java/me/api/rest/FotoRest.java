package me.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import me.api.model.Foto;
import me.api.repository.FotoRepository;


@RestController
@RequestMapping("v1/foto")
public class FotoRest {
	
	@Autowired
	private FotoRepository fotoRepository;
	
	@PostMapping("/subir/{idUsuario}")
	public ResponseEntity<String> subirFoto(@RequestParam("file") MultipartFile file, @PathVariable("idUsuario") Integer idUsuario){
		fotoRepository.subirFoto(file, idUsuario);
		return new ResponseEntity<>("Se subio correctamente el archivo", HttpStatus.OK);
	}
	
	@GetMapping("/obtenerFotos")
	public List<Foto> listar(){
		return fotoRepository.findAll();
	}
	

}
