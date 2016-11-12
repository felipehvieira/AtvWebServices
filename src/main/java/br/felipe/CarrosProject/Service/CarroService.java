package br.felipe.CarrosProject.Service;

import java.util.List;

import br.felipe.CarrosProject.Model.Carro;

public interface CarroService {
	Carro save(Carro carro);
	Carro getbyId(int id);
	List<Carro> listAllCars();
	Carro deleteById(int id);
	Carro updateById(Carro carro);
}
