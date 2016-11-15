//Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero, que indicará el fin de la entrada de datos.
//El programa debe calcular y escribir la suma de los números introducidos en lugar par y de los introducidos en lugar impar, 
//es decir los introducidos primero, tercero, quinto, etc. y la suma de los introducidos segundo, cuarto, sexto, etc.

package ejercicio06;

import java.util.Scanner;

public class ejercicio06 {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);
		
		int n, sumaPar=0, sumaImpar=0;
		boolean lecturaPar = false;
		
		
		  System.out.print("Introduce un número  ");
	      n=teclado.nextInt ();
	     

	      while (n !=0 ){
	    	  
	    	  if (lecturaPar)
	    		  sumaPar=sumaPar+n;
	    	  
	    	  else 
	    		  sumaImpar=sumaImpar+n;    	
	    	  
	    	  lecturaPar = ! lecturaPar;
	    		  
	    	  System.out.print("Introduce un número  ");
	          n=teclado.nextInt ();          
	      }
    	  
          System.out.println ("la suma de los numeros impares es  "+ sumaImpar );
          System.out.println ("la suma de los numeros pares es  "+ sumaPar );
		} 
	}
