package com.cyberaid.cyberaid.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyberaid.cyberaid.models.Doacao;
import com.cyberaid.cyberaid.models.Doador;
import com.cyberaid.cyberaid.repository.DoacaoRepository;

@RestController
@RequestMapping(value = "/api/doacoes")
public class DoacaoResource {

	@Autowired
	DoacaoRepository doacaoRepository;

	@GetMapping
	public List<Doacao> listaDoacao() {
		return doacaoRepository.findAll();
	}

	@PostMapping("/doacao")
	public Doacao salvaDoacao(@RequestBody Doacao doacao) {
		return doacaoRepository.save(doacao);
	}

}
