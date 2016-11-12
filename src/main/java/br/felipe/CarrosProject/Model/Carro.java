package br.felipe.CarrosProject.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Carro{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String marca;
	private String modelo;
	
	public Carro(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Carro(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
}
