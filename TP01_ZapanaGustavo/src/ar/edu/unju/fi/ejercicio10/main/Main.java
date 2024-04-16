package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=3;i++) {
			Pizza nuevaPizza = crearPizza();
			System.out.println("Pizza "+i);
			nuevaPizza.mostrarDatos();
		}
	}
	
	public static Pizza crearPizza() {
		String opcion = elegirOpcion(true);
		String opcion2 = elegirOpcion(false);
		Pizza piz = new Pizza();
		piz.setDiametro(generarNumero(opcion));
		piz.setIngredientesEspeciales(opcion2.equals("s") || opcion.equals("S"));
		piz.setPrecio(piz.calcularPrecio());
		piz.setArea(piz.calcularArea());
		return piz;
	}
	
	public static String elegirOpcion(boolean op) {
		Scanner scanner = new Scanner(System.in);
		String opcion;
		if (op) {
			do {
				System.out.println("a) Pizza pequeña\nb)Pizza mediana\nc)Pizza Grande\nIngrese opcion: ");
				opcion = scanner.next();
				if (!opcion.equals("a") && !opcion.equals("b") && !opcion.equals("c")) { 
					System.out.println("Opcion invalida");
				}
			} while (!opcion.equals("a") && !opcion.equals("b") && !opcion.equals("c"));
		}
		else {
			System.out.println("¿Ingredientes especiales(s/n)?\nIngrese respuesta: ");
			opcion = scanner.next();
		}
		//scanner.close();
		return opcion;
	}
	
	public static int generarNumero(String opcion) {
		if (opcion.equals("a")) {
			return 20;
		}
		else if (opcion.equals("b")) {
			return 30;
		}
		else {
			return 40;
		}
	}

}
