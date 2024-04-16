package ar.edu.unju.fi.ejercicio6.model;
import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	

	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public int CalcularEdad() {
		int fnac = fechaNacimiento.getYear();
		int actual = LocalDate.now().getYear();
		return actual-fnac;
	}
	public boolean MayorEdad() {
		
		return CalcularEdad()>17;
	}
	public void MostrarDatos() {
		System.out.println("\n Datos de la Persona");
		System.out.println("\n DNI : "+this.dni);
		System.out.println("\n NOMBRE : "+this.nombre);
		System.out.println("\n FECHA DE NACIMIENTO : "+this.fechaNacimiento);
		System.out.println("\n PROVINCIA : "+this.provincia);
		System.out.println("\n EDAD : "+CalcularEdad());
		if(MayorEdad()) {
			System.out.print("\n LA PERSONA ES MAYOR DE EDAD");
		}
		else {
			System.out.println("\n LAPERSONA ES MENOR DE EDAD");
		}
	}


	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia= " JUJUY ";
	}

}





