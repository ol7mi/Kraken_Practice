package com.kedu.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class PracticeController {
	
	@PostMapping
	public ResponseEntity<Void> practice(){	
		System.out.println("오징어 연습");
		return ResponseEntity.ok().build();
	}
}
