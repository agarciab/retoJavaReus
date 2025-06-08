package com.vn.reus.controller;

import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enigma")
public class EnigmaController {
	
	@GetMapping("/cifrar")
	public String cifradoAvanzado(@RequestParam String input) {
	    StringBuilder sb = new StringBuilder();

	    for (int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);
	        int x = 3 + (i % 5);
	        sb.append((char) (c + x));
	    }

	    char[] arr = sb.toString().toCharArray();
	    for (int i = 0; i < arr.length - 1; i += 2) {
	        char temp = arr[i];
	        arr[i] = arr[i + 1];
	        arr[i + 1] = temp;
	    }

	    StringBuilder b = new StringBuilder();
	    for (char c : arr) {
	        b.append(String.format("%02x", (int) c));
	    }

	    b.reverse();
	    return Base64.getEncoder().encodeToString(b.toString().getBytes());
	}
	
	/** TODO: Añade descifrado */
}
