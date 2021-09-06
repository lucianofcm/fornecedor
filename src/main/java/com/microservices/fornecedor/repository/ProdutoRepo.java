package com.microservices.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.fornecedor.domain.Produto;

@Repository
public interface ProdutoRepo extends JpaRepository<Produto, Integer> {

}
