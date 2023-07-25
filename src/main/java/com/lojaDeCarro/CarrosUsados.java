package com.lojaDeCarro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarrosUsados extends Carros {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public CarrosUsados(String marca, String modelo, String cor, int ano, double preco) {
		super(marca, modelo, cor, ano, preco);

	}
}
