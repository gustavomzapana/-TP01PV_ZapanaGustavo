package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//con constructor vacio
		Persona persona = new Persona();
		
		System.out.println("\n Ingrese DNI ");
        String dni = scanner.next();
		System.out.println("Ingrese Nombre");
		String nombre = scanner.next();
		System.out.println("Ingrese Año de Nacimiento");
		int anio = scanner.nextInt();
		System.out.println("Ingrese Mes de Nacimiento");
		int mes = scanner.nextInt();
		System.out.println("Ingrese  Dia de Nacimiento");
		int dia = scanner.nextInt();
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
		System.out.println("Ingrese Provincia");
		String provincia = scanner.next();
		
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fechaNacimiento);
		persona.setProvincia(provincia);
		persona.MostrarDatos();
		
		//con construcctor parametrizado
		System.out.println("\n Ingrese DNI");
		dni = scanner.next();
		System.out.println("Ingrese Nombre");
		nombre = scanner.next();
		System.out.println("Ingrese Año de Nacimiento");
        anio = scanner.nextInt();
		System.out.println("Ingrese Mes de Nacimiento");
		mes = scanner.nextInt();
		System.out.println("Ingrese  Dia de Nacimiento");
		dia = scanner.nextInt();
		fechaNacimiento = LocalDate.of(anio, mes, dia);
		System.out.println("Ingrese Provincia");
		provincia = scanner.next();
		
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
		persona2.MostrarDatos();
		
		// con constructor parametrizado sin el atributo JUJUY
		
		System.out.println("\n Ingrese DNI");
		dni = scanner.next();
		System.out.println("Ingrese Nombre");
		nombre = scanner.next();
		System.out.println("Ingrese Año de Nacimiento");
		anio = scanner.nextInt();
		System.out.println("Ingrese Mes de Nacimiento");
		mes = scanner.nextInt();
		System.out.println("Ingrese  Dia de Nacimiento");
		dia = scanner.nextInt();
		fechaNacimiento = LocalDate.of(anio, mes, dia);
		
		Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
		persona3.MostrarDatos();
	}
	
}