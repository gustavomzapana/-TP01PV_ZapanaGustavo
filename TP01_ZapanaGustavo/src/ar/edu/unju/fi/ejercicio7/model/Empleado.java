package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String nombre;
	private int legajo;
	private double salario;
	public static final double SALARIO_MIN = 210000.00;
	public static final double AUMENTO = 20000.00;
	
	//Constructor parametrizado}
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario>=SALARIO_MIN) {
			this.salario = salario;
		}
		else {
			this.salario = SALARIO_MIN;
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void darAumento() {
		this.setSalario(this.getSalario()+AUMENTO);
	}

	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+this.getNombre());
		System.out.println("Legajo: "+this.getLegajo());
		System.out.println("Salario $: "+this.getSalario());
	}
	

	}

