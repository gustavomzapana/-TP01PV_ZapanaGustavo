package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private float precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	private static final float ingredientesEspeciales20=500;
	private static final float ingredientesEspeciales30=750;
	private static final float ingredientesEspeciales40=1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	    
	}
	
	public double calcularArea() {
		return Math.PI*Math.pow(this.getDiametro()/2,2);
	}
	
	public float calcularPrecio() {
		if (this.getDiametro()==20) {
			return (this.isIngredientesEspeciales()) ? (4500+ingredientesEspeciales20) : 4500;
		}
		else if (this.getDiametro()==30) {
			return (this.isIngredientesEspeciales()) ? (4800+ingredientesEspeciales30) : 4800;
		}
		else {
			return (this.isIngredientesEspeciales()) ? (5500+ingredientesEspeciales40) : 5500;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Diametro = "+this.getDiametro());
		System.out.println("Ingredientes especiales = "+this.isIngredientesEspeciales());
		System.out.println("Precio Pizza = "+this.getPrecio());
		System.out.println("Area de la piza = "+this.getArea());
	}
	
}
