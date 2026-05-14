package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Carro;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			ArrayList<Carro> carros = new ArrayList<>();

			carros.add(new Carro("Porsche 911", 900000));
			carros.add(new Carro("BMW X6", 500000));
			carros.add(new Carro("Audi R8", 700000));
			carros.add(new Carro("Lamborghini Huracan", 3200000));
			carros.add(new Carro("Ferrari F8", 4500000));
			carros.add(new Carro("McLaren 720S", 3800000));
			carros.add(new Carro("Mercedes AMG GT", 1500000));
			carros.add(new Carro("Rolls-Royce Ghost", 5000000));
			carros.add(new Carro("Bentley Continental GT", 3500000));
			carros.add(new Carro("Aston Martin DB11", 2800000));
			carros.add(new Carro("Maserati Levante", 1200000));
			carros.add(new Carro("Range Rover Sport", 950000));
			carros.add(new Carro("Tesla Model S Plaid", 1100000));
			carros.add(new Carro("Jaguar F-Type", 850000));
			carros.add(new Carro("Corvette C8", 1300000));
			carros.add(new Carro("Porsche 911", 900000));
			carros.add(new Carro("Porsche 911", 900000));
			carros.add(new Carro("Porsche 911", 900000));

			int opcao = 0;

			double dinheiro = 0;

			while (opcao != 5) {

				System.out.println("\n===== LOJA DE CARROS DE LUXO =====");	
				System.out.println("1 - Cadastrar carro");
				System.out.println("2 - Listar carros");
				System.out.println("3 - Vender carro");
				System.out.println("4 - Ver dinheiro da loja");
				System.out.println("5 - Sair");
				System.out.print("Escolha uma opção: ");

				opcao = sc.nextInt();
				sc.nextLine();

				if (opcao == 1) {

					System.out.print("Digite o modelo: ");
					String modelo = sc.nextLine();

					System.out.print("Digite o preço: ");
					double preco = sc.nextDouble();

					carros.add(new Carro(modelo, preco));

					System.out.println("Carro cadastrado com sucesso!");
				}

				else if (opcao == 2) {

					System.out.println("\n===== LISTA DE CARROS =====");

					for (Carro c : carros) {

						System.out.println(c.getModelo() + " | R$ " + c.getPreco());
					}
				}

				else if (opcao == 3) {

					System.out.println("\n===== CARROS DISPONÍVEIS =====");

					for (Carro c : carros) {

						System.out.println(c.getModelo() + " | R$ " + c.getPreco());
					}

					System.out.print("\nDigite o nome do carro: ");
					String nome = sc.nextLine();

					Carro carroRemover = null;

					for (Carro c : carros) {

						if (c.getModelo().equalsIgnoreCase(nome)) {

							carroRemover = c;
						}
					}

					if (carroRemover != null) {

						dinheiro += carroRemover.getPreco();

						carros.remove(carroRemover);

						System.out.println("Carro vendido com sucesso!");
					} else {

						System.out.println("Carro não encontrado!");
					}
				}

				else if (opcao == 4) {

					System.out.println("\nDinheiro da loja: R$ " + dinheiro);
				}
			}

			System.out.println("Sistema encerrado!");
		}
	}
}