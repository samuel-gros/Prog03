package ejercicio01;

import java.util.Scanner;

public class ejercicio02 {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);
		
		 int n;
	        System.out.print("Introduce un número entero entre 1 y 100: ");
	        n=teclado.nextInt ();
	        System.out.println("Tabla del " + n);
	        
	        while (n<0 || n>100) {
	        	System.out.print("Introduce DE NUEVO un número entero entre 1 y 100: ");
		        n=teclado.nextInt ();	        
	        }
	        
	        for(int i = 1; i<=10; i++){
	             System.out.println(n + " * " + i + " = " + n*i);
	        }
	}
}