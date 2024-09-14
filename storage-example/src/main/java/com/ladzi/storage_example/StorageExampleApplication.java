package com.ladzi.storage_example;

import com.ladzi.storage_example.service.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/x")
public class StorageExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorageExampleApplication.class, args);
	}

	private final StorageService storageService;
	@PostMapping
	public ResponseEntity<?> addProduct(@RequestParam("image")MultipartFile file) throws IOException {
		String s = storageService.uploadImage(file);
		return new ResponseEntity<>(s, HttpStatus.OK);
	}

	@GetMapping("/{imageName}")
	public ResponseEntity<?> getProduct(@PathVariable String imageName){
		byte[] image = storageService.downloadImage(imageName);
		return ResponseEntity
				.status(HttpStatus.OK)
				.contentType(MediaType.valueOf("image/png"))
				.body(image);
	}
}
