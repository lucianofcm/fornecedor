package com.microservices.fornecedor.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraDTO {
	private List<ItemCompraDTO> itensCompra;
}
