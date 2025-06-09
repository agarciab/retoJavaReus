package com.vn.reus.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vn.reus.service.ExifService;

@RestController
@RequestMapping("/exif")
public class ExifController {

    private ExifService exifService;

    public ExifController(ExifService exifService) {
		this.exifService = exifService;
	}

	@PostMapping("")
    public Map<String, String> extract(@RequestParam("file") MultipartFile file) {
        return exifService.extractExifTags(file);
    }
}
