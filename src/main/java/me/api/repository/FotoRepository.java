package me.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.api.model.Foto;
import me.api.service.FotoService;

public interface FotoRepository extends JpaRepository<Foto, Integer>,FotoService{

}
