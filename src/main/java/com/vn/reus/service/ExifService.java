package com.vn.reus.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface ExifService {

	Map<String, String> extractExifTags(MultipartFile file);

}
