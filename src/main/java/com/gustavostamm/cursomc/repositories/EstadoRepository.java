package com.gustavostamm.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavostamm.cursomc.domain.Categoria;
import com.gustavostamm.cursomc.domain.Cidade;
import com.gustavostamm.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
