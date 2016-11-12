package br.felipe.CarrosProject.Controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.felipe.CarrosProject.Model.Carro;

import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class CarroController {

	@RequestMapping(value = "carro", method = RequestMethod.GET)
	public String listaCarros(){
		return "Lista Carros";
	}
	@RequestMapping(value = "/carro", method = RequestMethod.POST)
	public String cadastraCarro(@RequestBody Carro carro){
		try {
			return "Carro Cadastrado "+ carro;
		} catch (Exception e) {
			return "Erro";
		}
	}
}
