package br.felipe.CarrosProject.Service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.felipe.CarrosProject.Model.Carro;
import br.felipe.CarrosProject.Repository.CarroRepository;

@Service
@Validated
public class CarroServiceImpl implements CarroService {

	private final CarroRepository r;
	
	@Autowired
	public CarroServiceImpl(final CarroRepository r){
		this.r = r;
	}
	
	public List<Carro> listAllCars(){
		return r.findAll();
	}
	
	public Carro getbyId(int id){
		return r.findOne(id);
	}
	
	@Transactional
	public Carro save(@NotNull @Valid final Carro car){
		return r.save(car);
	}
	
	public Carro deleteById(int id){
		
		r.delete(id);
		return null;
	}
	
	public Carro updateById(Carro carro){
		return r.save(carro);
	}
}
