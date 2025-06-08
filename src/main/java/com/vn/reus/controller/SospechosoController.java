package com.vn.reus.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vn.reus.dto.PistaDTO;
import com.vn.reus.dto.SospechosoDTO;
import com.vn.reus.entity.Sospechoso;
import com.vn.reus.repository.SospechosoRepository;

@RestController
@RequestMapping("/sospechosos")
public class SospechosoController {

	private SospechosoRepository sospechosoRepository;

	public SospechosoController(SospechosoRepository sospechosoRepository) {
		this.sospechosoRepository = sospechosoRepository;
	}

	@GetMapping
	public List<Sospechoso> getAllSospechosos() {
		return sospechosoRepository.findAll();
	}

	@PostMapping
	public void addSospechoso(SospechosoDTO nuevoSospechoso) {
		// TODO document why this method is empty
	}

	@PostMapping("/search")
	public List<Sospechoso> searchSospechoso(List<PistaDTO> pistas) {
		return Collections.emptyList();
	}

}
