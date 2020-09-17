package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findByDescricao(String descricao);

}
