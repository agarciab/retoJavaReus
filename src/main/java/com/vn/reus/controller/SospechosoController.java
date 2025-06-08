package com.vn.reus.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vn.reus.dto.PistaDTO;
import com.vn.reus.dto.SospechosoDTO;
import com.vn.reus.entity.Sospechoso;
import java.util.Collections;

@RestController
@RequestMapping("/sospechosos")
public class SospechosoController {

	@GetMapping
	public List<Sospechoso> getAllSospechosos() {
		return Collections.emptyList();
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
