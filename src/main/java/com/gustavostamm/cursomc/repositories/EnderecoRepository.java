package com.gustavostamm.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavostamm.cursomc.domain.Categoria;
import com.gustavostamm.cursomc.domain.Cliente;
import com.gustavostamm.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
