package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num;
		int suma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("Ingrese un N° Entero para el arreglo[3-10]");
		num = scanner.nextByte();
		
		if(num <3 || num >10) 
		  System.out.println("Dato mal ingresado, reintente nuevamente");
	
		} while (num <3 || num >10);
		
		 //creacion del array (arreglo) con el n° ingresado
		int [] enteros = new int [num];
		
		for(int i = 0; i<enteros.length ; i++)
		{
			System.out.println("Ingrese numero: ");
			enteros [i] = scanner.nextInt();
		}
		
		for(int i = 0; i<enteros.length ; i++) {
			suma = suma + enteros[i];
			System.out.println("Indice: "+ i + "| Valor almacenado: "+enteros[i] );
		}
		System.out.println("La suma de los valores es: "+suma);
	}

}
