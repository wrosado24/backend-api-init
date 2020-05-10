package me.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.api.model.Ciudad;
import me.api.model.Distrito;
import me.api.model.Pais;
import me.api.repository.CiudadRepository;
import me.api.repository.DistritoRepository;
import me.api.repository.PaisRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("v1/localizacion")
public class LocalizacionRest {
	
	@Autowired
	private PaisRepository paisRepository;
	
	@Autowired
	private CiudadRepository ciudadRepository;
	
	@Autowired
	private DistritoRepository distritoRepository;
	
	//Methods rest
	@GetMapping("/paises")
	public List<Pais> listarPaises(){
		return paisRepository.listarPaises();
	}
	
	@GetMapping("/ciudades/{codPais}")
	public List<Ciudad> listarCiudades(@PathVariable("codPais") Integer codPais){
		return ciudadRepository.listarCiudades(codPais);
	}
	
	@GetMapping("/distritos/{codCiudad}")
	public List<Distrito> listarDistritos(@PathVariable("codCiudad") Integer codCiudad){
		return distritoRepository.listarDistritos(codCiudad);
	}

}
