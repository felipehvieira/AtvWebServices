package br.felipe.CarrosProject.Model;

public class Carro {

	private String marca;
	private String modelo;
	
	public Carro(){
		
	}

	public Carro(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
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

	@Override
	public String toString() {
		return "[marca=" + marca + ", modelo=" + modelo + "]";
	}
	

}
