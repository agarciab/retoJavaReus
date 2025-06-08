package com.vn.reus.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vn.reus.dto.SudokuRequestDTO;
import com.vn.reus.dto.SudokuResponseDTO;
import com.vn.reus.service.SudokuSolverService;

@RestController
@RequestMapping("/sudoku")
public class SudokuController {
	
	private SudokuSolverService solucionador;
	
	public SudokuController(SudokuSolverService sudokuSolverService) {
		this.solucionador = sudokuSolverService;
	}

	@PostMapping("/resolver")
    public SudokuResponseDTO resolverSudoku(@RequestBody SudokuRequestDTO sudoku) {
        int[][] tablero = sudoku.getTablero();

        if (solucionador.resolver(tablero)) {
            return new SudokuResponseDTO(true, tablero, null);
        } else {
            return new SudokuResponseDTO(false, null, "No se pudo resolver el Sudoku.");
        }
    }

}
