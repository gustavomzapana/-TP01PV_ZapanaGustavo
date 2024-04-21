package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		        // Declaración de variables
				int i;
				byte b=8;
				int ocupado;
				boolean terminado=false;
				
				Scanner scanner = new Scanner(System.in);
				String[] nombres = new String[5];

				for(i=0 ; i<nombres.length ; i++) {
					System.out.println("Ingrese un nombre: ");
					nombres[i]=scanner.next();
				}
				i=0;
				while(i<nombres.length) {
					System.out.println("Indice: "+ i + "| Nombre almacenado: "+ nombres[i] );
					i++;
				}

				System.out.println("Tamaño del Array: " + nombres.length);
				
				ocupado=nombres.length-1;
				//Eliminar Nombres
				do {
					if(ocupado!=-1) {//lista vacia
						System.out.println("Ingrese un Numero entre el 0 al 4 para eliminar. si deseea salir ingrese 9");
						b=scanner.nextByte();
						
						if(b==9) {//para salir
							terminado=true;
							
						}else {
							if(b<=ocupado && terminado==false) {
								if(b==0) {//primer indice
									for(i = 0 ; i<ocupado ; i++) {
										nombres[i]=nombres[i+1];
									}
									nombres[ocupado]="";
									ocupado--;
									//mostrar
									i=0;
									while(i<nombres.length) {
										System.out.println("["+i+"] = "+nombres[i]);
										i++;
									}
									//fin mostrar
								}else {
									if(b==ocupado) {//ultimo indice
										nombres[b]="";
										ocupado--;
										//mostrar
										i=0;
										while(i<nombres.length) {
											System.out.println("["+i+"] = "+nombres[i]);
											i++;
										}
										//fin mostrar
									}else {
										//no es ni el primer ni el ultimo indice
										for(i=b;i<ocupado;i++) {
											nombres[i]=nombres[i+1];
										}
										nombres[ocupado]="";
										ocupado--;
										//mostrar
										i=0;
										while(i<nombres.length) {
											System.out.println("["+i+"] = "+nombres[i]);
											i++;
										}
										//fin mostrar
									}
								}
							}else {
								System.out.println("Ingrese un numero valido");
							}
						}

					}else {
						System.out.println("Lista vacia");
						b=9;
					}
				}while(b!=9 && !terminado);
				System.out.println("Aplicación finalizada.");
			}
}
		
	


