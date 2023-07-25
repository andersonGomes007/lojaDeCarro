package com.lojaDeCarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Loja {
	@Autowired
	private CarrosNovosRepostory carrosNovosRep;
	@Autowired
	private CarrosUsadosRepostory carrosUsadosRep;

	public void exibirMenu() {
		boolean continuaMostrandoMenu = true;
		while (continuaMostrandoMenu) {
			try {
				System.out.println("-------------------");
				System.out.println("| Loja de Carros  |");
				System.out.println("-------------------");
				System.out.println("");
				System.out.println("0. Cadastrar carro");
				System.out.println("1. Listar todos os Carros");
				System.out.println("2. Listar Carros novos   ");
				System.out.println("3. Listar Carros usados  ");
				System.out.println("4. Comprar Carro     ");
				System.out.println("5. Sair                 ");
				System.out.println("");
				System.out.println("Digite Sua Opcao        ");
				System.out.println("");
				int opcao = Teclado.leInt();

				switch (opcao) {

				case 0:
					System.out.println("Digite a marca: ");
					String marca = Teclado.leString();
					System.out.println("Digite o modelo: ");
					String modelo = Teclado.leString();
					System.out.println("Digite a cor: ");
					String cor = Teclado.leString();

					CarrosNovos carroNovo = new CarrosNovos();
					carroNovo.setMarca(marca);
					carroNovo.setModelo(modelo);
					carroNovo.setCor(cor);

					carrosNovosRep.save(carroNovo);

					break;
				case 1: {
					for (CarrosNovos carro : carrosNovosRep.findAll()) {
						System.out.println(carro);
						System.out.println("");
						System.out.println("------------------------");
					}
					for (CarrosUsados carro : carrosUsadosRep.findAll()) {
						System.out.println(carro);
						System.out.println("");
						System.out.println("------------------------");

					}
					break;
				}
				case 2: {
					for (CarrosNovos carro : carrosNovosRep.findAll()) {
						System.out.println(carro);
						System.out.println("");
						System.out.println("------------------------");
					}
					break;
				}
				case 3: {
					for (CarrosUsados carro : carrosUsadosRep.findAll()) {
						System.out.println(carro);
						System.out.println("");
						System.out.println("------------------------");

					}
					break;
				}
				case 4: {

					System.out.println("Qual carro voce deseja comprar? ");
					for (CarrosNovos carro : carrosNovosRep.findAll()) {
						System.out.println("------------------------");
						System.out.println(carro);

					}
					Long c = (long) Teclado.leInt();
					carrosNovosRep.deleteById(c);
					System.out.println("Voce comprou o carro " + c);
					break;

				}
				case 5: {
					System.out.println("Ate a proxima");
					continuaMostrandoMenu = false;
					break;
				}
				default:
					throw new OpcaoErradaException("Essa Opcao nao Existe ");

				}
			} catch (OpcaoErradaException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}

//	public CarrosNovosRepostory getCarrosNovosRep() {
//		return carrosNovosRep;
//	}
//
//	public void setCarrosNovosRep(CarrosNovosRepostory carrosNovosRep) {
//		this.carrosNovosRep = carrosNovosRep;
//	}
//
//	public CarrosUsadosRepostory getCarrosUsadosRep() {
//		return carrosUsadosRep;
//	}
//
//	public void setCarrosUsadosRep(CarrosUsadosRepostory carrosUsadosRep) {
//		this.carrosUsadosRep = carrosUsadosRep;
//	}
//}
