package demo.apirestSpringBoot.apiLatinosTravel.models.service;

import java.util.List;
import demo.apirestSpringBoot.apiLatinosTravel.models.entity.Pasajero;

public interface IPasajeroService {
	
	public List<Pasajero> findAll();
	
	public Pasajero save(Pasajero pasajero);
	
	public Pasajero findById(Long id);
	
	public Pasajero delete(Pasajero pasajero);

}
