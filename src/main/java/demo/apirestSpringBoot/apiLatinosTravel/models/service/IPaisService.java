package demo.apirestSpringBoot.apiLatinosTravel.models.service;

import java.util.List;

import demo.apirestSpringBoot.apiLatinosTravel.models.entity.Pais;

public interface IPaisService {
	
	public List<Pais> findAll();
	
	public Pais save(Pais pais);
	
	public Pais findById(Long id);
	
	public Pais delete(Pais pais);

}
