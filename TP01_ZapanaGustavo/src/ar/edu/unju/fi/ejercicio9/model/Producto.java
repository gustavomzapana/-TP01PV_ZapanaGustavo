package ar.edu.unju.fi.ejercicio9.model;

public class Producto {

	private String nombre;
	private String codigo;
	private float precio;
	private int descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String nombre, String codigo, float precio, int descuento) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public float calcularDescuento() {
		float montoDescuento = (this.getPrecio()*this.getDescuento())/100;
		return this.getPrecio()-montoDescuento;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", descuento=" + descuento
				+ "]";
	}
}