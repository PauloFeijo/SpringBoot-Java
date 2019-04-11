package com.feijo.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feijo.springboot.domain.Categoria;
import com.feijo.springboot.repositories.CategoriaRepository;
import com.feijo.springboot.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {

		Categoria cat = repo.findOne(id);

		if (cat == null) {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName());
		}
		return cat;
	}
}
