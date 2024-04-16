package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial  {
	
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public CalculadoraEspecial(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double calcularSumatoria() {
		double resultado=0;
		for (int k=1;k<=n;k++) {
			resultado=resultado+Math.pow((k*(k+1))/2,2);
		}
		return resultado;
	}
	
	public double calcularProductoria() {
		double resultado=0;
		for (int k=1;k<=n;k++) {
			resultado=resultado+k*(k+4);
		}
		return resultado;
	}
	
}
