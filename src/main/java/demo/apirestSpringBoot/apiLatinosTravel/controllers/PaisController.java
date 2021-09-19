package demo.apirestSpringBoot.apiLatinosTravel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import demo.apirestSpringBoot.apiLatinosTravel.models.entity.Pais;
import demo.apirestSpringBoot.apiLatinosTravel.models.service.IPaisService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PaisController {

	@Autowired
	private IPaisService paisService;
	
	@GetMapping("/paises")
	public List<Pais> index(){
		return this.paisService.findAll();
	}
	@GetMapping("/paises/id")
	public Pais show(@PathVariable Long id) {
		return this.paisService.findById(id);
	}
	@PostMapping("/paises")
	@ResponseStatus(HttpStatus.CREATED)
	public Pais create(@RequestBody Pais pais) {
		return this.paisService.save(pais);
	}
	@PutMapping("/paises/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pais update(@RequestBody Pais pais, @PathVariable Long id) {
		Pais currentPais = this.paisService.findById(id);
		currentPais.setNombre(pais.getNombre());
		this.paisService.save(currentPais);
		return currentPais;
	}
	@DeleteMapping("/paises/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Pais currentPais = this.paisService.findById(id);
		this.paisService.delete(currentPais);
	}
}
