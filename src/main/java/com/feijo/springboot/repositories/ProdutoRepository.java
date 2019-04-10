package com.feijo.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feijo.springboot.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
