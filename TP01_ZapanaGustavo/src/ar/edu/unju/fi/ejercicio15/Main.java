package ar.edu.unju.si.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte num;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("Ingrese un N° Entero para el arreglo[5-10]");
		num = scanner.nextByte();
		
		if(num <5 || num >10) 
		  System.out.println("Dato mal ingresado, reintente nuevamente");
	
		} while (num <5 || num >10);
		
		 //creacion del array (arreglo) con el n° ingresado
		String [] cadenas = new String [num];
		
		for(int i = 0; i<cadenas.length ; i++)
		{
			System.out.println("Ingrese nombre: ");
			cadenas [i] = scanner.next();
		}
		
		for(int i = 0; i<cadenas.length ; i++) {
			
			System.out.println("Indice: "+ i + "| Nombre almacenado: "+cadenas[i] );
		}
		
		System.out.println("----------ORDEN INVERSO---------");
        for(int j = cadenas.length-1; j>=0 ; j--) {
			
			System.out.println("Indice: "+ j + "| Nombre almacenado: "+cadenas[j] );
		}
	}

}
