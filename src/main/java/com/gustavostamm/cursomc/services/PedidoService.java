package com.gustavostamm.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavostamm.cursomc.domain.Pedido;
import com.gustavostamm.cursomc.repositories.PedidoRepository;
import com.gustavostamm.cursomc.services.exceptions.ObjetctNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetctNotFoundException(
				"Objeto não encontrado! Id: " + id + ", tipo: " + Pedido.class.getName()));
	}

	
}
