package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//import libreria scanner
		Scanner scanner = new Scanner(System.in);
		
		Persona persona =  crearPersona();
	
		persona.mostrarPersona();
	
		
	  }
	
   public static Persona crearPersona(){
	
	     Scanner scanner = new Scanner(System.in);
	     
	      System.out.println("Ingrese Nombre");
			String nombre = scanner.next();	
			
			Calendar fechaNac = crearFecha();
			
			Persona perso = new Persona(nombre,fechaNac);
			
			return perso;
   }
	public static Calendar crearFecha (){
		
		 Scanner scanner = new Scanner(System.in);
		
		  //Ingreso de datos
	     System.out.println("Ingrese Año de Nacimiento");
	     int anio = scanner.nextInt();
	     
	     System.out.println("Ingrese Mes de Nacimiento");
	     int mes = scanner.nextInt();
	     
	     System.out.println("Ingrese  Dia de Nacimiento");
	     int dia = scanner.nextInt();
	     
	     // creacion y asignacion de calendar
	     Calendar fechaN = Calendar.getInstance();
	     fechaN.set(anio,mes-1,dia);
	     
	     return fechaN;
      }
    }
