package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = ingresarNumero();
		
		CalculadoraEspecial nueva = new CalculadoraEspecial(n);
		System.out.println("Sumatoria: "+nueva.calcularSumatoria());
		System.out.println("Productoria: "+nueva.calcularProductoria());
	}
	
	public static int ingresarNumero() {
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Ingrese valor positivo: ");
			n = scanner.nextInt();
			if (n<=0) {
				System.out.println("Error: El numero debe ser positivo");
			}
		} while (n<=0);
		scanner.close();
		return n;
	}

}
