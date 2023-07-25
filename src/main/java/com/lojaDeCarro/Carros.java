package com.lojaDeCarro;

import java.util.Random;

import org.hibernate.annotations.OnDelete;

public class Carros {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private double preco;
	private int numeroChassi;

	public Carros() {
	}

	public Carros(String marca, String modelo, String cor, int ano, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.preco = preco;
		gerarChassi();

	}

	@Override
	public String toString() {
		return " marca=" + marca + "\n modelo=" + modelo + "\n cor=" + cor + "\n ano=" + ano + "\n preco=" + preco
				+ "\n numeroChassi=" + numeroChassi;
	}

	private void gerarChassi() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(100000);
		this.numeroChassi = chassi;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(int numeroChassi) {
		this.numeroChassi = numeroChassi;
	}
}
