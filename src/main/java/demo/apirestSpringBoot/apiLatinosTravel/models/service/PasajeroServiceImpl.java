package demo.apirestSpringBoot.apiLatinosTravel.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.apirestSpringBoot.apiLatinosTravel.models.dao.IPasajeroDao;
import demo.apirestSpringBoot.apiLatinosTravel.models.entity.Pasajero;

@Service
public class PasajeroServiceImpl implements IPasajeroService {

	@Autowired
	private IPasajeroDao pasajeroDao;

	@Override
	@Transactional
	public List<Pasajero> findAll(){
		return (List<Pasajero>)pasajeroDao.findAll();
	}
	
	@Override
	@Transactional
	public Pasajero save(Pasajero pasajero) {
		return pasajeroDao.save(pasajero);
	}
	
	@Override
	@Transactional
	public Pasajero findById(Long id) {
		return pasajeroDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Pasajero delete(Pasajero pasajero) {
		pasajeroDao.delete(pasajero);
		return pasajero;
	}
}
