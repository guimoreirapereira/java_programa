package br.java.model;

import java.util.Objects;

public class Carro {

	private int ligado;
	private int rodas;
	private int placa;
	
	public Carro() {
	}

	public Carro(int ligado, int rodas, int placa) {
		this.ligado = ligado;
		this.rodas = rodas;
		this.placa = placa;
	}

	public int getLigado() {
		return ligado;
	}

	public void setLigado(int ligado) {
		this.ligado = ligado;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ligado, placa, rodas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return ligado == other.ligado && placa == other.placa && rodas == other.rodas;
	}

	@Override
	public String toString() {
		return "Carro [ligado=" + ligado + ", rodas=" + rodas + ", placa=" + placa + "]";
	}
	
	

}
