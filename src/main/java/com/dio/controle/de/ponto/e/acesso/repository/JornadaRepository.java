package com.dio.controle.de.ponto.e.acesso.repository;

import com.dio.controle.de.ponto.e.acesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {


}
