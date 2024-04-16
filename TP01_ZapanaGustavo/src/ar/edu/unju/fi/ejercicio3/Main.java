package ar.unju.edu.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un N° entero");
		int num = scanner.nextInt();
		
		if(num%2==0)
		{
			res = num*3;
		}
		else
		{
			res = num*2;
		}
		System.out.println("El resutado es: "+res);
	

	}

}
