package demo.apirestSpringBoot.apiLatinosTravel.models.dao;

import org.springframework.data.repository.CrudRepository;

import demo.apirestSpringBoot.apiLatinosTravel.models.entity.Pasajero;

public interface IPasajeroDao extends CrudRepository<Pasajero, Long> {

}
