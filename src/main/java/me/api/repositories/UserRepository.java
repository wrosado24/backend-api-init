package me.api.repositories;

import java.util.List;

import me.api.model.Usuarios;

public interface UserRepository {
	
	public void contadorUsuarios();
	public void insertarUsuario(Usuarios us);
}
