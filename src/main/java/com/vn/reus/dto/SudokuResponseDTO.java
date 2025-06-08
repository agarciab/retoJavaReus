package com.vn.reus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SudokuResponseDTO {

	private boolean resuelto;
    private int[][] tablero;
    private String mensaje;

}
