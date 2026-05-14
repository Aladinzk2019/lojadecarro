package entities;

public class Carro {

	private String modelo;
	private double preco;
	private boolean vendido;
	private int quantidade;

	public Carro(String modelo, double preco) {

		this.modelo = modelo;
		this.preco = preco;
		this.vendido = false;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPreco() {
		return preco;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void vender() {
		this.vendido = true;
	}
}