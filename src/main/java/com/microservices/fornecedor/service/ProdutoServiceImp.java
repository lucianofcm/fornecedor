package com.microservices.fornecedor.service;

import java.util.List;

import com.microservices.fornecedor.dto.ProdutoDTO;

public interface ProdutoServiceImp {
	List<ProdutoDTO> listarProdutos();
}
