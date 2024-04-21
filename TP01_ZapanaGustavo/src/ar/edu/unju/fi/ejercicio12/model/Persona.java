package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	String nombre;
	Calendar fechaNac = Calendar.getInstance();
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, Calendar fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
   
	public int obtenerEdad () {
		
        Calendar hoy = Calendar.getInstance();
		int edad = hoy.get(Calendar.YEAR) - this.fechaNac.get(Calendar.YEAR);
		return edad;
		
	}

    public String obtenerSigno () {
    	
     String signo = "";
    	if(fechaNac.get(Calendar.DAY_OF_MONTH)<21 || fechaNac.get(Calendar.DAY_OF_MONTH) == 21  )
    {
	switch(fechaNac.get(Calendar.MONTH)) {
	   case 0: if(fechaNac.get(Calendar.DAY_OF_MONTH) == 21)	
		           {signo = "ACUARIO";}
	           else 
	        	   signo = "CAPRICORNIO";
	   break;
	   case 1: 	if(fechaNac.get(Calendar.DAY_OF_MONTH)==21 || fechaNac.get(Calendar.DAY_OF_MONTH)==20)
		            signo = "PISCIS";
	            else
	            	signo = "ACUARIO";
	   break;
	   case 2: if(fechaNac.get(Calendar.DAY_OF_MONTH)==21)
		            signo = "ARIES";
	           else
	        	   signo = "PISCIS";
	   break;
	   case 3: if(fechaNac.get(Calendar.DAY_OF_MONTH)==21)
                    signo = "TAURO";
	           else
	        	   signo = "ARIES";
	   break;
	   case 4: if(fechaNac.get(Calendar.DAY_OF_MONTH)==21)
                    signo = "ARIES";
	           else
		            signo = "TAURO";
	   break;
	   case 5: 	if(fechaNac.get(Calendar.DAY_OF_MONTH)==21)
                    signo = "CANCER";
	            else
	            	signo = "GEMINIS";
	   break;
	   case 6: 	signo = "CANCER";
	   break;
	   case 7: 	signo = "LEO";
	   break;
	   case 8: 	signo = "VIRGO";
	   break;
	   case 9: signo = "LIBRA";
	   break;
	   case 10: signo = "ESCORPIO";
	   break;
	   case 11: signo = "SAGITARIO";
	   break;
	}
   }
   else { 
	 if(fechaNac.get(Calendar.DAY_OF_MONTH)>21)
    {
	 switch(fechaNac.get(Calendar.MONTH)) {
	   case 0: 	signo = "ACUARIO";
	   break;
	   case 1: 	signo = "PISCIS";
	   break;
	   case 2: 	signo = "ARIES";
	   break;
	   case 3: 	signo = "TAURO";
	   break;
	   case 4: 	signo = "GEMINIS";
	   break;
	   case 5: 	signo = "CANCER";
	   break;
	   case 6: 	if(fechaNac.get(Calendar.DAY_OF_MONTH)==22)
		          signo = "CANCER";
	            else
	              signo = "LEO";
		   
	   break;
	   case 7: if(fechaNac.get(Calendar.DAY_OF_MONTH)==22 || fechaNac.get(Calendar.DAY_OF_MONTH)==23) 	
		          signo = "LEO";
	           else
	        	   signo = "VIRGO";
	   break;
	   case 8:  if(fechaNac.get(Calendar.DAY_OF_MONTH)==22) 	
		          signo = "VIRGO";
	            else
		          signo = "LIBRA";
	   break;
	   case 9:  if(fechaNac.get(Calendar.DAY_OF_MONTH)==22 || fechaNac.get(Calendar.DAY_OF_MONTH)==23)
		          signo = "LIBRA";
	            else
	              signo = "ESCORPIO";
	   break;
	   case 10: if(fechaNac.get(Calendar.DAY_OF_MONTH)==22)
			      signo = "ESCORPIO";
	            else
	            	signo = "SAGITARIO";
	   break;
	   case 11: signo = "CAPRICORNIO";
	   break;
	}
   }	
  }
    	return signo;
  }
    
    public String estacionAnio() {
		int dia = this.getFechaNac().get(Calendar.DAY_OF_MONTH),mes = this.getFechaNac().get(Calendar.MONTH)+1;
		if ((dia>=21 && mes==9) || (dia<=21 && mes==12)) {
			return "Primavera";
		}
		else if ((dia>=22 && mes==12) || (dia<=21 && mes==3)) {
			return "Verano";
		}
		else if ((dia>=22 && mes==3) || (dia<=21 && mes==6)) {
			return "Otoño";
		}
		else {
			return "Invierno";
		}
	}
    
    public void mostrarPersona () {
    	
        int edad = obtenerEdad();
		
		System.out.println("Nombre: "+ this.getNombre());
		System.out.println("Edad: "+ edad);
		
		String signo = obtenerSigno();
		
		System.out.println("Signo Zodiacal: "+signo);
	
		System.out.println("Fecha de Nacimiento: "+ this.getFechaNac().getTime());
		System.out.println("Estacion: "+estacionAnio());
	
    }
}