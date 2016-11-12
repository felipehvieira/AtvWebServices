package br.felipe.CarrosProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.felipe.CarrosProject.Model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer> {

}