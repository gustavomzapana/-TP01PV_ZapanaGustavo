package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado nuevoEmpleado = crearEmpleado();
		nuevoEmpleado.mostrarDatos();
		nuevoEmpleado.darAumento();
		
		System.out.println("Datos actualizados (con el aumento)");
		nuevoEmpleado.mostrarDatos();
	}

	public static Empleado crearEmpleado() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Ingrese legajo: ");
		int legajo = scanner.nextInt();
		
		System.out.println("Ingrese salario: ");
		double salario = scanner.nextDouble();
		
		Empleado emp = new Empleado(nombre,legajo,salario);
		scanner.close();
		return emp;

	}

}
