package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un numero entero entre 1 y 9");
        num = scanner.nextInt();
        
        while(num<1 || num >9) {
        	System.out.println("Valor incorrecto. Ingrese nuevamente");
        	num = scanner.nextInt();
        }
        
        for(i=0;i<=10;i++)
        {
        	System.out.println(num+" x "+i+" = "+(num*i));
        }
	}

}
