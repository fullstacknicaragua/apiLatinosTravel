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

import demo.apirestSpringBoot.apiLatinosTravel.models.entity.Pasajero;
import demo.apirestSpringBoot.apiLatinosTravel.models.service.IPasajeroService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PasajeroController {

	@Autowired
	private IPasajeroService pasajeroService;
	
	@GetMapping("/pasajero")
	public List<Pasajero> index(){
		return this.pasajeroService.findAll();
	}
	@GetMapping("/pasajero/id")
	public Pasajero show(@PathVariable Long id) {
		return this.pasajeroService.findById(id);
	}
	@PostMapping("/pasajero")
	@ResponseStatus(HttpStatus.CREATED)
	public Pasajero create(@RequestBody Pasajero pasajero) {
		return this.pasajeroService.save(pasajero);
	}
	
	@PutMapping("/pasajero/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pasajero update(@RequestBody Pasajero pasajero, @PathVariable Long id) {
		Pasajero currentPasajero = this.pasajeroService.findById(id);
		currentPasajero.setPrimerNombre(pasajero.getPrimerNombre());
		currentPasajero.setSegundoNombre(pasajero.getSegundoNombre());
		currentPasajero.setPrimerApellido(pasajero.getPrimerApellido());
		currentPasajero.setSegundoApellido(pasajero.getSegundoApellido());
		currentPasajero.setFechaNacimiento(pasajero.getFechaNacimiento());
		currentPasajero.setNum_Documento(pasajero.getNum_Documento());
		currentPasajero.setTelefono(pasajero.getTelefono());
		currentPasajero.setEmail(pasajero.getEmail());
		currentPasajero.setClave(pasajero.getClave());
		currentPasajero.setTipo_Documento(pasajero.getTipo_Documento());
		this.pasajeroService.save(currentPasajero);
		return currentPasajero;
	}
	@DeleteMapping("/pasajero/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Pasajero currentPasajero = this.pasajeroService.findById(id);
		this.pasajeroService.delete(currentPasajero);
	}
}
