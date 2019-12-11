package com.cyberaid.cyberaid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyberaid.cyberaid.models.Doacao;
import com.cyberaid.cyberaid.models.Doador;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {

}
