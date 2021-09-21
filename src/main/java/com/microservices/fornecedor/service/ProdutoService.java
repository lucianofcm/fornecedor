package com.microservices.fornecedor.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import com.microservices.fornecedor.dto.ProdutoDTO;
import com.microservices.fornecedor.repository.ProdutoRepo;

@Service
public class ProdutoService implements ProdutoServiceImp {

	private ProdutoRepo produtoRepo;
	private ModelMapper modelMap;
	
	public ProdutoService(ProdutoRepo produtoRepo, ModelMapper modelMapper) {
		this.produtoRepo = produtoRepo;
		this.modelMap = modelMapper;
	}

	@Override
	public List<ProdutoDTO> listarProdutos() {
		return modelMap.map(produtoRepo.findAll(), new TypeToken<List<ProdutoDTO>>() {}.getType());
	}

}
