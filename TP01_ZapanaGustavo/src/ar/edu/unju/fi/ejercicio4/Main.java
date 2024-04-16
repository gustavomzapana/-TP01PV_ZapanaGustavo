package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		int res = 1;
		int orig;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un valor entero entre 0 y 10");
		int num = scanner.nextInt();
		
		while(num<0 || num>10) {
			System.out.println("Valor incorrecto, ingrese nuevamente");
			 num = scanner.nextInt();
		}
		orig = num;
        while(num>=1) {
        	res = res * num;
        	num--;
        }
        System.out.println("El factorial de "+orig+" es "+res);
	}

}
