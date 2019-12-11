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

import com.cyberaid.cyberaid.models.Ong;
import com.cyberaid.cyberaid.repository.OngRepository;

@RestController
@RequestMapping(value = "/api/ongs")
public class OngResource {


	@Autowired
	OngRepository ongRepository;

	@GetMapping
	public List<Ong> listaOng() {
		return ongRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Ong> listaOngUnico(@PathVariable(value = "id") long id) {
		return ongRepository.findById(id);
	}

	@PostMapping
	public Ong salvaOng(@RequestBody Ong ong) {
		return ongRepository.save(ong);
	}

	@DeleteMapping("/{id}")
	public void deletaOng(@RequestBody Ong ong) {
		ongRepository.delete(ong);
	}

	@PutMapping("/ong")
	public Ong atualizaOng(@RequestBody Ong ong) {
		return ongRepository.save(ong);
	}
}