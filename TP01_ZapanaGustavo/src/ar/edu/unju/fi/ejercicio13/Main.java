package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		int [] enteros = new int [8];
		
		for(int i = 0; i<enteros.length ; i++)
		{
			System.out.println("Ingrese numero: ");
			enteros [i] = scanner.nextInt();
		}
		
		for(int i = 0; i<enteros.length ; i++) {
			System.out.println("Indice: "+ i + "| Valor almacenado: "+enteros[i] );
		}
		
	}
	
}
