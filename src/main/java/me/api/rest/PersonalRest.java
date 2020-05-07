package me.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.api.repository.PersonalRepository;

@RestController
@RequestMapping("v1")
public class PersonalRest {
	
	@Autowired
	private PersonalRepository personalRepository;
	
	@GetMapping("/saludar")
	public void saludar() {
		personalRepository.saludar();
	}

}
