package com.microservices.fornecedor.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.fornecedor.dto.ProdutoDTO;
import com.microservices.fornecedor.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	private ProdutoService produtoService;

	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@GetMapping("/")
	public ResponseEntity<List<ProdutoDTO>> listarProdutos() {
		return new ResponseEntity<>(produtoService.listarProdutos(), HttpStatus.OK);
	}
}
