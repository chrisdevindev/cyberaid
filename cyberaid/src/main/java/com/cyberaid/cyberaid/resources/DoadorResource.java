package com.cyberaid.cyberaid.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyberaid.cyberaid.models.Doador;
import com.cyberaid.cyberaid.repository.DoadorRepository;

@RestController
@RequestMapping(value = "/api/doadores")
public class DoadorResource {
//testando
	@Autowired
	DoadorRepository doadorRepository;

	@GetMapping
	public List<Doador> listaDoadores() {
		return doadorRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Doador> listaDoadorUnico(@PathVariable(value = "id") long id) {
		return doadorRepository.findById(id);
	}

	@PostMapping
	public Doador salvaDoador(@RequestBody Doador doador) {
		return doadorRepository.save(doador);
	}

	@DeleteMapping("/{id}")
	public void deletaDoador(@RequestBody Doador doador) {
		doadorRepository.delete(doador);
	}

	@PutMapping("/doador")
	public Doador atualizaDoador(@RequestBody Doador doador) {
		return doadorRepository.save(doador);
	}
}
