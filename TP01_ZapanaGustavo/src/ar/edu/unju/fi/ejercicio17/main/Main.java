package ar.edu.unju.fi.ejercicio17.main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		 //Arraylist
		List<Jugador> listaJugadores = new ArrayList<>();
		int opcion;
		
		do {
			System.out.println(menu());
			opcion = ingresoNumero(scanner,"Ingrese opcion: ");
			
			switch(opcion) {
			case 1: 
				altaJugador(scanner,listaJugadores);
				break;
			case 2:
				gestionarJugador(scanner,listaJugadores,opcion);
				break;
			case 3: 
				mostrarJugadores(listaJugadores);
				break;
			case 4:
				gestionarJugador(scanner,listaJugadores,opcion);
				break;
			case 5: 
				gestionarJugador(scanner,listaJugadores,opcion);
				break;
			case 6:
				int a = cantidadJugadores(scanner, listaJugadores,true);
				System.out.println("La cantidad de jugadores es: "+ a);
				break;
			case 7: 
				int b = cantidadJugadores(scanner, listaJugadores,false);
				System.out.println("La cantidad de jugadores de la nacionalidad son: "+ b);
				break;
			case 8:
				System.out.println("Fin Programa.");
				break;
			default:
				System.out.println("ERROR. Ingrese una opcion valida.");
			}

			
		}while (opcion!=8);

     
	}
	public static String menu(){
		return "\n1 – Alta de jugador \n 2 – Mostrar los datos del jugador\n 3 – Mostrar todos los jugadores ordenados por apellido\n " +
				 "4 - Modificar los datos de un jugador \n 5 – Eliminar un jugador \n 6 – Mostrar la cantidad total de jugadores \n" +
				 "7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad \n 8 – Salir\n";
	}
	public static void altaJugador (Scanner scanner,List <Jugador> jugadores) {
		Jugador jugador = new Jugador();
		
			jugador.setNombre(ingresoCadena(scanner,"Ingrese nombre: "));
			jugador.setApellido(ingresoCadena(scanner, "Ingrese apellido: "));
			jugador.setFechaNac(ingresoFecha(scanner, "Ingrese fecha: "));
			jugador.setNacionalidad(ingresoCadena(scanner,"Ingrese nacionalidad: "));
			jugador.setEstatura(ingresoNumero(scanner,"Ingrese estatura(valor decimal): "));
			jugador.setPeso(ingresoNumero(scanner,"Ingrese peso(valor decimal): "));
			jugador.setPosicion(ingresoPosicion(scanner,"Ingrese posicion: "));
		
		jugadores.add(jugador);
	}
	
	public static String ingresoCadena(Scanner scanner, String frase) {
		System.out.println(frase);
		String cadena = scanner.next();
		return cadena;
	}
	
	public static LocalDate ingresoFecha(Scanner scanner, String frase) {
		LocalDate fecha = null;
		int anio,mes,dia;
				
		        anio = ingresoNumero(scanner,frase + "\nIngrese año: ");
		    	mes = ingresoNumero(scanner,"Ingrese mes: ");
		    	dia = ingresoNumero(scanner,"Ingrese dia: ");
		    	fecha = LocalDate.of(anio,mes,dia);

		return fecha;
	}
	
	
	public static int ingresoNumero(Scanner scanner, String frase) {
		int n=0;
		do {
			System.out.println(frase);
			n = scanner.nextInt();
			if (n<=0) {
				System.out.println("\n ERROR. Debe ingresar un N° positivo.\n"); 
			}
		 } while (n<=0);
		return n;
	}
	
	
	public static String determinarPosicion(int opc) {
		if (opc==1) {
			return "Delantero";
		}
		else if(opc==2) {
			return "Medio";
		}
		else {
			return (opc==3) ? "Defensa" : "Arquero";
		}
	}
	
	
	
	public static String ingresoPosicion(Scanner scanner, String frase) {
		int opc= -1;
		do { 
			
			System.out.println("\n 1 – Delantero\n 2 – Medio\n 3 – Defensa\n 4 - Arquero\n");
		     try {
		    	 opc = ingresoNumero(scanner, "Ingrese opcion: ");
		    			 
		     } catch(InputMismatchException e) {
		    	 scanner.nextLine();
		    	 System.out.println("ERROR. Ingrese un numero valido.");
		    	 continue; 	 
		     }
		     if(opc<1 || opc>4)
		    	 System.out.println("Ingrese una posicion valida.");
			
		}while(opc<1 || opc>4);
    return determinarPosicion(opc);		
	}
	
	
	public static int buscarJugador(List<Jugador> jugadores, String nombre, String apellido) {
	    Iterator<Jugador> iteratorJugadores = jugadores.iterator();
	    int i=0;
	    boolean encontrado=false;
	    while (iteratorJugadores.hasNext() && !encontrado) {
	    	Jugador jug = iteratorJugadores.next();
	    	if(jug.getNombre().equalsIgnoreCase(nombre) && jug.getApellido().equalsIgnoreCase(apellido)) {
	    		encontrado = true;
	    		continue;
	    	}
	     i++;    
	    }
		if(encontrado)
			return i;
		else
		    return -1;
	}
	
	
	public static void modificarJugador(Scanner scanner, List<Jugador> jugadores, int pos){
	    int opc;
	    do { System.out.println("\n 1 - Nombre\n 2 - Apellido\n 3 - Fecha de nacimiento\n 4 - Nacionalidad\n 5 - Estatura\n 6 - Peso\n 7 - Posición\n 8 - Salir");
	    	 opc = ingresoNumero(scanner,"Ingrese opcion: ");
	    	 
	    	 if(opc>=1 && opc<=8) {
	    		 
	    		Jugador jugador = jugadores.get(pos);
	    		switch(opc) {
	    		case 1:
	    	        jugador.setNombre(ingresoCadena(scanner,"Ingrese nuevo nombre: "));
	 			break;
	    		case 2: 
	    			jugador.setApellido(ingresoCadena(scanner, "Ingrese nuevo apellido: "));
	    		break;
	    		case 3: 
	    			jugador.setFechaNac(ingresoFecha(scanner, "Ingrese nueva fecha: "));
	    		break;
	    		case 4: 
	    			jugador.setNacionalidad(ingresoCadena(scanner,"Ingrese nueva nacionalidad: "));
	    		break;
	    		case 5:
	    			jugador.setEstatura(ingresoNumero(scanner,"Ingrese nueva estatura(valor decimal): "));
	    		break;
	    		case 6: 
	    			jugador.setPeso(ingresoNumero(scanner,"Ingrese nuevo peso(valor decimal): "));
	    		break;
	    		case 7: 
	    			jugador.setPosicion(ingresoPosicion(scanner,"Ingrese nueva posicion: "));
	    		break;
	    		}
	    	 }
	    	 else
	    		 System.out.println("\n Opcion incorrecta.");
	    	 
	    }while(opc!=8);
	}
	
	
	
	public static void gestionarJugador(Scanner scanner, List<Jugador> jugadores,int op) {
		String nombre = ingresoCadena(scanner,"Ingrese nombre: ");
		String apellido = ingresoCadena(scanner, "ingrese apellido: ");
		int pos = buscarJugador(jugadores,nombre, apellido);
		if(pos==-1) {
			System.out.println("No se encontro el jugador.");	
		}
		else {
			if(op==2) {
				System.out.println(jugadores.get(pos).toString());
			}
			else if (op == 4) {
				modificarJugador(scanner,jugadores,pos);
			}
			else
				jugadores.remove(pos);
		}
	}

	
	public static void mostrarJugadores(List<Jugador> jugadores) {
		if (jugadores.isEmpty()) {
			System.out.println("\nLa lista de jugadores se encuentra vacía\n");
		}
		else {
			jugadores.sort(Comparator.comparing(Jugador::getApellido));
			jugadores.forEach(jug -> System.out.println(jug.toString()));
		}
	}
	
	
	public static int cantidadJugadores(Scanner scanner, List<Jugador> jugadores, boolean op) {
		int contador = jugadores.size();
		if (!op) {
			String pais = ingresoCadena(scanner,"Ingrese nacionalidad: ");
			for (int i=0;i<jugadores.size();i++) {
				if (!jugadores.get(i).getNacionalidad().equalsIgnoreCase(pais)) {
					contador--;
				}
			} 
		}
		return contador;
	}
}


