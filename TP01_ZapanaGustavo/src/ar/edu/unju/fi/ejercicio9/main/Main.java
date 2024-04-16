package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while (i<3) {
			Producto nuevoProducto = crearProducto();
			System.out.println(nuevoProducto.toString());
			System.out.println("Precio con descuento: "+nuevoProducto.calcularDescuento());
			i++;
		}
	}
	
	public static Producto crearProducto() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre del producto: ");
		String nombre = scanner.next();
		System.out.println("Ingrese codigo: ");
		String codigo = scanner.next();
		System.out.println("Ingrese precio: ");
		float precio = scanner.nextFloat();
		int descuento;
		do {
			System.out.println("Ingrese porcentaje de descuento [entre 0 y 50]: ");
			descuento = scanner.nextInt();
			if (descuento<0 || descuento>50 ) {
				System.out.println("Error: El porcentaje debe estar en el rango [0,50]");
			}
		} while (descuento<0 || descuento>50);
		Producto prod = new Producto(nombre,codigo,precio,descuento);
		//scanner.close();
		return prod; 
	}

}