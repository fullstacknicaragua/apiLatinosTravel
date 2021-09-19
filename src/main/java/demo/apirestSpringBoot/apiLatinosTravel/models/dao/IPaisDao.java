package demo.apirestSpringBoot.apiLatinosTravel.models.dao;

import org.springframework.data.repository.CrudRepository;

import demo.apirestSpringBoot.apiLatinosTravel.models.entity.Pais;

public interface IPaisDao extends CrudRepository<Pais, Long> {
	
}
