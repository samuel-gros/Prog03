package ejercicio01;

import java.util.Scanner;

public class ejercicio04 {
	private static Scanner teclado;
	 public static void main(String[] args){
	teclado = new Scanner (System.in);

	     int divisor, N;
	     boolean primo=true;
	     divisor = 2;
	     
	     System.out.print ("ingrese un nº: ");
	     N=teclado.nextInt ();
	     
	     while (primo && divisor!=N){
	    	  if (N % divisor == 0){
	    	  System.out.print ("no es primo");
	    	  N=teclado.nextInt ();
	    	  }
	    	  
	    	  else if (N % divisor != 0){
		    	  System.out.print ("es primo");
		    	  N=teclado.nextInt ();
	    	  }
	    }
	}	 
}