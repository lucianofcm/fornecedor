package com.microservices.fornecedor.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.fornecedor.domain.Produto;
import com.microservices.fornecedor.repository.ProdutoRepo;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	ProdutoRepo produtoRepo;

	public ProdutoController(ProdutoRepo produtoRepo) {
		this.produtoRepo = produtoRepo;
	}

	@GetMapping("/")
	public ResponseEntity<List<Produto>> listarProdutos() {
		return new ResponseEntity<>(produtoRepo.findAll(), HttpStatus.OK);
	}
}
