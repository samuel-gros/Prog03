package ejercicio07;

import java.util.Scanner;

public class ejercicio07 {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);
		
		int n=0,suma=0,media=0,contador=0;
		int menor, mayor;
		
		System.out.print("Introduce un número  ");
	      n=teclado.nextInt ();
	      
	      menor=n;
	      mayor=n;
	      
	      	while(n!=0){
	      		suma=suma+n;
	      		contador++;
	      		
	      	if (n>mayor)
	      		mayor=n;
	      	
	      	if (n<menor)
	      		menor=n;
	      		
	      		System.out.print("Introduce otro número  ");
	  	      n=teclado.nextInt ();	  	    
	      	}
	      	
	        media=suma/contador;
	        
	      	System.out.println ("La media es "+media);
	      	System.out.println ("El número mayor es "+ mayor );
	      	System.out.print("La número menor es "+ menor );

	}
}
