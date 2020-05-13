package me.api.service;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.web.multipart.MultipartFile;

import me.api.model.Foto;

public class FotoServiceImpl implements FotoService{
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void subirFoto(MultipartFile file, Integer idUsuario) {
		Foto foto = new Foto();
		try {
			foto.setImagen(file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		foto.setNombre(file.getName());
		em.merge(foto);
		
	}


}
