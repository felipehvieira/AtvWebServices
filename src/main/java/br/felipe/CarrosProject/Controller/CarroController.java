package br.felipe.CarrosProject.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.felipe.CarrosProject.Model.Carro;
import br.felipe.CarrosProject.Service.CarroService;

import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class CarroController {

	private final CarroService carroService;
	
	@Autowired
	public CarroController(final CarroService carroService){
		this.carroService = carroService;
	}
	@RequestMapping(value = "/carro", method = RequestMethod.GET)
	public ResponseEntity<List<Carro>> listAllCars(){
		return new ResponseEntity<List<Carro>>(carroService.listAllCars(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/carro/{id}", method = RequestMethod.GET)
	public ResponseEntity<Carro> buscaCarro(@PathVariable int id){
		return new ResponseEntity<Carro>(carroService.getbyId(id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/carro", method = RequestMethod.POST)
	public ResponseEntity<Carro> cadastraCarro(@RequestBody Carro carro){
		return new ResponseEntity<Carro>(carroService.save(carro), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/carro/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Carro> deleteCarro(@PathVariable int id){
		
		
		return new ResponseEntity<Carro>(carroService.deleteById(id) ,HttpStatus.OK);
	}
	@RequestMapping(value = "/carro/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Carro> updateCarro(@PathVariable int id , @RequestBody Carro carro){
		carro.setId(id);
		return new ResponseEntity<Carro>(carroService.updateById(carro), HttpStatus.OK);
	}
	
}
