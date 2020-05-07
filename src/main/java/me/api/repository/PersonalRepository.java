package me.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.api.model.Personal;
import me.api.service.PersonalService;

public interface PersonalRepository extends JpaRepository<Personal, Integer>, PersonalService{

}
