package me.api.service;

import org.springframework.web.multipart.MultipartFile;

public interface FotoService {
	
	public void subirFoto(MultipartFile file, Integer idUsuario);


}
