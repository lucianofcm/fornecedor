package com.microservices.fornecedor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.fornecedor.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@PostMapping
	public void realizarCompra(@RequestBody CompraDTO compra) {

	}
}
