package demo.apirestSpringBoot.apiLatinosTravel.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.apirestSpringBoot.apiLatinosTravel.models.dao.IPaisDao;
import demo.apirestSpringBoot.apiLatinosTravel.models.entity.Pais;

@Service
public class PaisServiceImpl implements IPaisService {

	@Autowired
	private IPaisDao paisDao;

	@Override
	@Transactional
	public List<Pais> findAll(){
		return (List<Pais>)paisDao.findAll();
	}
	
	@Override
	@Transactional
	public Pais save(Pais pais) {
		return paisDao.save(pais);
	}
	
	@Override
	@Transactional
	public Pais findById(Long id) {
		return paisDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Pais delete(Pais pais) {
		paisDao.delete(pais);
		return pais;
	}
}
