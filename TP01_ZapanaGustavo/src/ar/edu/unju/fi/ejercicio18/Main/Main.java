package ar.edu.unju.fi.ejercicio18.Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.Model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.Model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		List<Pais> listaPaises = new ArrayList<>();
		List<DestinoTuristico> listaDestinos = new ArrayList<>();
		
		int opc;
		precargarPaises(listaPaises);
		do {
			System.out.println(menu());
			opc = ingresarNumero(scanner,"Ingrese opción: ");
			switch (opc) {
			    case 1:
					altaDestino(scanner,listaDestinos,listaPaises);
			    	break;
			    case 2:
			    	mostrarDestinos(listaDestinos,"");
			    	break;
			    case 3:
			    	gestionarDestino(scanner,listaDestinos,listaPaises,false);
			    	break;
			    case 4:
			    	listaDestinos.clear();
			    	break;
			    case 5:
			    	gestionarDestino(scanner,listaDestinos,listaPaises,true);
			    	break;
			    case 6:
			    	mostrarDestinos(listaDestinos,"sort");
			    	break;
			    case 7:
			    	mostrarPaises(listaPaises);
			    	break;
			    case 8:
			    	String codigo = ingresarCodigo(scanner,listaPaises);
			    	mostrarDestinos(listaDestinos,codigo);
			    	break;
			    case 9:
			    	System.out.println("Fin del Programa\n");
			    	break;
			    default:
			    	System.out.println("Ingrese una opción valida para continuar\n");
			}
		} while (opc!=9);
		scanner.close();
	}
	
	public static String menu() {
		return "\n1 – Alta de destino turístico\n2 – Mostrar todos los destinos turísticos\n3 – Modificar el país de un destino turístico\n" + 
				"4 – Eliminar los destinos turísticos\n5 – Eliminar un destino turístico\n6 – Mostrar los destinos turísticos ordenados por nombre\n" +
				"7 – Mostrar todos los países\n8 – Mostrar los destinos turísticos que pertenecen a un país\n9 – Salir\n";
	}
	
	public static String ingresarCadena(Scanner scanner, String frase) {
		System.out.println(frase);
		String cadena = scanner.next();
		return cadena;
	}
	
	public static int ingresarNumero(Scanner scanner, String frase) {
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
	
	
	public static double ingresarValor(Scanner scanner, String frase) { 
		double n = -1;
		do {
			System.out.println(frase);
			try {
				n = scanner.nextDouble();
	        } catch (InputMismatchException e) {
	            scanner.nextLine();
		    	System.out.println("\nIngrese una número valido para continuar\n");
		    	continue;
	        }
			if (n<=0) {
				System.out.println("\nIngreso de un número no positivo\n"); 
			}
		} while (n<=0);
		return n;
	}
	
	public static String determinarPais(int op, boolean codigo) {
		if (op==1) {
			return (codigo) ? "Argentina" : "Argentina".toUpperCase().substring(0,3);
		}
		else if(op==2) {
			return (codigo) ? "Chile" : "Chile".toUpperCase().substring(0,3);
		}
		else if(op==3) {
			return (codigo) ? "Paraguay" : "Paraguay".toUpperCase().substring(0,3);
		}
		else if (op==4) {
			return (codigo) ? "Brasil" : "Brasil".toUpperCase().substring(0,3);
		}
		else if (op==5) {
			return (codigo) ? "Uruguay" : "Uruguay".toUpperCase().substring(0,3);
		}
		else {
			return (codigo) ? "Bolivia" : "Bolivia".toUpperCase().substring(0,3);
		}
	}

	public static void mostrarPaises(List<Pais> paises) {
		if (paises.isEmpty()) {
			System.out.println("La lista de paises se encuentra vacia");
		}
		else {
			paises.forEach(pais -> System.out.println(pais.toString()));
		}
	}
	
	public static void precargarPaises(List<Pais> paises) {
		for (int i=1;i<=6;i++) {
			Pais nuevoPais = new Pais(i + determinarPais(i,false),determinarPais(i,true));
			paises.add(nuevoPais);
		}
	}
	
	public static int buscarPais(List<Pais> paises, String codigo) {
		Iterator<Pais> iteratorPaises = paises.iterator();
		int i=0;
		boolean encontrado=false;
		while (iteratorPaises.hasNext() && !encontrado) {
			Pais p = iteratorPaises.next();
			if (p.getCodigo().equalsIgnoreCase(codigo)) {
				encontrado=true;
				continue;
			}
			i++;
		}
		return (encontrado) ? i : -1;
	}
	
	public static int buscarDestino(List<DestinoTuristico> destinos, int codigo) {
		Iterator<DestinoTuristico> iteratorDestinos = destinos.iterator();
		int i=0;
		boolean encontrado=false;
		while (iteratorDestinos.hasNext() && !encontrado) {
			DestinoTuristico d = iteratorDestinos.next();
			if (d.getCodigo()==codigo) {
				encontrado=true;
				continue;
			}
			i++;
		}
		return (encontrado) ? i : -1;
	}
	
	public static String ingresarCodigo(Scanner scanner, List<Pais> paises) {
		String codigoPais;
		do {
			mostrarPaises(paises);
			codigoPais = ingresarCadena(scanner,"Ingrese código de pais: ");
			if (buscarPais(paises,codigoPais)==-1) {
				System.out.println("\nIngrese un código de pais valido para continuar\n");
			}
		} while (buscarPais(paises,codigoPais)==-1);
		return codigoPais.toUpperCase();
	}
	
	public static void altaDestino(Scanner scanner, List<DestinoTuristico> destinos, List<Pais> paises) {
		String nombreDestino = ingresarCadena(scanner,"Ingrese nombre de destino: ");
		
		int codigoDestino;
		if(destinos.size()==0) { 
			 codigoDestino = 1;
			}
		else {
			 codigoDestino = destinos.get(destinos.size()-1).getCodigo()+1;
		    }
		double precio = ingresarValor(scanner,"Ingrese precio: ");
		String codigoPais = ingresarCodigo(scanner,paises);
		Pais pais = paises.get(buscarPais(paises,codigoPais));
		int dias = ingresarNumero(scanner,"Ingrese cantidad de dias: ");
		
		DestinoTuristico destino = new DestinoTuristico(codigoDestino,nombreDestino,precio,pais,dias);
		destinos.add(destino);
	}
	
	public static void mostrarDestinos(List<DestinoTuristico> destinos, String codigoPais) {
		if (destinos.isEmpty()) {
			System.out.println("\nLa lista de destinos turísticos se encuentra vacía\n");
		}
		else {
			if (codigoPais.equals("sort")) {
				List<DestinoTuristico> copiaListaDestinos = new ArrayList<>(destinos);
				copiaListaDestinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
				copiaListaDestinos.forEach(destino -> System.out.println(destino.toString()));
			}
			else if (codigoPais.length()>0) {
				destinos.forEach(destino -> {
				    if (destino.getPais().getCodigo().equals(codigoPais)) {
				        System.out.println(destino.toString());
				    }
				});
			}
			else {
				destinos.forEach(destino -> System.out.println(destino.toString()));
			}
		}
	}
	
	public static void modificarDestino(Scanner scanner, List<DestinoTuristico> destinos, List<Pais> paises, int pos) {
		String codigoPais = ingresarCodigo(scanner,paises);
		destinos.get(pos).setPais(paises.get(buscarPais(paises,codigoPais)));
	}
	
	public static void gestionarDestino(Scanner scanner, List<DestinoTuristico> destinos, List<Pais> paises, boolean op) {
		int codigo = ingresarNumero(scanner,"Ingrese código de destino: ");
		int pos = buscarDestino(destinos,codigo);
		if (pos==-1) {
			System.out.println("\nNo se encontro el destino especificado\n");
		}
		else {
			if (op) {
				destinos.remove(pos);
			}
			else {
				modificarDestino(scanner,destinos,paises,pos);
			}
		}
	}

}